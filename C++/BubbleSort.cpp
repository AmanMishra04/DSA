#include<bits/stdc++.h>
using namespace std;

int main(){

    int n;
    cout<<"Enter the size: ";
    cin >> n;

    int arr[n];

    cout<<"Enter the elements: ";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    // Bubble Sort
    for (int i=0; i<n-1; i++){
        for(int j=0; i<n-i-1; j++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }

    cout<<"Sorted array: ";
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
}