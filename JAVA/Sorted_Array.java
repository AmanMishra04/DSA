//Check if an array is strictly increasing.

import java.util.*;
public class Sorted_Array {
    public static boolean isSorted(int arr[], int index){

        if(index==arr.length-1){
            return true;
        }

        if(arr[index]<arr[index+1]){
            //array is sorted till now
            return isSorted(arr, index+1);
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        boolean x=isSorted(arr, 0);
        if(x==true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}