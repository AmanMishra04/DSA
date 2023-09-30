import java.util.Scanner;

public class Array_MinMax {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Taking input from the user
        System.out.print("Enter the elements in the array: ");
        for (int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        // Finding the minimum element in the array
        int min = array[0];

        for (int i=0; i<n; i++){
            if (array[i] < min){
                min = array[i];
            }
        }

        // Finding the maximum element in the array
        int max = array[0];

        for (int i=0; i<n; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        System.out.println("The minimum element in the araay is: " +min);
        System.out.println("The maximum element in the araay is: " +max);

        sc.close();
    }
}
