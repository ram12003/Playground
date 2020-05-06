#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  cin>>a;
  cin>>b>>c;
  d=b*75;
  e=c*30;
  f=d+e;
  if(f<=a)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}
