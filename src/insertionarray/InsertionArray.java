/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionarray;
import java.util.*;

/**
 *
 * @author Tanishka Kamrajh
 */
public class InsertionArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //insert the scanner class
        Scanner sc = new Scanner(System.in);
        
        //declare an array with size 
        int[] nums = new int[5];
        
        //store int values in an array
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Enter an integer value: ");
            //store your numbers in the scanner as integers 
            nums[i] = sc.nextInt();
        }
        //display the array 
        System.out.print("Original Array: " + Arrays.toString(nums));
        
        //need to sort the array
        insertionSort(nums);
        
        //display again 
        System.out.print("The sorted array: " + Arrays.toString(nums));
    }
    
    //make it public static because in main class 
    public static void insertionSort(int[] value) {
        //use for press tab change 10 to either 5 or value.length
        for (int i = 0; i < value.length; i++) {
            
            int temp = value[i];
            
            //in image example used x and y were using i and j here 
            int j = i - 1;
            
            while ((j > -1) && (value[j] > temp)) {
                
                value[j + 1] = value[j];
                
                j--;
            }
            
            value[j + 1] = temp;      
        }
    }
}
