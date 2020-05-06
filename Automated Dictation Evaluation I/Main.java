#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char str1[100];char str2[100];
    int i=0; 
    cin>>str1;
    cin>>str2;
    i=strcmp(str1,str2);    
    if(i==0)
    cout<<"It is correct";
    else
    cout<<"It is wrong";
    return 0;
}