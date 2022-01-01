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

package org.jpos.qi.login;

import org.jpos.ee.*;
import org.jpos.qi.QI;

import java.text.ParseException;

/**
 * Created by spr on 5/9/16.
 */
public class LoginHelper {

    public LoginHelper() {
        super();
    }

    // Returns the max number of login attempts configured through SysConfig.
    protected int getMaxLoginAttempts () throws NumberFormatException {
        try {
            return (int) DB.exec((db) -> {
                SysConfigManager mgr = new SysConfigManager(db, "sys.");
                return mgr.getInt(LoginConstants.MAX_LOGIN_ATTEMPTS.name());
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return -1;
        }
    }

    // Track the number of times a user attempts to login and fails.
    protected int addLoginAttempt (User user) {
        if (user != null) {
            try {
                return (int) DB.exec((db) -> {
                    db.beginTransaction();
                    user.incLoginAttempts();
                    db.session().update(user);
                    db.commit();
                    return user.getLoginAttempts();
                });
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
                return -1;
            }
        } else {
            return -1;
        }
    }

    // If the number of login attempts was tracked, we clear this value, generally after a successful login.
    protected void clearLoginAttempts (User user) {
        if (user != null) {
            try {
                DB.execWithTransaction((db)-> {
                    user.setLoginAttempts(0);
                    db.session().update(user);
                    return user;
                });
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
            }
        }
    }

    // Deactivates a user, generally after attempting to login too many times.
    protected void lockUser (User u) {
        if (u != null) {
            try {
                DB.execWithTransaction((db)-> {
                    u.setForcePasswordChange(true);
                    u.setActive(false);
                    db.session().update(u);
                    new SysLogManager(db).log(
                            "User." + u.getNick(), "SYSTEM", SysLog.INFO, "User locked",
                            "User deactivated after failed attempts to login to QI"
                    );
                    RevisionManager rmgr = new RevisionManager(db);
                    rmgr.createRevision(u, "user." + u.getId(), "-active:true<br/>+active:false");
                    return u;
                });
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
            }
        }
    }

    // Set user's forcePasswordChange flag to TRUE
    protected void forcePasswordChange (User user) {
        if (user != null) {
            try {
                DB.execWithTransaction((db)-> {
                    user.setForcePasswordChange(true);
                    db.session().update(user);
                    return user;
                });
            } catch (Exception e) {
                QI.getQI().getLog().error(e);
            }
        }
    }

    // Check last password change against SysConfig PASSWORD_AGE value
    protected void checkPasswordAge (User u) throws ParseException {
        try {
            DB.exec((db)->{
                SysConfigManager mgr = new SysConfigManager(db);
                if (mgr.hasProperty(LoginConstants.PASSWORD_AGE.name())) {
                    int passAge = mgr.getInt(LoginConstants.PASSWORD_AGE.name());
                    if (passAge != 0) {
                        java.util.Calendar cal = java.util.Calendar.getInstance();
                        java.util.Calendar calPassExpired = java.util.Calendar.getInstance();
                        if (u.getPasswordChanged() != null) {
                            calPassExpired.setTime (u.getPasswordChanged());
                            calPassExpired.add(java.util.Calendar.DAY_OF_WEEK, passAge);
                            if (cal.after(calPassExpired))
                                u.setForcePasswordChange(true);
                        }
                    }
                }
                return u;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
        }
    }

    public User getUserByNick (String nick, String pass) {
        try {
            return (User) DB.execWithTransaction((db) -> {
                UserManager umgr = new UserManager (db);
                User user = null;
                try {
                    user = umgr.getUserByNick(nick, pass);
                    if (user.getPasswordHash().length() == 40)
                        umgr.upgradePassword(user, pass);
                } catch (BLException e) {
                    return null;
                }
                return user;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }

    }

    protected User getUserByNick (String nick) {
        return this.getUserByNick(nick, false);
    }

    protected User getUserByNick (String nick, boolean loadProperties) {
        try {
            return (User) DB.exec((db) -> {
                UserManager umgr = new UserManager(db);
                User user = umgr.getUserByNick(nick);
                if (loadProperties && user != null) {
                    //just to ensure lazy user properties are loaded by db session
                    user.getProps().size();
                }
                return user;
            });
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return null;
        }
    }

    protected boolean isRememberEnabled () {
        try {
            return (boolean) DB.exec((db)-> new SysConfigManager(db, "sys.").getBoolean(LoginConstants.REMEMBER_PASSWORD_ENABLED.name()));
        } catch (Exception e) {
            QI.getQI().getLog().error(e);
            return false;
        }
    }
}
