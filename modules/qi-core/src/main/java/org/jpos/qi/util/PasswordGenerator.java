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

package org.jpos.qi.util;

import java.security.SecureRandom;

/**
 * Created by spr on 5/18/16.
 */
public class PasswordGenerator {
    public static final char[] CHARTAB = {
            '1','2','3','4','5','6','7','8','9','0','A','B','C','D','E',
            'F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
            'U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i',
            'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x',
            'y','z', '-', '=', '#', '@', '_', '!'
    };

    public static String generateRandomPassword(int len) {
        SecureRandom sr=new SecureRandom();
        StringBuilder sb=new StringBuilder(len);
        for(int i=0; i<len; i++) {
            sb.append(CHARTAB[sr.nextInt(CHARTAB.length)]);
        }
        return(sb.toString());
    }
    public static String generateRandomPassword() {
        SecureRandom sr=new SecureRandom();
        return generateRandomPassword(8 + sr.nextInt(8));
    }
}
