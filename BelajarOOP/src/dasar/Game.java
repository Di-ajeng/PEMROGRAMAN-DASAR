/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

public class Game {
    public static void main(String[]args){
        Player petani = new Player();
        
        petani.name="petani code";
        petani.speed=75;
        petani.healtPoint=100;
        
        petani.run();
        if(petani.isDead()){
            System.out.println("Game Over!");
        }
    }
}
