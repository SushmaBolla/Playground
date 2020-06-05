#include<iostream>
using namespace std;
int fun(int *arr,int n){
  int o=0,e=0,i;
  for(i=0;i<n;i++){
    if(arr[i]%2==0)
      e++;
    else
      o++;
  }
  if(n==e)
    return 2;
  else if(n==o)
    return 1;
}
int main()
{
  int n;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n";
  int a[n];
  int i;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  std::cout<<"The array is ";
  if(fun(a,n)==1)
    std::cout<<"Odd";
  else if(fun(a,n)==2)
    std::cout<<"Even";
  else
    std::cout<<"Mixed";//Type your code here.
}