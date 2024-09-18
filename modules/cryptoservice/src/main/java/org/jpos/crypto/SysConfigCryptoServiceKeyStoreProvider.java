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

import org.jpos.ee.DB;
import org.jpos.sysconfig.SysConfigManager;

public class SysConfigCryptoServiceKeyStoreProvider implements CryptoServiceKeyStoreProvider {
    @Override
    public void put(String id, String value) throws CryptoServiceKeyStoreException {
        try {
            DB.execWithTransaction(db -> {
                SysConfigManager mgr = new SysConfigManager(db, "key.");
                if (mgr.get(id, null) != null)
                    throw new KeyAlreadyExistsException();
                
                mgr.put(id, value);
                return true;
            });
        } catch (Exception e) {
            throw new CryptoServiceKeyStoreException(e);
        }
    }

    @Override
    public String get(String id) throws CryptoServiceKeyStoreException {
        try {
            return DB.execWithTransaction(db -> {
                SysConfigManager mgr = new SysConfigManager(db, "key.");
                return mgr.get(id, null);
            });
        } catch (Exception e) {
            throw new CryptoServiceKeyStoreException(e);
        }
    }
}
