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

import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Circuit breaker pattern implementation for preventing cascading failures.
 *
 * <p>States:
 * <ul>
 *   <li><strong>CLOSED</strong> - Normal operation, requests pass through</li>
 *   <li><strong>OPEN</strong> - Too many failures, requests fail fast</li>
 *   <li><strong>HALF_OPEN</strong> - Testing if service recovered</li>
 * </ul>
 *
 * <p>State transitions:
 * <pre>
 * CLOSED → OPEN         : When failure threshold exceeded
 * OPEN → HALF_OPEN      : After reset timeout
 * HALF_OPEN → CLOSED    : When test request succeeds
 * HALF_OPEN → OPEN      : When test request fails
 * </pre>
 *
 * <p>Example usage:
 * <pre>
 * CircuitBreaker breaker = CircuitBreaker.builder()
 *     .failureThreshold(3)
 *     .resetTimeout(Duration.ofMinutes(1))
 *     .halfOpenMaxAttempts(1)
 *     .build();
 *
 * String result = breaker.execute(() -&gt; callExternalService());
 * </pre>
 */
public class CircuitBreaker {
    private final int failureThreshold;
    private final Duration resetTimeout;
    private final int halfOpenMaxAttempts;

    private final AtomicReference<State> state = new AtomicReference<>(State.CLOSED);
    private final AtomicInteger failureCount = new AtomicInteger(0);
    private final AtomicInteger halfOpenAttempts = new AtomicInteger(0);
    private final AtomicLong lastFailureTime = new AtomicLong(0);

    /**
     * Circuit breaker states.
     */
    public enum State {
        CLOSED,
        OPEN,
        HALF_OPEN
    }

    private CircuitBreaker(Builder builder) {
        this.failureThreshold = builder.failureThreshold;
        this.resetTimeout = builder.resetTimeout;
        this.halfOpenMaxAttempts = builder.halfOpenMaxAttempts;
    }

    /**
     * Execute an operation with circuit breaker protection.
     * @param operation the operation to execute
     * @param <T> return type
     * @return the result of the operation
     * @throws Exception if operation fails or circuit is open
     */
    public <T> T execute(Callable<T> operation) throws Exception {
        State currentState = checkAndUpdateState();

        if (currentState == State.OPEN) {
            throw new CircuitBreakerOpenException("Circuit breaker is OPEN");
        }

        try {
            T result = operation.call();
            onSuccess();
            return result;
        } catch (Exception e) {
            onFailure();
            throw e;
        }
    }

    /**
     * Execute a void operation with circuit breaker protection.
     * @param operation the operation to execute
     * @throws Exception if operation fails or circuit is open
     */
    public void execute(Runnable operation) throws Exception {
        execute(() -> {
            operation.run();
            return null;
        });
    }

    /**
     * Increment failure count and check if threshold exceeded.
     * @return true if failure threshold exceeded
     */
    public boolean incrementAndCheck() {
        int failures = failureCount.incrementAndGet();
        lastFailureTime.set(System.currentTimeMillis());

        if (failures >= failureThreshold) {
            trip();
            return false; // Circuit open, do not retry
        }
        return true; // Can retry
    }

    /**
     * Reset the circuit breaker to CLOSED state.
     */
    public void reset() {
        state.set(State.CLOSED);
        failureCount.set(0);
        halfOpenAttempts.set(0);
    }

    /**
     * Manually trip the circuit breaker to OPEN state.
     */
    public void trip() {
        state.set(State.OPEN);
    }

    /**
     * Get the current state.
     * @return current State
     */
    public State getState() {
        return checkAndUpdateState();
    }

    /**
     * Get the current failure count.
     * @return failure count
     */
    public int getFailureCount() {
        return failureCount.get();
    }

    /**
     * Check if circuit is open.
     * @return true if state is OPEN
     */
    public boolean isOpen() {
        return getState() == State.OPEN;
    }

    /**
     * Check and update state based on current conditions.
     * @return current State after update
     */
    private State checkAndUpdateState() {
        State currentState = state.get();

        if (currentState == State.OPEN) {
            long timeSinceFailure = System.currentTimeMillis() - lastFailureTime.get();
            if (timeSinceFailure >= resetTimeout.toMillis()) {
                // Try to transition to HALF_OPEN
                if (state.compareAndSet(State.OPEN, State.HALF_OPEN)) {
                    halfOpenAttempts.set(0);
                    return State.HALF_OPEN;
                }
            }
        }

        return state.get();
    }

    /**
     * Handle successful operation.
     */
    private void onSuccess() {
        State currentState = state.get();

        if (currentState == State.HALF_OPEN) {
            // Success in half-open state - close the circuit
            reset();
        } else if (currentState == State.CLOSED) {
            // Reset failure count on successful operation
            failureCount.set(0);
        }
    }

    /**
     * Handle failed operation.
     */
    private void onFailure() {
        State currentState = state.get();

        if (currentState == State.HALF_OPEN) {
            int attempts = halfOpenAttempts.incrementAndGet();
            if (attempts >= halfOpenMaxAttempts) {
                // Failed in half-open state - reopen the circuit
                trip();
            }
        } else if (currentState == State.CLOSED) {
            int failures = failureCount.incrementAndGet();
            lastFailureTime.set(System.currentTimeMillis());

            if (failures >= failureThreshold) {
                // Threshold exceeded - open the circuit
                trip();
            }
        }
    }

    /**
     * Create a new builder.
     * @return Builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for CircuitBreaker.
     */
    public static class Builder {
        private int failureThreshold = 3;
        private Duration resetTimeout = Duration.ofMinutes(1);
        private int halfOpenMaxAttempts = 1;

        /**
         * Set failure threshold before opening circuit.
         * @param threshold failure threshold (default: 3)
         * @return this builder
         */
        public Builder failureThreshold(int threshold) {
            if (threshold < 1) {
                throw new IllegalArgumentException("failureThreshold must be >= 1");
            }
            this.failureThreshold = threshold;
            return this;
        }

        /**
         * Set reset timeout for transitioning from OPEN to HALF_OPEN.
         * @param timeout reset timeout (default: 1 minute)
         * @return this builder
         */
        public Builder resetTimeout(Duration timeout) {
            this.resetTimeout = timeout;
            return this;
        }

        /**
         * Set maximum attempts in HALF_OPEN state.
         * @param maxAttempts max attempts (default: 1)
         * @return this builder
         */
        public Builder halfOpenMaxAttempts(int maxAttempts) {
            if (maxAttempts < 1) {
                throw new IllegalArgumentException("halfOpenMaxAttempts must be >= 1");
            }
            this.halfOpenMaxAttempts = maxAttempts;
            return this;
        }

        /**
         * Build the CircuitBreaker.
         * @return CircuitBreaker instance
         */
        public CircuitBreaker build() {
            return new CircuitBreaker(this);
        }
    }

    /**
     * Exception thrown when circuit breaker is open.
     */
    public static class CircuitBreakerOpenException extends Exception {
        public CircuitBreakerOpenException(String message) {
            super(message);
        }
    }
}
