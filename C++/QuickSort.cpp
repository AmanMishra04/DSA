#include<bits/stdc++.h>
using namespace std;

int partition(int arr[], int low, int high){
    int pivot=arr[high];
    int i=low-1;

    for(int j=low; j<high; j++){
        if(arr[j]<pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp=arr[i];
    arr[i]=pivot;
    arr[high]=temp;
    return i;
}

void sort(int arr[], int low, int high){
    if(low>=high){
        return;
    }

    int pivot= partition(arr, low, high);

    sort(arr, low, pivot-1);
    sort(arr, pivot+1, high);
}

int main(){
    int n;
    cout<<"Enter the size of array: ";
    cin>>n;

    int arr[n];
    cout<<"Enter the elements of array: ";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }

    sort(arr, 0, n-1);

    cout<<"Sorted array is: ";
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
}