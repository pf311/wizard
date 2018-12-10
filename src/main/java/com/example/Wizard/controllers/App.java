package com.example.Wizard.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Wizard.models.WizardInterface;



public class App {

    public void start() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myWizard = context.getBean("Dumbledore", WizardInterface.class);
        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizard.giveAdvice());
        System.out.println("******************");
        System.out.println(myWizard.changeDress());
        System.out.println("******************");
    }
}