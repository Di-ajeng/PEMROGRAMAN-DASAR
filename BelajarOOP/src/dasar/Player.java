/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author User
 */
public class Player {

    String name;
    int speed;
    int healtPoint;
    
    void run () {
        System.out.println(name+"is running...");
        System.out.println("speed:"+speed);
        // TODO code application logic here
    }
    boolean isDead(){
        if(healtPoint<=0)return true;
        return false;
    }
}
