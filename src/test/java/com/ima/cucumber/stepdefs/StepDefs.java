package com.ima.cucumber.stepdefs;

import com.ima.ImaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ImaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
