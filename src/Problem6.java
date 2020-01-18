import java.lang.Math;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ljephson
 */
public class Problem6 {
    
    
    public static void main(String[] args) {
        
        double sumSquare=0, squareSum=0;
        int max = 100;
       
        
        for (double i=1; i<=max;i++) {
            sumSquare += Math.pow(i,2);
            //System.out.println(i);
            //System.out.println(sumSquare);
            squareSum += i;
        }
        
        //System.out.println(sumSquare);
        System.out.printf("%.0f",Math.pow(squareSum, 2)-sumSquare);
        System.out.println();
    }
    
    }
    
    
            
    

