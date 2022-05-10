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

package org.jpos.qi.system;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.jdbc.Work;
import org.jdom2.Element;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.ee.DB;
import org.jpos.qi.QI;

import java.sql.*;
import java.util.Date;
import java.util.List;

/**
 * Executes Native SQL queries and returns formatted results as String
 * @author Sumeet Phadnis
 *
 * Sample configuration:
 *
 *       <object class="org.jpos.qi.system.SQLQueryObject">
 *         <query maxRows="10" title="Header for Results"><![CDATA[
 *           select col1 as "Column 1", col2 as "Another Column"
 *             from some_table
 *            where something = somethingelse
 *            order by 1 desc
 *           ]]>
 *         </query>
 *         <query>
 *         ...
 *         </query>
 *       </object>
 */
public class SQLQueryObject implements XmlConfigurable {
    String [] queries;
    String [] titles;
    int [] maxRows;

    protected String getChildElementName() {
        return "queries";
    }

    @Override
    public void setConfiguration(Element cfg) throws ConfigurationException {
        List<Element> qs = cfg.getChildren("query");
        int count = qs.toArray().length;
        if (count == 0)
            throw new ConfigurationException("no queries defined");
        queries = new String[count];
        titles = new String[count];
        maxRows = new int[count];
        int i = 0;
        for (Element q : qs) {
            maxRows[i] = Integer.parseInt(q.getAttributeValue("maxRows", "10"));
            titles[i] = q.getAttributeValue("title", "query");
            queries[i] = q.getTextTrim();
            i++;
        }
    }

    private boolean isNumericDataType(int type) {
        switch (type) {
            case Types.BIGINT:
            case Types.DECIMAL:
            case Types.DOUBLE:
            case Types.FLOAT:
            case Types.INTEGER:
            case Types.NUMERIC:
            case Types.REAL:
            case Types.SMALLINT:
            case Types.TINYINT:
                return true;
            default:
                return false;
        }

    }

    @Override
    public String toString() {
        try {
            Object res = DB.exec(db -> {
                StringBuilder sb = new StringBuilder("");
                for (int n=0; n < queries.length; n++) {
                    String query = queries[n];
                    String title = titles[n];
                    int mxrows = maxRows[n];
                    sb.append(' ').append(title).append("\n\n");
                    db.session().doWork(new Work() {
                        @Override
                        public void execute(Connection connection) throws SQLException {
                            PreparedStatement stmt = connection.prepareStatement(query);
                            ResultSet rs = stmt.executeQuery();
                            ResultSetMetaData md = rs.getMetaData();
                            int cols = md.getColumnCount();
                            String[] header = new String[cols];
                            int[] colsize = new int[cols];
                            for (int i = 1; i <= cols; i++) {
                                header[i - 1] = StringUtils.defaultIfEmpty(md.getColumnLabel(i), md.getColumnName(i));
                                colsize[i - 1] = header[i - 1].length();
                            }
                            int rows = 0;
                            String[][] out = new String[mxrows][cols];
                            while (rs.next() && rows < mxrows) {
                                for (int i = 1; i <= cols; i++) {
                                    out[rows][i - 1] = rs.getString(i);
                                    if (out[rows][i - 1] == null)
                                        out[rows][i - 1] = " ";
                                    int l = out[rows][i - 1].length();
                                    if (colsize[i - 1] < l)
                                        colsize[i - 1] = l;
                                }
                                rows++;
                            }
                            rs.close();
                            stmt.close();
                            StringBuilder sbSep = new StringBuilder(" ");
                            sb.append(' ');
                            for (int i = 1; i <= cols; i++) {
                                if (isNumericDataType(md.getColumnType(i)))
                                    sb.append(StringUtils.leftPad(header[i - 1], colsize[i - 1]));
                                else
                                    sb.append(StringUtils.rightPad(header[i - 1], colsize[i - 1]));
                                sbSep.append(StringUtils.repeat('-', colsize[i - 1]));
                                sb.append(' ');
                                sbSep.append(' ');
                            }
                            sb.append('\n');
                            sbSep.append('\n');
                            sb.append(sbSep);
                            for (int j = 0; j < rows; j++) {
                                sb.append(' ');
                                for (int i = 1; i <= cols; i++) {
                                    if (isNumericDataType(md.getColumnType(i)))
                                        sb.append(StringUtils.leftPad(out[j][i - 1], colsize[i - 1]));
                                    else
                                        sb.append(StringUtils.rightPad(out[j][i - 1], colsize[i - 1]));
                                    sb.append(' ');
                                }
                                sb.append('\n');
                            }
                            sb.append(sbSep).append('\n');
                        }
                    });
                }
                sb.append(" Last refreshed at ").append(new Date());
                return sb;
            });
            return res.toString();
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return e.toString();
        }

    }
}
