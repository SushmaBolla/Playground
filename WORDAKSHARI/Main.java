#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50][50],c=0;
  int i;
  for(i=0;;i++){
    cin.getline(a[i],50);
    if(strcmp(a[i],"####")==0)
      break;
    c++;
  }
  std::cout<<a[0]<<"\n";
  for(i=0;i<c;i++){
    if(a[i][strlen(a[i])-1]==a[i+1][0])
      std::cout<<a[i+1]<<"\n";
  }//Type your code here.
}