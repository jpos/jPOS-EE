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

package org.jpos.qi.minigl;

import com.vaadin.data.Binder;
import org.jpos.ee.BLException;
import org.jpos.ee.DB;
import org.jpos.gl.Journal;
import org.jpos.gl.Layer;
import org.jpos.qi.QI;
import org.jpos.qi.QIHelper;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class LayersHelper extends QIHelper {
    private Journal selectedJournal;

    protected LayersHelper() {
        super(Layer.class);
    }

    @Override
    public Stream getAll(int offset, int limit, Map<String, Boolean> orders) throws Exception {
        List<Layer> all = DB.exec(db -> {
            LayerManager mgr = new LayerManager(db);
            return mgr.getAll(offset,limit,orders);
        });
        return all.stream();
    }

    @Override
    public int getItemCount() throws Exception {
        return DB.exec(db -> {
            LayerManager mgr = new LayerManager(db);
            return mgr.getItemCount();
        });
    }

    @Override
    public String getItemId(Object item) {
        return String.valueOf(((Layer)item).getId());
    }

    @Override
    public boolean updateEntity (Binder binder) throws BLException {
        try {
            return DB.execWithTransaction((db) -> {
                Layer oldLayer = (Layer) ((Layer) getOriginalEntity()).clone();
                binder.writeBean(getOriginalEntity());
                Layer l = (Layer) getOriginalEntity();
                db.session().merge(l);
                return addRevisionUpdated(db, getEntityName(),
                        String.valueOf(l.getId()),
                        oldLayer,
                        l,
                        new String[]{"id", "journal", "name"});
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return false;
        }
    }

    public Object getEntityByParam (String param)  {
        //most id are longs, if id is of other type this method must be overridden
        Journal j = selectedJournal;
        if (j != null) {
            try {
                return DB.exec(db -> {
                    db.session().refresh(j);
                    for (Layer layer : (Set<Layer>)j.getLayers()) {
                        if (layer.getId() == Short.parseShort(param))
                            return layer;
                    }
                    return null;
                });
            } catch (Exception e) {
                getApp().getLog().error(e);
                return null;
            }
        }
        return null;
    }

    public List<Journal> getAllJournals() {
        try {
            return DB.exec(db -> {
                JournalManager mgr = new JournalManager(db);
                return mgr.getAll();
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public Journal getJournal (String journalId) throws Exception {
        if (selectedJournal != null)
            return selectedJournal;
        selectedJournal = DB.exec(db -> {
            JournalManager mgr = new JournalManager(db);
            return mgr.getItemByParam("id",journalId,false);
        });
        return selectedJournal;
    }

    public void setSelectedJournal(Journal selectedJournal) {
        this.selectedJournal = selectedJournal;
    }
}
