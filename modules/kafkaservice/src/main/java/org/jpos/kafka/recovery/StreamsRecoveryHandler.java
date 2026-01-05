/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.kafka.recovery;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.errors.StreamsUncaughtExceptionHandler;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Kafka Streams-specific error recovery orchestration.
 *
 * <p>Integrates with Kafka Streams' error handling mechanisms:
 * <ul>
 *   <li>UncaughtExceptionHandler for thread replacement strategy</li>
 *   <li>StateListener for recovery detection</li>
 *   <li>Circuit breaker for limiting auto-restart attempts</li>
 *   <li>Terminal state detection (fail fast on ERROR/NOT_RUNNING)</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * StreamsRecoveryHandler recovery = new StreamsRecoveryHandler(3);
 *
 * streams.setUncaughtExceptionHandler(recovery.createExceptionHandler());
 * streams.setStateListener(recovery.createStateListener());
 *
 * streams.start();
 * </pre>
 */
public class StreamsRecoveryHandler {
    private final CircuitBreaker circuitBreaker;
    private final AtomicInteger errorCount;
    private final int maxAutoRestarts;

    /**
     * Create a recovery handler with maximum auto-restart attempts.
     * @param maxAutoRestarts maximum number of auto-restarts (default: 3)
     */
    public StreamsRecoveryHandler(int maxAutoRestarts) {
        this.maxAutoRestarts = maxAutoRestarts;
        this.errorCount = new AtomicInteger(0);
        this.circuitBreaker = CircuitBreaker.builder()
            .failureThreshold(maxAutoRestarts)
            .build();
    }

    /**
     * Create UncaughtExceptionHandler for Kafka Streams.
     * @return StreamsUncaughtExceptionHandler instance
     */
    public StreamsUncaughtExceptionHandler createExceptionHandler() {
        return exception -> {
            int errors = errorCount.incrementAndGet();

            if (errors <= maxAutoRestarts) {
                // Attempt recovery by replacing thread
                return StreamsUncaughtExceptionHandler.StreamThreadExceptionResponse.REPLACE_THREAD;
            } else {
                // Max restarts exceeded - shutdown
                return StreamsUncaughtExceptionHandler.StreamThreadExceptionResponse.SHUTDOWN_APPLICATION;
            }
        };
    }

    /**
     * Create StateListener for Kafka Streams.
     * @return KafkaStreams.StateListener instance
     */
    public KafkaStreams.StateListener createStateListener() {
        return (newState, oldState) -> {
            if (newState == KafkaStreams.State.RUNNING) {
                // Successfully recovered - reset error count
                errorCount.set(0);
                circuitBreaker.reset();
            } else if (isTerminal(newState)) {
                // Terminal state - trip circuit breaker
                circuitBreaker.trip();
            }
        };
    }

    /**
     * Check if a state is terminal (ERROR or NOT_RUNNING).
     * @param state the state to check
     * @return true if terminal
     */
    public boolean isTerminal(KafkaStreams.State state) {
        return state == KafkaStreams.State.ERROR || state == KafkaStreams.State.NOT_RUNNING;
    }

    /**
     * Get current error count.
     * @return error count
     */
    public int getErrorCount() {
        return errorCount.get();
    }

    /**
     * Get circuit breaker instance.
     * @return CircuitBreaker
     */
    public CircuitBreaker getCircuitBreaker() {
        return circuitBreaker;
    }

    /**
     * Reset recovery handler state.
     */
    public void reset() {
        errorCount.set(0);
        circuitBreaker.reset();
    }

    /**
     * Check if recovery should be attempted.
     * @param currentState current Kafka Streams state
     * @return true if should attempt recovery
     */
    public boolean shouldAttemptRecovery(KafkaStreams.State currentState) {
        // Don't attempt recovery if in terminal state or circuit is open
        if (isTerminal(currentState) || circuitBreaker.isOpen()) {
            return false;
        }

        // Check if we've exceeded max restarts
        return errorCount.get() < maxAutoRestarts;
    }
}
