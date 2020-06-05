#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,c;
  std::cin>>n>>c;
  int mugs[n];
  int sum=0;
  for(int i=0;i<n;i++){
    std::cin>>mugs[i];
  }
  for(int i=0;i<n;i++)
    sum+=mugs[i];
  std::cout<<((sum<=c)?"YES":"NO");//Type your code here.
}