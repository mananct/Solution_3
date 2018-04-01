//import java.util.Arrays;
//import java.util.Collections;

public class Solution_3{

     public static void main(String []args){
        int rArray[]=new int[500];
        for (int i=0; i<=rArray.length-1; i++)
        {
            
            rArray[i]=((int)(Math.random()*100 +1));
            
        }
        
        System.out.println("Following are 500 the random numbers used to find minimum numbers");
        System.out.println("*************************************************");
        
      for (int i=0; i<=rArray.length-1; i++)
      {
          
    	  
          System.out.println(rArray[i]);
          
      }
      
     int b= min (rArray);
     System.out.println("*************************************************");
     System.out.printf("Minimum From above 500 Number =%d",b);
     }
        private static int min(int[] rArray)
        {
        int min = rArray[0];
        for (int i = 1; i < rArray.length; i++) {
            if (rArray[i] < min) {
                min = rArray[i];
            }
        }
        return min;
     }

}