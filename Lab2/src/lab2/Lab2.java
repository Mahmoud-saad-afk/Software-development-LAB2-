/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import lab2.Client.Payment;
import lab2.Encapsulated_Behavior_A.AuthorizeCheck;
import lab2.Encapsulated_Behavior_P.PrintCashTrans;

/**
 *
 * @author saadm
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Payment p = new Payment(new PrintCashTrans(), new AuthorizeCheck());
p.setAmount(3000);
p.execute();
    }
    
}
