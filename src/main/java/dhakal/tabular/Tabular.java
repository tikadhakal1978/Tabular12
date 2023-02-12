/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.tabular;

/**
 *
 * @author tikad
 */
public class Tabular {

    public static void main(String[] args) {
        int i;
        System.out.println("N\t"+"N*10\t"+"N*100\t"+"N*1000");
        for (i=1; i<=5; i++){
        int  first=10*i;
        int second=first*10;
        int third = second *10;
        System.out.println(i+ "\t" +first+ "\t" +second+ "\t"+third);
        
        }
    }
}
