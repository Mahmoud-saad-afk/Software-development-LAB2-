/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.Encapsulated_Behavior_P;

/**
 *
 * @author saadm
 */
public class PrintCashTrans implements IprintBehavior {

    @Override
    public void printRecpt() {
        System.out.println("the print behavior is cashtrans");
    }
    
}