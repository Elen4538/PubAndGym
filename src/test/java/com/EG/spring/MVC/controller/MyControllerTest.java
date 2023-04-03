package com.EG.spring.MVC.controller;

import com.EG.spring.MVC.service.GymService;
import com.EG.spring.MVC.service.PubService;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author elena
 */



@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//        "file:src/main/webapp/WEB-INF/applicationContext.xml",
//        "file:src/main/webapp/WEB-INF/web.xml"} )


@ContextConfiguration(locations = {"classpath*:../applicationContext.xml",
        "file:src/main/webapp/WEB-INF/web.xml"})
@WebAppConfiguration
public class MyControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Mock
    private GymService gymService;

    @InjectMocks
    private MyController myController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(myController).build();
    }

    @Test
    public void testAskPostcode() throws Exception {
        List<String> allPostcodes = Arrays.asList("10001", "10002", "10003");
        when(gymService.getAllPostcodes()).thenReturn(allPostcodes);

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("PostcodeView"))
                .andExpect(model().attributeExists("gym"))
                .andExpect(model().attribute("allPostcodes", allPostcodes));

        verify(gymService, times(1)).getAllPostcodes();
        verifyNoMoreInteractions(gymService);
    }

}