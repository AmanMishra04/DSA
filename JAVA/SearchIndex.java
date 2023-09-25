import java.util.Scanner;

public class SearchIndex {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();

        for(int i=0; i<n; i++){
            if (arr[i] == x){
                System.out.println("Element found at index " + i);
            }
        }

        sc.close();
    }
}
