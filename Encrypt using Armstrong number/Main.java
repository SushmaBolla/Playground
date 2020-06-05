#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int n1=n;
  int c=0;
  while(n){
    c++;
    n=n/10;
  }
  int t=n1;
  int s=0;
  while(n1){
    s=s+(power(n1%10,c));
    n1=n1/10;
  }
  if(t==s)
    return 1;
  else
    return 0;
  //Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}