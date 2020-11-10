/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan;


public class SwitchWithoutBreak {
 public static void main(String[] args) {
        char input = 'D';
        int output = 0;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            case 'F':
                output++;
            case 'G':
                output++;
            case 'H':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah " + output);
    }   
}
