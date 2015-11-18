#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<string>
using namespace std;
bool isValidHour(int hour);
bool isValidMin(int min);
bool isValidSecond(int second);
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string time;
    cin>>time;
    string iter1=":", iter2=":";
    int first_index, second_index;
    first_index = time.find_first_of(":");
    if(first_index<0)
        return 0;
    second_index = time.find_last_of(":");
    if(second_index<0)
        return 0;
    
    int hour = stoi(time.substr(0, first_index));
    int min = stoi(time.substr(first_index+1,second_index- first_index),nullptr,10);
    int seconds = stoi(time.substr(second_index+1,2),nullptr,10);
    if(!isValidHour(hour) || !isValidMin(min) ||!isValidSecond(seconds))
        return 0;    
    
    string timeF = time.substr(second_index+3);
    
    if(timeF.compare("AM")==0)
    {   
        if(hour==12 & min==0)
            hour=0;
         else if(hour==12 & min!=0)
            hour=0;
            
        if(hour>9)            
            cout<<hour;
        else
            cout<<"0"<<hour;
    }
    else if(timeF.compare("PM")==0)
    {
        if(hour==12)
            cout<<hour;
        else
            cout<<(hour+12)%24; 
    }
    else
        return 0;
    
    if (min<9)
        iter1 = ":0";
    if (seconds<9)
        iter2 = ":0";
    cout<<iter1<<min<<iter2<<seconds;    
    return 0;
}
bool isValidHour(int hour){
    if(hour>12 || hour<0)
        return false;
    return true;
}
bool isValidMin(int min){
    if(min>59 || min<0)
        return false;
    return true;
}
bool isValidSecond(int seconds){
    if(seconds>59 || seconds<0)
        return false;
    return true;
}