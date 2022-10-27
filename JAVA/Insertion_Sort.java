import java.util.*;
public class Insertion_Sort{

    public static void printArr(int arr[]){
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }    
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n= sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        //  Insertion Sort
        for (int i=1; i<arr.length; i++){
            int current= arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        printArr(arr);
    }
}