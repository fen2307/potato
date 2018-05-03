package com.seriousStuffHibernate.Interfaces;

import org.hibernate.Session;
import org.hibernate.Transaction;

public interface IHibernateDao {
    Session openCurrentSession();

    Session openCurrentSessionwithTransaction();

    void closeCurrentSession();

    void closeCurrentSessionwithTransaction();

    Session getCurrentSession();

    void setCurrentSession(Session currentSession);

    Transaction getCurrentTransaction();

    void setCurrentTransaction(Transaction currentTransaction);
}
