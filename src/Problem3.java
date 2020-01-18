/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ljephson
 */
public class Problem3 {
    
    public static void main(String[] args) {
        long num = 600851475143L;
        
        for (int i=2; i<=Math.sqrt(num); i++)
            if (num%i==0) {
                //then it is a factor
                //System.out.println("num is:" + num + " and i is: " + i);
                System.out.println(i);
                for (int j=2; j<Math.sqrt(i);j++)
                    if (i%j==0)  {
                        //then there is another factor and it cannot be a prime factor
                        //System.out.println("j is: "+j);
                        //System.out.println("prime factor is: " + i);
                        System.out.println(" is not a prime factor");
                        //break;
                    }

                    else {
                        //System.out.println(j);
                        //System.out.println("i is " + i+" and j is " + j+" and i%j is " +i%j);
                        //System.out.println("prime factors are: " + i);
                    };
                
            }
            else {
                //not a factor
                //System.out.println(i);
            }
    }
    
}
