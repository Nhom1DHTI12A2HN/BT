/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.b;

/**
 *
 * @author admin
 */
class Stats<T extends Number>
{
    T[] nums;
    Stats(T[] o)
    {
        nums = o;
    }
    double average()
    {
        double sum = 0.0;
        for(int i=0; i < nums.length; i++) sum += nums[i].doubleValue();
        return sum / nums.length;
    }
}
public class Lab4Bai9 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Integer inums[] = { 1, 2, 3, 4, 5 };
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("Trung binh iob: " + v);
        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Trung binh dob: " + w);
    }
    
}
