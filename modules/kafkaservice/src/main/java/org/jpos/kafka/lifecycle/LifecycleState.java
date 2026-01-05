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

/**
 * Lifecycle states for Kafka QBeans.
 *
 * <p>State transitions follow this flow:
 * <pre>
 * UNINITIALIZED → CONFIGURED → INITIALIZED → STARTING → RUNNING → STOPPING → STOPPED
 *                                                  ↓
 *                                              ERROR
 * </pre>
 */
public enum LifecycleState {
    /**
     * Initial state before configuration.
     */
    UNINITIALIZED,

    /**
     * Configuration loaded but not yet initialized.
     */
    CONFIGURED,

    /**
     * Initialization in progress.
     */
    INITIALIZING,

    /**
     * Initialization complete, ready to start.
     */
    INITIALIZED,

    /**
     * Startup in progress.
     */
    STARTING,

    /**
     * Running and operational.
     */
    RUNNING,

    /**
     * Shutdown in progress.
     */
    STOPPING,

    /**
     * Stopped cleanly.
     */
    STOPPED,

    /**
     * Error state - component is not functional.
     */
    ERROR;

    /**
     * Check if this state represents a terminal failure state.
     * @return true if ERROR state
     */
    public boolean isError() {
        return this == ERROR;
    }

    /**
     * Check if this state represents an operational state.
     * @return true if RUNNING state
     */
    public boolean isRunning() {
        return this == RUNNING;
    }

    /**
     * Check if this state represents a stopped state.
     * @return true if STOPPED or ERROR state
     */
    public boolean isStopped() {
        return this == STOPPED || this == ERROR;
    }
}
