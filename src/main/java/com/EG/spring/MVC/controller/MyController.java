package com.EG.spring.MVC.controller;

import com.EG.spring.MVC.entity.Gym;
import com.EG.spring.MVC.entity.Pub;
import com.EG.spring.MVC.service.GymService;
import com.EG.spring.MVC.service.PubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author elena
 */
@Controller
public class MyController {

    @Autowired
    private GymService gymService;
    @Autowired
    private PubService pubService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    //TODO make validation
    //TODO secure URLs via spring security
    public String askPostcode(Model model) {

        model.addAttribute("gym", new Gym());

        //model.addAttribute("gym1", new Gym());

        List<String> allPostcodes = gymService.getAllPostcodes();

        model.addAttribute("allPostcodes", allPostcodes);

        return "PostcodeView";
    }

    @RequestMapping("/showNearestGyms")
    public String showGyms(@ModelAttribute("gym") Gym gym, Model model, Model model1) {

        //System.out.println(gym.getPostcode());

        List<Pub> allPubs = pubService.getAllPubs();
        List<Gym> nearestGyms = gymService.getNearestGyms(gym.getPostcode());

        //model.addAttribute("nearestGyms", nearestGyms);

        Map<Gym, Map<String, Pub>> gymsAndPubs = new HashMap<>();

        // 1.5miles from gym or 20min walk and 111.11km is 1'
        double maxDistanceGymToPub = 2.5 / 111.11;

        for (Gym nearestGym : nearestGyms) {
            //TODO understand  Map<Gym, List<Pub>> and  Map<Gym, Map<String,Pub>>

            Map<String, Pub> pubMap = new HashMap<>();

            for (Pub nearestPub : allPubs) {

                if (
                        ((nearestGym.getLongitude() - nearestPub.getLongitude()) < maxDistanceGymToPub)
                                && ((nearestGym.getLatitude() - nearestPub.getLatitude() < maxDistanceGymToPub) && (pubMap.size() < 4))
                    // or we can search through Pythagorean theorem Sqrtl((x1-x2)^2+(y1-y2)^2)
                ) {
                    pubMap.put(nearestPub.getName(), nearestPub);

                }
            }
            gymsAndPubs.put(nearestGym, pubMap);
        }
        System.out.println(gymsAndPubs);

        model1.addAttribute("gymsAndPubs", gymsAndPubs);

        return "GymsNearbyView";
    }
}
