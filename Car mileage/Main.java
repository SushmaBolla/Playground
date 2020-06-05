#include<iostream>
using namespace std;
int main()
{
  int petrol,dist,possibleDist;
  float m;
  std::cin>>m;
  std::cin>>petrol>>dist;
  possibleDist=m*petrol;
  if(possibleDist >= dist)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}