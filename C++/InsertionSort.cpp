#include<bits/stdc++.h>
using namespace std;

int main(){

    int n, temp;
    cout<<"Enter the size of array: ";
    cin>>n;

    int arr[n];
    cout<<"Enter the elements of array: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    for(int i=1; i<n; i++){     // i is tracking unsorted array
        int current= arr[i];    //current is the element to be placed at its correct position
        int j=i-1;              //j is tracking sorted array
        
        while(j>=0 && current< arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
        //placement of current element
        arr[j+1]=current;
    }

    cout<<"Sorted array is: ";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}