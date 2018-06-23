/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author kerch
 */
//@Local
//@Remote
public interface Calculator {
  
    public int add(int a, int b);
    
    public int subtract(int a, int b);
    
}
