#include<bits/stdc++.h>
using namespace std;

int main(){

    int num, ld, sum, temp;
    cin >>num;
    temp = num;

    while(num > 0){
        ld = num%10;
        sum = sum + pow(ld, 3);
        num = num/10;
    }

    if(sum == temp) cout <<"Armstrong number" <<endl;
    else            cout <<"Not Armstrong number" <<endl;

}