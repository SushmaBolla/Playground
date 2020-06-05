#include<iostream>
int main()
{
  int n,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  int r;
  std::cin>>r;
  for(i=0;i<n;i++){
    if(a[i]==r){
      std::cout<<"She passed her exam";
      exit(0);
    }
  }
  std::cout<<"She failed";// Type your code here
}