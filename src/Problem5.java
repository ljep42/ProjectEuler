import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ljephson
 */
public class Problem5 {
    
    public static void main(String[] args) {

        boolean debug = false;
        int myarray[] = new int[20];
        int k=1; //smallest number divisible by array
        int j=0;
        
        //populate array of numbers to test
        for (int i=0; i<myarray.length; i++)
            myarray[i] = i+1;
        
        //System.out.println(myarray.length);
        //System.out.println(j);
        while (j<myarray.length) {
            if (k%myarray[j]==0) {
                j++;
                //System.out.println(j);
            }
            else {
                j=0;
                k++;
            }
        }

        System.out.println(k);    

    }
}
        
    
    

    

