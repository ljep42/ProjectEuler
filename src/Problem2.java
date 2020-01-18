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
public class Problem2 {
    
    public static void main(String[] args) {
        
        double limit = 4000000;
        double fib[]=new double[50];
        int i = 0;
        
        
         
        for (i=2;i<fib.length;i++) {
            fib[0] = 1;
            fib[1] = 2;
            fib[i] = fib[i-1] + fib[i-2];
            //System.out.println(fib[i]);
            if (fib[i] <4000000)
                continue;
            else
                break;
                
        }
        
        
    
        
        System.out.println(Arrays.toString(fib));
        System.out.println(fib.length);
        
     
    }
    
}
