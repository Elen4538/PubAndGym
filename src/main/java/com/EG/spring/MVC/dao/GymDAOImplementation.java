package com.EG.spring.MVC.dao;

import com.EG.spring.MVC.entity.Gym;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author elena
 */

@Repository
public class GymDAOImplementation implements GymDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    //@Transactional
    public List<Gym> getAllGyms() {

        Session session = sessionFactory.getCurrentSession();
        List<Gym> allGyms = session.createQuery("from Gym", Gym.class)
                .getResultList();

        return allGyms;
    }

    @Override
    public Gym getGym(String postcode) {

        Session session = sessionFactory.getCurrentSession();
        Gym gym = session.get(Gym.class, postcode);
        return gym;
    }

    @Override
    public List<String> getAllPostcodes() {

        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Gym.class);
        criteria.setProjection(Projections.distinct(
                Projections.property("postcode")));
        List<String> allPostcodes = criteria.list();
        Collections.sort(allPostcodes);
        return allPostcodes;
    }

    @Override
    public List<Gym> getNearestGyms(String postcode) {

        Session session = sessionFactory.getCurrentSession();

        List<Gym> allNearestGyms = session.createQuery(
                "from Gym G where G.postcode =:gymPostcode ", Gym.class)//TODO add regex to postcode not full coincidence
                .setParameter("gymPostcode",postcode).getResultList();
        return allNearestGyms ;
    }


}
