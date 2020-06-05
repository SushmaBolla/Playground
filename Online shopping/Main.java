#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i,x,y,z;
  std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  std::cout<<"In Flipkart Rs.";
  x=a - a*b/100+c;
  std::cout<<x<<"\nIn Snapdeal Rs.";
  y=d - d*e/100+f;
  std::cout<<y<<"\nIn Amazon Rs.";
  z=g - g*h/100+i;
  std::cout<<z<<"\nHe will prefer ";//<<((x<=y)?((x<=z)?"Flipkart":"Snapdeal"):((y<=z)?"Snapdeal":"Amazon"));//Type your code here.
  if(x<=y&&x<=z)
    std::cout<<"Flipkart";
  else if(y<=z && y<=x) 
    std::cout<<"Snapdeal";
  else
    std::cout<<"Amazon";
}