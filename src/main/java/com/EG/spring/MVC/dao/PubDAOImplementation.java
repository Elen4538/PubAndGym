package com.EG.spring.MVC.dao;

import com.EG.spring.MVC.entity.Gym;
import com.EG.spring.MVC.entity.Pub;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author elena
 */

@Repository
public class PubDAOImplementation implements PubDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Pub> getAllPubs() {

        Session session = sessionFactory.getCurrentSession();
        List<Pub> allPubs = session.createQuery("from Pub ", Pub.class).getResultList();
        //TODO sort list by

        return allPubs;
    }
}
