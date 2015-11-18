#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
// prints the stair case
int main() {
    int number;
    cin>>number;
    if(number<1)
        return 0;
    for(int i=0;i<number;i++){
        
        for(int j=0; j<number-i-1;j++)
            {
            cout<<" ";
        }
        for(int k=0;k<=i;k++)
            cout<<"#";
        cout<<endl;
    }
        
    return 0;
}