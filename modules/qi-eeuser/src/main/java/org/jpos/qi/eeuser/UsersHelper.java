/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
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

package org.jpos.qi.eeuser;

import com.vaadin.data.Binder;
import com.vaadin.data.ValidationResult;
import com.vaadin.data.Validator;
import com.vaadin.ui.PasswordField;
import org.hibernate.Criteria;
import org.jpos.ee.*;
import org.jpos.qi.QIHelper;
import org.jpos.util.PasswordGenerator;

import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class UsersHelper extends QIHelper {

    public UsersHelper() {
        super(User.class);
    }

    @Override
    public Stream getAll(int offset, int limit, Map<String, Boolean> orders) throws Exception {
        List<User> all = (List<User>) DB.exec(db -> {
            UserManager mgr = new UserManager(db);
            return mgr.getAll(offset,limit,orders);
        });
        return all.stream();
    }

    @Override
    public int getItemCount() throws Exception {
        return (int) DB.exec(db -> {
            UserManager mgr = new UserManager(db);
            return mgr.getItemCount();
        });
    }

    @Override
    public String getItemId(Object item) {
        return String.valueOf(((User)item).getId());
    }

    public User getUserByNick (String nick, boolean includeDeleted) {
        try {
            return (User) DB.exec((db) -> {
                UserManager mgr = new UserManager(db);
                return mgr.getUserByNick(nick,includeDeleted);
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public boolean updateUser (Binder binder, String currentPass, String newClearPass) throws BLException {
        boolean userUpdated;
        try {
            userUpdated = (boolean) DB.execWithTransaction((db) -> {
                UserManager mgr = new UserManager(db);
                User oldUser = (User) ((User)getOriginalEntity()).clone();
                if (binder.writeBeanIfValid(getOriginalEntity())) {
                    User user = (User) getOriginalEntity();
                    user = (User) db.session().merge(user);
                    boolean updated = false;
                    if (!newClearPass.isEmpty()) {
                        boolean passwordOK = false;
                        boolean newPasswordOK = false;
                        user.getPasswordhistory(); //to avoid lazy
                        passwordOK = mgr.checkPassword(user, currentPass);
                        newPasswordOK = mgr.checkNewPassword(user, newClearPass);
                        if (passwordOK && newPasswordOK) {
                            mgr.setPassword(user, newClearPass);
                            updated = true;
                        } else if (!newPasswordOK) {
                            throw new BLException("This password has already been used");
                        }
                    }
                    updated = updated || addRevisionUpdated(db, getEntityName(),
                            String.valueOf(user.getId()),
                            oldUser,
                            user,
                            new String[]{"nick", "name", "email", "active", "roles", "password"});
                    return updated;
                } else {
                    throw new BLException(getApp().getMessage("errorMessage.invalidFields"));
                }
            });
        } catch (BLException e) {
            throw e;
        } catch (Exception e) {
            getApp().getLog().error(e);
            return false;
        }
        if (userUpdated && getOriginalEntity().equals(getApp().getUser())) {
            try {
                DB.exec((db)->{
                    db.session().refresh(getApp().getUser());
                    return null;
                });
            } catch (Exception e) {
                getApp().getLog().error(e);
            }
        }
        return userUpdated;
    }

    //Does not override SaveEntity because it needs the String clearPass
    public boolean saveUser (Binder binder, String clearPass) throws BLException {
        User u = (User) getOriginalEntity();
        if (binder.writeBeanIfValid(getOriginalEntity())) {
            try {
                return (boolean) DB.execWithTransaction((db) -> {
                    db.save(u);
                    if (clearPass != null && !clearPass.isEmpty()) {
                        UserManager mgr = new UserManager(db);
                        try {
                            mgr.setPassword(u, clearPass);
                        } catch (BLException e) {
                            return false;
                        }
                        addRevisionCreated(db, getEntityName(), u.getId().toString());
                        u.setForcePasswordChange(true);
                        db.session().update(u);
                        return true;
                    }
                    return false;
                });
            } catch (Exception e) {
                getApp().getLog().error(e);
                return false;
            }
        } else {
          throw new BLException("Invalid user");
        }
    }


    @Override
    public boolean removeEntity() {
        //Users have a deleted flag, they are not completely removed.
        User t = (User) getOriginalEntity();
        try {
            return t != null && (boolean) DB.execWithTransaction((db) -> {
                User user = db.session().get(User.class, t.getId());
                if (user == null) return false;
                t.setDeleted(true);
                db.session().merge(t);
                addRevisionRemoved(db, getEntityName(), String.valueOf(t.getId()));
                return true;
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return false;
        }
    }

    @Override
    public boolean updateEntity(Binder binder) throws BLException {
        //NOT USED
        return false;
    }

    public List<Role> getRoles() {
        try {
            return (List<Role>) DB.exec((db) -> {
                Criteria crit = db.session().createCriteria(Role.class);
                return crit.list();
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
    }

    public Validator getNickTakenValidator() {
        return (Validator<String>) (value, context) -> {
            String oldNick = getOriginalEntity() != null ? ((User) getOriginalEntity()).getNick() : null;
            if (oldNick != null) {
                User u = getUserByNick((String) value, true);
                if (u == null || u.getId().equals(((User) getOriginalEntity()).getId())) {
                    return ValidationResult.ok();
                }
                return ValidationResult.error(getApp().getMessage("errorMessage.nickAlreadyExists", value));
            } else {
                if (getUserByNick((String) value, true) == null) {
                    return ValidationResult.ok();
                }
                return ValidationResult.error(getApp().getMessage("errorMessage.nickAlreadyExists", value));
            }
        };
    }

    public Validator getPasswordsMatchValidator(final PasswordField newPass) {
        return (Validator<String>) (value,context) -> {
            if (!newPass.getValue().equals(value))
                return ValidationResult.error(getApp().getMessage("error.passwordsMatch"));
            return ValidationResult.ok();
        };
    }

    public String resetUserPassword (User user) {
        String generatedPassword = PasswordGenerator.generateRandomPassword();
        try {
            DB.execWithTransaction((db) -> {
                db.session().refresh(user);
                user.getPasswordhistory(); // hack to avoid LazyInitialization
                UserManager mgr = new UserManager(db);
                try {
                    mgr.setPassword(user, generatedPassword);
                } catch (BLException e) {
                    getApp().displayNotification("errorMessage.resetPassword");
                    return false;
                }
                user.setForcePasswordChange(true);
                user.setLoginAttempts(0); // reset login attempts
                db.session().saveOrUpdate(user);
                return true;
            });
        } catch (Exception e) {
            getApp().getLog().error(e);
            return null;
        }
        return generatedPassword;
    }

    public Validator getCurrentPasswordMatchValidator() {
        return (Validator<String>) (value, context) -> {
            try {
                boolean passwordOk = (boolean) DB.exec((db) -> {
                    UserManager mgr = new UserManager(db);
                    try {
                        return mgr.checkPassword((User) getOriginalEntity(), (String) value);
                    } catch (BLException e) {
                        return false;
                    }
                });
                return passwordOk ? ValidationResult.ok() : ValidationResult.error(getApp().getMessage("error.invalidPassword"));
            } catch (Exception e) {
                getApp().getLog().error(e);
                return ValidationResult.error(e.getMessage());
            }
        };
    }
    public Validator getNewPasswordNotUsedValidator() {
        return (Validator<String>) (value, context) -> {
            if (getOriginalEntity() != null) {
                try {
                    boolean ok = (boolean) DB.exec((db) -> {
                        db.session().refresh(getOriginalEntity());
                        UserManager mgr = new UserManager(db);
                        try {
                            return mgr.checkNewPassword((User) getOriginalEntity(), (String) value);
                        } catch (BLException e) {
                            return false;
                        }
                    });
                    return ok ? ValidationResult.ok() : ValidationResult.error(getApp().getMessage("error.passwordUsed"));
                } catch (Exception e) {
                    getApp().getLog().error(e);
                }
            }
            return ValidationResult.ok();
        };
    }

}

