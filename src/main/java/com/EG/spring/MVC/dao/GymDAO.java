package com.EG.spring.MVC.dao;


import com.EG.spring.MVC.entity.Gym;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author elena
 */


public interface GymDAO {

    public List<Gym> getAllGyms();

    public Gym getGym(String postcode);

    public List<String> getAllPostcodes();

    public List<Gym>getNearestGyms(String postcode);
}
