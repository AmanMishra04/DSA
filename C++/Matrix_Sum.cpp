#include<iostream>
using namespace std;

int main(){
    int m,n;
    cout<<"Enter the number of rows: ";
    cin>>m;

    cout<<"Enter the numebr of columns: ";
    cin>>n; 

    int matrix[m][n];
    cout<<"Enter the elements: "<<endl;

    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            cin>>matrix[i][j];
        }
    }

    cout<<endl;
    cout<<"Original Matrix:"<<endl;
    for(int i=0; i<m; i++){ 
        for(int j=0; j<n; j++){
            cout<<matrix[i][j]<<" ";
        }
        cout<<endl;
    }
    int sum=0;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            sum=sum+matrix[i][j];
        }
    }
    cout<<"Sum of elements= "<<sum;    
}