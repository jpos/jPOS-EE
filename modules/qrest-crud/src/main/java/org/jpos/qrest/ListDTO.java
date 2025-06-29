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

package org.jpos.qrest;

import java.util.List;

public class ListDTO {

    private Integer total;
    private Boolean hasNext;
    private Integer limit;
    private Integer offset;
    private List data;

    public ListDTO() {
    }

    public ListDTO(Integer total, Integer limit, Integer offset, List data) {
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.data = data;
    }

    public ListDTO(Integer total, Integer limit, Integer offset, List data, Boolean hasNext) {
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.data = data;
        this.hasNext = hasNext;

    }

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public List getData() {
        return data;
    }
    public void setData(List data) {
        this.data = data;
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

}
