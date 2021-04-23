/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.Client;
import lab2.Encapsulated_Behavior_A.IauthorizeBehavior;
import lab2.Encapsulated_Behavior_P.IprintBehavior;
/**
 *
 * @author saadm
 */
public class cash extends Payment {
         private float cashTendered ;

    
    public cash(IprintBehavior pB, IauthorizeBehavior aB) {
        super(pB, aB);
    }
    
}

   

  
