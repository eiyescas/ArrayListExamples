/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexamples;

import java.util.ArrayList;

/**
 *
 * @author esmeralda.iyescas001
 */
public class ArrayListExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList AL = new ArrayList(); //AL = ArrayList name
        AL.add(9);
        AL.add("Hello");
        AL.add(new Object());
        System.out.println("Size of ArrayList: " + AL.size());
        for(Object o: AL){
            //java instance of
            if(o instanceof String){
                System.out.println("We found a string!"); //returns if there is a string in the ArrayList 
                //key to string is " " quotaion marks
            }
            System.out.println(o);
        }
    }
    
}
