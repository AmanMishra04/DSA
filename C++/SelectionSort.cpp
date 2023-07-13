#include<bits/stdc++.h>
using namespace std;

int main(){

    int n, temp;
    cout<<"Enter the size of array: ";
    cin >>n;

    int arr[n];
    
    cout<<"Enter the elements of array: ";
    for(int i=0; i<n; i++){
        cin >>arr[i];
    }

    for(int i=0; i<n-1; i++ ){
        int smallest = i;
        for(int j=i+1; j<n; j++){
            if(arr[smallest] > arr[j]){
                smallest = j;
            }
        }
        //swap
        temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }

    cout<<"Sorted array is: ";
    for(int i=0; i<n; i++){
        cout <<arr[i] <<" ";
    }

    return 0;
}