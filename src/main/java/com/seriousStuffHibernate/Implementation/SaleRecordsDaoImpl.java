package com.seriousStuffHibernate.Implementation;

import java.util.List;

import com.seriousStuffHibernate.Entities.SaleRecord;

import com.seriousStuffHibernate.Interfaces.SaleRecordDao;


public class SaleRecordsDaoImpl extends HibernateDaoImpl implements SaleRecordDao<SaleRecord, String> {

    public SaleRecordsDaoImpl (){
    }


    @Override
    public void persist(List<SaleRecord> entity) {
        for (SaleRecord saleRecord : entity ) {
            getCurrentSession().save(saleRecord);
        }
    }

    @Override
    public void update(SaleRecord entity) {
        getCurrentSession().update(entity);
    }

    @Override
    public SaleRecord findById(Integer id) {
        SaleRecord saleRecord = (SaleRecord) getCurrentSession().get(SaleRecord.class, id);
        return saleRecord;
    }

    @Override
    public void delete(SaleRecord entity) {
        getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
        public List<SaleRecord> findAll () {
            List<SaleRecord> saleRecords = (List<SaleRecord>) getCurrentSession().createQuery("from SALE_RECORDS").list();
            return saleRecords;
        }

    @Override
    public void deleteAll() {
        List<SaleRecord> entityList = findAll();
        for (SaleRecord entity : entityList) {
            delete(entity);
        }
    }
}
