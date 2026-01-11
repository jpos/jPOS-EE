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
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/**
 * Configurable retry policy with exponential backoff.
 *
 * <p>Features:
 * <ul>
 *   <li>Exponential backoff with configurable multiplier</li>
 *   <li>Jitter for distributed systems</li>
 *   <li>Exception-based retry filtering</li>
 *   <li>Maximum delay cap</li>
 *   <li>Interrupt handling</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * RetryPolicy policy = RetryPolicy.builder()
 *     .maxAttempts(3)
 *     .initialDelay(Duration.ofMillis(100))
 *     .backoffMultiplier(2.0)
 *     .maxDelay(Duration.ofSeconds(5))
 *     .retryOn(InvalidStateStoreException.class)
 *     .build();
 *
 * String result = policy.execute(() -&gt; performOperation());
 * </pre>
 */
public class RetryPolicy {
    private final int maxAttempts;
    private final Duration initialDelay;
    private final double backoffMultiplier;
    private final Duration maxDelay;
    private final boolean useJitter;
    private final Set<Class<? extends Exception>> retryableExceptions;
    private final Set<Class<? extends Exception>> nonRetryableExceptions;
    private final Supplier<Boolean> runningCondition;

    private RetryPolicy(Builder builder) {
        this.maxAttempts = builder.maxAttempts;
        this.initialDelay = builder.initialDelay;
        this.backoffMultiplier = builder.backoffMultiplier;
        this.maxDelay = builder.maxDelay;
        this.useJitter = builder.useJitter;
        this.retryableExceptions = builder.retryableExceptions;
        this.nonRetryableExceptions = builder.nonRetryableExceptions;
        this.runningCondition = builder.runningCondition;
    }

    /**
     * Execute an operation with retry logic.
     * @param operation the operation to execute
     * @param <T> return type
     * @return the result of the operation
     * @throws Exception if all retry attempts fail
     */
    public <T> T execute(Callable<T> operation) throws Exception {
        Exception lastException = null;
        long delayMs = initialDelay.toMillis();

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            // Check if we should continue running before each attempt
            if (runningCondition != null && !runningCondition.get()) {
                throw new InterruptedException("Retry aborted - system is shutting down");
            }

            try {
                return operation.call();
            } catch (Exception e) {
                lastException = e;

                if (!shouldRetry(e, attempt)) {
                    throw e;
                }

                if (attempt < maxAttempts) {
                    // Check running condition before sleeping
                    if (runningCondition != null && !runningCondition.get()) {
                        throw new InterruptedException("Retry aborted - system is shutting down");
                    }
                    sleep(delayMs);
                    delayMs = calculateNextDelay(delayMs);
                }
            }
        }

        throw lastException;
    }

    /**
     * Execute a void operation with retry logic.
     * @param operation the operation to execute
     * @throws Exception if all retry attempts fail
     */
    public void execute(Runnable operation) throws Exception {
        execute(() -> {
            operation.run();
            return null;
        });
    }

    /**
     * Check if an exception should be retried.
     * @param exception the exception
     * @param attempt current attempt number
     * @return true if should retry
     */
    private boolean shouldRetry(Exception exception, int attempt) {
        if (attempt >= maxAttempts) {
            return false;
        }

        // Check non-retryable exceptions first
        if (!nonRetryableExceptions.isEmpty()) {
            for (Class<? extends Exception> exceptionClass : nonRetryableExceptions) {
                if (exceptionClass.isInstance(exception)) {
                    return false;
                }
            }
        }

        // If retryable exceptions specified, check if exception matches
        if (!retryableExceptions.isEmpty()) {
            for (Class<? extends Exception> exceptionClass : retryableExceptions) {
                if (exceptionClass.isInstance(exception)) {
                    return true;
                }
            }
            return false; // Not in retryable list
        }

        // No filters specified - retry all exceptions
        return true;
    }

    /**
     * Calculate next delay with exponential backoff and optional jitter.
     * @param currentDelayMs current delay in milliseconds
     * @return next delay in milliseconds
     */
    private long calculateNextDelay(long currentDelayMs) {
        long nextDelay = (long) (currentDelayMs * backoffMultiplier);

        if (useJitter) {
            // Add random jitter (0-25% of delay)
            long jitter = ThreadLocalRandom.current().nextLong(0, nextDelay / 4);
            nextDelay += jitter;
        }

        // Cap at max delay
        long maxDelayMs = maxDelay.toMillis();
        return Math.min(nextDelay, maxDelayMs);
    }

    /**
     * Sleep for specified duration, handling interrupts.
     * @param delayMs delay in milliseconds
     * @throws InterruptedException if interrupted
     */
    private void sleep(long delayMs) throws InterruptedException {
        Thread.sleep(delayMs);
    }

    /**
     * Create a new builder.
     * @return Builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for RetryPolicy.
     */
    public static class Builder {
        private int maxAttempts = 3;
        private Duration initialDelay = Duration.ofMillis(100);
        private double backoffMultiplier = 2.0;
        private Duration maxDelay = Duration.ofSeconds(30);
        private boolean useJitter = true;
        private Set<Class<? extends Exception>> retryableExceptions = new HashSet<>();
        private Set<Class<? extends Exception>> nonRetryableExceptions = new HashSet<>();
        private Supplier<Boolean> runningCondition;

        /**
         * Set maximum number of retry attempts.
         * @param maxAttempts max attempts (default: 3)
         * @return this builder
         */
        public Builder maxAttempts(int maxAttempts) {
            if (maxAttempts < 1) {
                throw new IllegalArgumentException("maxAttempts must be >= 1");
            }
            this.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * Set initial delay before first retry.
         * @param initialDelay initial delay (default: 100ms)
         * @return this builder
         */
        public Builder initialDelay(Duration initialDelay) {
            this.initialDelay = initialDelay;
            return this;
        }

        /**
         * Set backoff multiplier for exponential backoff.
         * @param multiplier backoff multiplier (default: 2.0)
         * @return this builder
         */
        public Builder backoffMultiplier(double multiplier) {
            if (multiplier < 1.0) {
                throw new IllegalArgumentException("backoffMultiplier must be >= 1.0");
            }
            this.backoffMultiplier = multiplier;
            return this;
        }

        /**
         * Set maximum delay between retries.
         * @param maxDelay max delay (default: 30s)
         * @return this builder
         */
        public Builder maxDelay(Duration maxDelay) {
            this.maxDelay = maxDelay;
            return this;
        }

        /**
         * Enable or disable jitter.
         * @param useJitter whether to use jitter (default: true)
         * @return this builder
         */
        public Builder useJitter(boolean useJitter) {
            this.useJitter = useJitter;
            return this;
        }

        /**
         * Add an exception type to retry on.
         * @param exceptionClass exception class
         * @return this builder
         */
        public Builder retryOn(Class<? extends Exception> exceptionClass) {
            this.retryableExceptions.add(exceptionClass);
            return this;
        }

        /**
         * Add an exception type to NOT retry on.
         * @param exceptionClass exception class
         * @return this builder
         */
        public Builder doNotRetryOn(Class<? extends Exception> exceptionClass) {
            this.nonRetryableExceptions.add(exceptionClass);
            return this;
        }

        /**
         * Set running condition to check before each retry attempt.
         * If the condition returns false, retries will be aborted with InterruptedException.
         * @param runningCondition supplier returning true if retries should continue
         * @return this builder
         */
        public Builder runningCondition(Supplier<Boolean> runningCondition) {
            this.runningCondition = runningCondition;
            return this;
        }

        /**
         * Build the RetryPolicy.
         * @return RetryPolicy instance
         */
        public RetryPolicy build() {
            return new RetryPolicy(this);
        }
    }
}
