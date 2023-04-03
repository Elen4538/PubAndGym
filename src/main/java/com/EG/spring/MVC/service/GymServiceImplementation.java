package com.EG.spring.MVC.service;

import com.EG.spring.MVC.dao.GymDAO;
import com.EG.spring.MVC.entity.Gym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author elena
 */

@Service
public class GymServiceImplementation implements GymService {

    @Autowired
    private GymDAO gymDAO;

    @Override
    @Transactional
    public List<Gym> getAllGyms() {
        return gymDAO.getAllGyms();
    }

    @Override
    @Transactional
    public Gym getGym(String postcode) {
        return gymDAO.getGym(postcode);
    }

    @Override
    @Transactional
    public List<String> getAllPostcodes() {
        return gymDAO.getAllPostcodes();
    }

    @Override
    @Transactional
    public List<Gym> getNearestGyms(String postcode) {
        return gymDAO.getNearestGyms(postcode);
    }


}
