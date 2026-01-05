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

package org.jpos.kafka.lifecycle;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Synchronizes asynchronous startup with configurable timeout.
 *
 * <p>Uses CountDownLatch to coordinate startup between initiator thread and
 * async startup process (e.g., Kafka Streams state transitions).
 *
 * <p>Example usage with Kafka Streams:
 * <pre>
 * StartupSynchronizer sync = new StartupSynchronizer(60, TimeUnit.SECONDS);
 *
 * streams.setStateListener((newState, oldState) -&gt; {
 *     if (newState == KafkaStreams.State.RUNNING) {
 *         sync.signalReady();
 *     } else if (newState == KafkaStreams.State.ERROR) {
 *         sync.signalError("Kafka Streams entered ERROR state");
 *     }
 * });
 *
 * streams.start();
 *
 * try {
 *     sync.await(); // Blocks until RUNNING or timeout
 * } catch (StartupTimeoutException e) {
 *     // Handle timeout
 * }
 * </pre>
 */
public class StartupSynchronizer {
    private final CountDownLatch latch = new CountDownLatch(1);
    private final long timeoutValue;
    private final TimeUnit timeoutUnit;
    private final AtomicBoolean ready = new AtomicBoolean(false);
    private final AtomicBoolean error = new AtomicBoolean(false);
    private final AtomicReference<String> errorMessage = new AtomicReference<>();

    /**
     * Create a startup synchronizer with timeout.
     * @param timeout timeout value
     * @param unit timeout unit
     */
    public StartupSynchronizer(long timeout, TimeUnit unit) {
        this.timeoutValue = timeout;
        this.timeoutUnit = unit;
    }

    /**
     * Signal that component is ready.
     */
    public void signalReady() {
        ready.set(true);
        latch.countDown();
    }

    /**
     * Signal that component encountered an error.
     * @param message error message
     */
    public void signalError(String message) {
        error.set(true);
        errorMessage.set(message);
        latch.countDown();
    }

    /**
     * Signal that component encountered an error.
     */
    public void signalError() {
        signalError("Startup failed");
    }

    /**
     * Wait for component to be ready or error.
     * @throws StartupException if startup fails
     * @throws InterruptedException if interrupted while waiting
     */
    public void await() throws StartupException, InterruptedException {
        boolean completed = latch.await(timeoutValue, timeoutUnit);

        if (!completed) {
            throw new StartupTimeoutException(
                "Startup did not complete within " + timeoutValue + " " + timeoutUnit
            );
        }

        if (error.get()) {
            throw new StartupFailedException(
                errorMessage.get() != null ? errorMessage.get() : "Startup failed"
            );
        }

        if (!ready.get()) {
            throw new StartupException("Startup completed but ready flag not set");
        }
    }

    /**
     * Check if ready.
     * @return true if ready
     */
    public boolean isReady() {
        return ready.get();
    }

    /**
     * Check if error occurred.
     * @return true if error
     */
    public boolean isError() {
        return error.get();
    }

    /**
     * Get error message.
     * @return error message or null
     */
    public String getErrorMessage() {
        return errorMessage.get();
    }

    /**
     * Base exception for startup failures.
     */
    public static class StartupException extends Exception {
        public StartupException(String message) {
            super(message);
        }

        public StartupException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    /**
     * Exception thrown when startup times out.
     */
    public static class StartupTimeoutException extends StartupException {
        public StartupTimeoutException(String message) {
            super(message);
        }
    }

    /**
     * Exception thrown when startup fails.
     */
    public static class StartupFailedException extends StartupException {
        public StartupFailedException(String message) {
            super(message);
        }

        public StartupFailedException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
