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

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Orchestrates graceful shutdown of multiple components.
 *
 * <p>Features:
 * <ul>
 *   <li>Ordered shutdown sequence (FIFO registration)</li>
 *   <li>Per-component timeout</li>
 *   <li>Resource cleanup tracking</li>
 *   <li>Error aggregation</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 * ShutdownCoordinator shutdown = new ShutdownCoordinator()
 *     .register("consumer", consumer::close, Duration.ofSeconds(10))
 *     .register("producer", producer::close, Duration.ofSeconds(5))
 *     .register("streams", streams::close, Duration.ofSeconds(30));
 *
 * ShutdownResult result = shutdown.executeShutdown();
 * if (!result.isSuccessful()) {
 *     // Handle errors
 * }
 * </pre>
 */
public class ShutdownCoordinator {
    private final Map<String, ShutdownTask> tasks = new LinkedHashMap<>();

    /**
     * Register a component for shutdown.
     * @param name component name
     * @param shutdownAction action to execute on shutdown
     * @param timeout timeout for this component
     * @return this coordinator for chaining
     */
    public ShutdownCoordinator register(String name, Runnable shutdownAction, Duration timeout) {
        tasks.put(name, new ShutdownTask(name, shutdownAction, timeout));
        return this;
    }

    /**
     * Register a component with default timeout (30 seconds).
     * @param name component name
     * @param shutdownAction action to execute on shutdown
     * @return this coordinator for chaining
     */
    public ShutdownCoordinator register(String name, Runnable shutdownAction) {
        return register(name, shutdownAction, Duration.ofSeconds(30));
    }

    /**
     * Execute shutdown sequence for all registered components.
     * @return ShutdownResult with status and errors
     */
    public ShutdownResult executeShutdown() {
        List<String> errors = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (ShutdownTask task : tasks.values()) {
            try {
                task.execute();
            } catch (Exception e) {
                errors.add(task.name + ": " + e.getMessage());
            }
        }

        long duration = System.currentTimeMillis() - startTime;
        return new ShutdownResult(errors.isEmpty(), errors, duration);
    }

    /**
     * Clear all registered tasks.
     */
    public void clear() {
        tasks.clear();
    }

    /**
     * Internal shutdown task.
     */
    private static class ShutdownTask {
        private final String name;
        private final Runnable action;
        private final Duration timeout;

        ShutdownTask(String name, Runnable action, Duration timeout) {
            this.name = name;
            this.action = action;
            this.timeout = timeout;
        }

        void execute() throws Exception {
            Thread shutdownThread = new Thread(() -> {
                try {
                    action.run();
                } catch (Exception e) {
                    throw new RuntimeException("Shutdown failed for " + name, e);
                }
            }, "shutdown-" + name);

            shutdownThread.start();

            try {
                shutdownThread.join(timeout.toMillis());
                if (shutdownThread.isAlive()) {
                    shutdownThread.interrupt();
                    throw new Exception("Shutdown timeout for " + name + " (timeout: " + timeout + ")");
                }
            } catch (InterruptedException e) {
                shutdownThread.interrupt();
                throw new Exception("Shutdown interrupted for " + name, e);
            }
        }
    }

    /**
     * Result of shutdown execution.
     */
    public static class ShutdownResult {
        private final boolean successful;
        private final List<String> errors;
        private final long durationMs;

        ShutdownResult(boolean successful, List<String> errors, long durationMs) {
            this.successful = successful;
            this.errors = errors;
            this.durationMs = durationMs;
        }

        /**
         * Check if shutdown was successful.
         * @return true if no errors occurred
         */
        public boolean isSuccessful() {
            return successful;
        }

        /**
         * Get list of error messages.
         * @return error messages (empty if successful)
         */
        public List<String> getErrors() {
            return errors;
        }

        /**
         * Get shutdown duration in milliseconds.
         * @return duration
         */
        public long getDurationMs() {
            return durationMs;
        }

        @Override
        public String toString() {
            if (successful) {
                return "Shutdown successful (" + durationMs + "ms)";
            } else {
                return "Shutdown failed with " + errors.size() + " error(s): " + String.join("; ", errors);
            }
        }
    }
}
