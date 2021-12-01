/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Lab4Bai8 {

    /**
     * @param args the command line arguments
     */
    public static double getAverage(List<? extends Number> numberList)
    {
        double total = 0.0;
        for (Number number : numberList)
        {
            total += number.doubleValue();
        }
        return total / numberList.size();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> IntegerList = new ArrayList<Integer>();
        IntegerList.add(3);
        IntegerList.add(30);
        IntegerList.add(300);
        System.out.println(getAverage(IntegerList)); // KQ?
        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(3.0);
        doubleList.add(33.0);
        System.out.println(getAverage(doubleList)); 
    }
    
}
