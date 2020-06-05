#include<iostream>
using namespace std;
int main()
{
  int n,i;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array\n";
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  int locat;
  std::cout<<"Enter the location where you wish to insert an element\n";
  std::cin>>locat;
  if(locat<n){
  int n1;
  std::cout<<"Enter the value to insert\n";
  std::cin>>n1;
  std::cout<<"Array after insertion is\n";
  for(i=0;i<n;i++){
    if(i==locat-1)
      std::cout<<n1<<"\n";
    std::cout<<a[i]<<"\n";
  }
  }
  else
    std::cout<<"Invalid Input";//Type your code here.
}