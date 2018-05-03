package com.seriousStuffHibernate;

import com.seriousStuffHibernate.Entities.SaleRecord;
import com.seriousStuffHibernate.Implementation.SaleRecordsDaoImpl;

import java.util.List;

public class SaleRecordsService {
    private static SaleRecordsDaoImpl saleRecordsDao;
    public SaleRecordsService() {
        saleRecordsDao = new SaleRecordsDaoImpl();
    }

    public void persist(List<SaleRecord> entity) {
        saleRecordsDao.openCurrentSessionwithTransaction();
        saleRecordsDao.persist(entity);
        saleRecordsDao.closeCurrentSessionwithTransaction();
    }

    public void update(SaleRecord entity) {
        saleRecordsDao.openCurrentSessionwithTransaction();
        saleRecordsDao.update(entity);
        saleRecordsDao.closeCurrentSessionwithTransaction();
    }

    public SaleRecord findById(Integer id) {
        saleRecordsDao.openCurrentSession();
        SaleRecord saleRecord = saleRecordsDao.findById(id);
        saleRecordsDao.closeCurrentSession();
        return saleRecord;
    }

    public void delete(Integer id) {
        saleRecordsDao.openCurrentSessionwithTransaction();
        SaleRecord book = saleRecordsDao.findById(id);
        saleRecordsDao.delete(book);
        saleRecordsDao.closeCurrentSessionwithTransaction();
    }

    public List<SaleRecord> findAll() {
        saleRecordsDao.openCurrentSession();
        List<SaleRecord> saleRecords = saleRecordsDao.findAll();
        saleRecordsDao.closeCurrentSession();
        return saleRecords;
    }

    public void deleteAll() {
        saleRecordsDao.openCurrentSessionwithTransaction();
        saleRecordsDao.deleteAll();
        saleRecordsDao.closeCurrentSessionwithTransaction();
    }

    public SaleRecordsDaoImpl saleRecordsDao() {
        return saleRecordsDao;
    }
}
