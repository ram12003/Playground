#include<iostream>
int main()
{
  int n,a,b;
  std::cin>>a>>b>>n;
  std::cout<<"Enter first number : Enter second number : Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  switch(n) {
   case 1: 
      std::cout<<a+b;
      break;
   case 2: 
      std::cout<<a-b;
      break;
   case 3: 
      std::cout<<a*b;
      break;
   case 4: 
      std::cout<<a/b;
      break; 
   case 5: 
      std::cout<<a%b;
      break;    
   default: 
      std::cout<<"Invalid operation";
      break;
   }
   return 0;
}