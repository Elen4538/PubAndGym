package com.EG.spring.MVC.service;

import com.EG.spring.MVC.dao.PubDAO;
import com.EG.spring.MVC.entity.Pub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author elena
 */
@Service
public class PubServiceImplementation implements PubService{

    @Autowired
    private PubDAO pubDAO;


    @Override
    @Transactional
    public List<Pub> getAllPubs() {
        return pubDAO.getAllPubs();
    }
}
