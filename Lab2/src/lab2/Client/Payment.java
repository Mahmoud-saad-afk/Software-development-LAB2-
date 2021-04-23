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
public class Payment {
    
   private int amount; 
   private IprintBehavior pB ;
   private IauthorizeBehavior aB;

   public Payment(IprintBehavior pB , IauthorizeBehavior aB){
       this.pB = pB;
              this.aB = aB;
   }
               public void setAmount(int amount){
                   this.amount = amount;
               }
                            public void execute(){
                                System.out.println("the amount is: " + amount);
                                aB.authorized();
                                pB.printRecpt();
                            }
}
