/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

package org.jpos.qrest.crud.participant;

/**
 * Simplified CRUD participant for entities that serve as both the ORM entity and DTO.
 * <p>
 * This class is a convenience wrapper around {@link CRUD} where the same type {@code T}
 * is used for:
 * </p>
 * <ul>
 *   <li>Persistence (JPA-managed ORM entity)</li>
 *   <li>Input DTO (deserialization of JSON requests)</li>
 *   <li>Output DTO (serialization of JSON responses)</li>
 * </ul>
 *
 * <p>
 * It is ideal for use with entities that are annotated with both JPA and
 * serialization-related annotations (e.g., Jackson or JSON-B).
 * </p>
 *
 * <h2>Usage</h2>
 * <pre>{@code
 * public class CountryCRUD extends SimpleCRUD<Country> { }
 * }</pre>
 *
 * <p>
 * When using this class, ensure your entity:
 * </p>
 * <ul>
 *   <li>Is annotated with JPA annotations like {@code @Entity}, {@code @Id}, etc.</li>
 *   <li>Has appropriate JSON annotations (e.g., {@code @JsonProperty}) if needed.</li>
 * </ul>
 *
 * @param <T> the type of the entity used for ORM, input, and output.
 * @see CRUD
 * @author jPOS
 * @since 3.0.1
 */
public class SimpleCRUD<T> extends CRUD<T, T, T> { }
