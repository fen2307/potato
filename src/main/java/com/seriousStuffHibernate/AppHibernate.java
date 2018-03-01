package com.seriousStuffHibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@SpringBootApplication
public class AppHibernate implements CommandLineRunner {
        private static final Logger log = LoggerFactory.getLogger(AppHibernate.class);


        public static void main(String args[]) {
            SpringApplication.run(AppHibernate.class, args);
        }

        @Override
        public void run(String... strings) throws Exception {
            SessionFactory factory = HibernateUtils.getSessionFactory();

            Session session = factory.getCurrentSession();

            try {
                // just to see if it actually create . drop table
                session.getTransaction().begin();
                session.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
                session.getTransaction().rollback();
            }
        }

    }

