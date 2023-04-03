package com.EG.spring.MVC.service;

import com.EG.spring.MVC.entity.Gym;

import java.util.List;

/**
 * @author elena
 */
public interface GymService {

    public List<Gym> getAllGyms();

    public Gym getGym(String postcode);

    public List<String> getAllPostcodes();

    public List<Gym> getNearestGyms(String postcode);

}
