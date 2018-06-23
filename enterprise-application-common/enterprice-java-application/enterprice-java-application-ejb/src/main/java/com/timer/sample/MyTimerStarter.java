/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timer.sample;

import javax.ejb.Schedule;
import javax.ejb.Schedules;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author kerch
 */
@Singleton
@Startup
public class MyTimerStarter {

    //@Schedule(second = "*/10", minute = "*", hour = "*", persistent = false)
    /*public void sendEmail(){
        System.out.println("sending email");
    }*/
    @Schedules({
        @Schedule(second = "2,5,9", minute = "*", hour = "*", persistent = false)
        ,@Schedule(second = "50,52", minute = "*", hour = "*", persistent = false)})
    public void sendEmail() {
        System.out.println("sending email");
    }

}
