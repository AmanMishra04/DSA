#include<bits/stdc++.h>
using namespace std;

int main(){

    int num;
    vector<int> ls;
    cin >> num;

    for(int i=1; i*i <= num; i++){

        if(num%i == 0){

            ls.push_back(i);

            if(((num/i))!= i){
                ls.push_back(num/i);
            }
        }    
    }
    sort(ls.begin(), ls.end());
    for(auto it : ls){
        cout <<it <<" ";
    }
}