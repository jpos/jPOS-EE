/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2016 Alejandro P. Revilla
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

package org.jpos.gl.rule;

import java.math.BigDecimal;

/**
 * Check that composite account's balance (in reporting currency) is not greater than the ruleinfo param.
 *
 * @author <a href="mailto:apr@jpos.org">Alejandro Revilla</a>
 * @see org.jpos.gl.JournalRule
 * @see org.jpos.gl.RuleInfo
 */
public class CompositeMaxBalance extends CompositeBalance {
    protected String getRuleName() {
        return "CompositeMaxBalance";
    }
    protected boolean isError
        (BigDecimal balance, BigDecimal maxBalance)
    {
        return balance.compareTo (maxBalance) > 0;
    }
}

