/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
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

package org.jpos.crypto;

/**
 * Key store
 */
public interface CryptoServiceKeyStoreProvider {
    /**
     * Places an encrypted key in the store.
     *
     * @param id key Id
     * @param value key value
     * @throws KeyAlreadyExistsException if id already exists in the store.
     */
    void put(String id, String value) throws CryptoServiceKeyStoreException;

    /**
     * Get key value
     * @param id key Id
     * @return key's value or null
     */
    String get (String id) throws CryptoServiceKeyStoreException;
}
