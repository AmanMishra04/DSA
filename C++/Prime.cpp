#include<bits/stdc++.h>
using namespace std;

int main(){

    int num, ctr;
    cin >> num;

    for(int i=1; i*i<=num; i++){

        if(num%i==0){
            ctr++;

            if((num/i)!= i){
                ctr++;
            }
        }
    }
    if(ctr == 2) cout <<"Prime" <<endl;
    else cout <<"Not prime" <<endl;
}