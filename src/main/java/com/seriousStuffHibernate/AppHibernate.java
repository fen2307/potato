package com.seriousStuffHibernate;

import com.seriousStuffHibernate.Entities.SaleRecord;
import com.seriousStuffHibernate.Implementation.SaleRecordsParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

@SpringBootApplication
public class AppHibernate implements CommandLineRunner {
        private static final Logger log = LoggerFactory.getLogger(AppHibernate.class);


        public static void main(String args[]) {
            SpringApplication.run(AppHibernate.class, args);
        }

        @Override
        public void run(String... strings) throws Exception {
            String path = "C:\\Users\\Kamil\\Desktop\\tut\\TutorialProject\\TutorialProject\\src\\main\\resources\\SampleData.csv";

//            SessionFactory factory = HibernateUtils.getSessionFactory();
//            Session session = factory.getCurrentSession();

            //Parsing File
            SaleRecordsParser parser = new SaleRecordsParser();
            List <SaleRecord> saleRecords = parser.parse(path);

//            try {
//                // just to see if it actually create . drop table
//                session.getTransaction().begin();
//                session.getTransaction().commit();
//            } catch (Exception e) {
//                e.printStackTrace();
//                session.getTransaction().rollback();
//            }

            //Persisting
            SaleRecordsService saleRecordsService = new SaleRecordsService();
            saleRecordsService.persist(saleRecords);
        }

    }

