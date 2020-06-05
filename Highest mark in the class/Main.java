#include<iostream>
int main()
{
  int n,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  int larg=a[0];
  for(i=1;i<n;i++)
    if(a[i]>larg)
      larg=a[i];
  std::cout<<larg;// Type your code here
}