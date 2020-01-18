
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
public class Problem1 {
        
        public static void main(String[] args) {
            Testarray.main();
                
        }
        
}
class Testarray {
        
        public static void main() {
        
                
        int smarray[] = new int[1000];
        int count=0;
        int sum=0;
        
        for (int i=0; i<smarray.length;i++) {
            smarray[i]=i;
            
            if ((smarray[i] % 3 ==0) || (smarray[i] % 5 ==0)){
                //System.out.println(i+ " is divisiable by 3 & 5");
                //count+=1;
                sum += i;
            }
            else
            {}
                //System.out.println(i+ " is not divisiable by 3 & 5");
        }
        
        //System.out.println("There are a total of " + count + " numbers divisible by 3 & 5");
        System.out.println("The sum is " + sum);
       

    }
        


}        
        


