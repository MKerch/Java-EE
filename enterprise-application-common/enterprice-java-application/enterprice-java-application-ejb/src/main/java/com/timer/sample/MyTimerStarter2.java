/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.timer.sample;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.inject.Inject;
import javax.interceptor.AroundTimeout;

/**
 *
 * @author kerch
 */
@Singleton
@Startup
public class MyTimerStarter2 {
    @Resource
    private TimerService timerService;
    
    @PostConstruct
    public void init(){
        ScheduleExpression scheduleExpression = new ScheduleExpression();
        scheduleExpression.minute("*");
        scheduleExpression.hour("*");
        scheduleExpression.second("*/5");
        
        Timer timer = timerService.createCalendarTimer(scheduleExpression);
        
    }
    
    @Timeout
    public void timeMethod(Timer t){
        System.out.println("timeMethod()");
    }
    
}
