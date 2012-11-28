package org.jpos.ee;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public interface HibernateAccessService
{
    SessionFactory getSessionFactory();

    ServiceRegistry getServiceRegistry();

    Configuration getConfiguration();

    boolean isReadOnly();
}
