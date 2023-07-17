#include<bits/stdc++.h>
using namespace std;

void merge(int arr[], int si, int mid, int ei){
    int x=ei-si+1;
    int i=si, j=mid+1, k=0;

    int temp[x];

    while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];
        }
        else{
            temp[k++]=arr[j++];
        }
    }

    while(i<=mid){
        temp[k++]=arr[i++];
    }

    while(j<=ei){
        temp[k++]=arr[j++];
    }

    for(int i=si, k=0; i<=ei; i++, k++){
        arr[i]=temp[k];
    }
}

void divide(int arr[], int si, int ei){
    if(si>=ei){
        return;
    }
    int mid = (si+ei)/2;
    divide(arr, si, mid);
    divide(arr, mid+1, ei);
    merge(arr, si, mid, ei);
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

    divide(arr, 0, n-1);

    cout<<"Sorted array is: ";
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}