#include<iostream>
using namespace std;
int main()
{
int p,d;
 float m;
 cin>>m>>p>>d;
  int res=m*p;
  if(res>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}
