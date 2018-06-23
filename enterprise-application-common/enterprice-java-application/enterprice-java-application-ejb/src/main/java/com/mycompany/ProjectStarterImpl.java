/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;
/**
 *
 * @author kerch
 */
@Singleton(mappedName = "projectStarterImpl")
@Startup
public class ProjectStarterImpl implements ProjectStarter {

    /*static{
    }
    
    {
    }

    public ProjectStarterImpl() {
    }*/
    
    @PostConstruct
    public void init(){
        System.out.println("Bean was created!!!");
    }
    
   @Override
    public int process(int a, int b) {
         System.out.println("PROCESS()");
         return a+b;
    }
    
    @PreDestroy
    public void destory(){
        System.out.println("Bean was destroyed!!!");
    }

    
    
}
