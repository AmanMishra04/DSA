#include<iostream>
using namespace std;

int sum(int arr[], int n){
    int s=0;
    for(int i=0; i<n; i++){
        s=s+arr[i];
    }
    return s;
}

int main(){
    int n;
    cout<<"Enter the size: ";
    cin>>n;

    int arr[n];
    cout<<"Enter the elements: ";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    cout<<"Sum of array= "<<sum(arr, n);
}