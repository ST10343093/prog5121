/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bills;
import javax.swing.*;


public class Bills {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null,"Enter the Customer's name ");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Minutes talked"));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the cost per Minute"));
        
        //sends variables to contrustor in the bills class
        billss b = new billss(strName, dblMinutesTalked,dblCostPerMinute);
        
        JOptionPane.showMessageDialog(null, "Customer Name:" + 
                b.getName().toUpperCase() + "\n" + 
                "Total Due: R" + b.getTotalBills());
    }
}
