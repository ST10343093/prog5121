/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bills;

/**
 *
 * @author arsha
 */
public class billss {
    
    private String strCustomer;
    private double dblMinutes , dblCost;
    
    // constructor receiving variables
    public billss(String strName, double dblMinutesTalked, double dblCostPerMinute){
            strCustomer = strName;
            dblMinutes = dblMinutesTalked;
            dblCost = dblCostPerMinute;
}
    public String getName(){
        return strCustomer;
    }
    public double getTotalBills(){
        return(dblMinutes * dblCost); 
    }
}

