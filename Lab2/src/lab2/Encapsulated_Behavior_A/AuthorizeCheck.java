/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.Encapsulated_Behavior_A;

/**
 *
 * @author saadm
 */
public class AuthorizeCheck implements IauthorizeBehavior{

    @Override
    public void authorized() {
        System.out.println("the authorize behavior is check");
    }
    
}
