#include<iostream>
using namespace std;
int main()
{
    int num,digit=0;
    cin>>num;
    do
    {
            num=num/10;
            digit++;
    }while(num!=0);
    cout<<digit;
    return 0;
}