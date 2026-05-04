package testes;

import java.util.Scanner; 

public class BubbleSort {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
       int[] nums = {3,4,7,2,9,1,10,6};
       int aux;
       boolean controle;
       
       for (int i = 0; i < nums.length; i++) {
           controle = true; 
           for (int j = 0; j < (nums.length-1); j++) {              
               if (nums[j] >  nums[j+1]) {
                  aux = nums[j];
                  nums[j] = nums[j+1];
                  nums[j+1] = aux;
                  controle = false;
               }
           }
           
           if (controle) {
               break;
           }
       }
       
       for(int i = 0; i < nums.length; i++) {
           System.out.print(nums[i]+" ");
       }
    } 
}
