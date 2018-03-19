/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Arrays;
public class Main 
{
       public static int[] sort ( int[] randomNumbers)
       {
           int [] numbers = randomNumbers;
           for (int i = 0; i < numbers.length; i++) 
           {
	            for (int j = 0; j < numbers.length - i - 1; j++) 
	            {
		            if (numbers[j] > numbers[j + 1]) 
		            {
			        int temp = numbers[j + 1];
			        numbers[j + 1] = numbers[j];
			        numbers[j] = temp;
		            }
	            }
           }
           return numbers;
           
       }
	//You might need a swap function also.
   public static void main(String args[]) {
       int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
       int[] sortedNumbers;
       sortedNumbers = sort(randomNumbers);
       System.out.println(Arrays.toString(sortedNumbers));
}
}