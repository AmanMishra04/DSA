import java.util.*;

public class MergeSort {
    
    public static void conquer(int arr[], int start, int mid, int end){
        int merged[]=new int[end-start+1];
        
        int idx1=start;
        int idx2=mid+1;
        int x=0;

        while(idx1 <= mid && idx2 <= end){
           
            if(arr[idx1] <= arr[idx2]){           //Conquer the first half
                merged[x++] = arr[idx1++];                
            }
            else{
                merged[x++]=arr[idx2++];          //Conquer the second half
            }
        }
        
        while(idx1 <= mid){
            merged[x++]=arr[idx1++];
        }

        while(idx2 <= end){
            merged[x++]=arr[idx2++];
        }

        for(int i=0, j=start; i<merged.length; i++,j++){
            arr[j]=merged[i];
        }

    }

    public static void divide(int arr[], int start, int end){

        if(start == end){                  //Base condition
            return;
        }
        
        int mid= start + (end-start)/2;

        divide(arr, start, mid);          //Dividing the first half
        divide(arr, mid+1, end);          //Dividing the second half
        conquer(arr, start, mid, end);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        divide(arr, 0, n-1);
        
        //Printing array
        System.out.println("Sorted array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}