import java.util.*;
public class Selection_Sort{

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

        //  Selection Sort
        for (int i=0; i<n-1; i++){
            int smallest=i;
            for(int j=i+1; j<n; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
        }
        printArr(arr);
    }
}