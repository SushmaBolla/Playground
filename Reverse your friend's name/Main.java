#include<iostream>
#include<string.h>
int main() 
{ 
char s[100];
  std::cin.getline(s,100);
  int i;
  for(i=strlen(s)-1;i>=0;i--)
    std::cout<<s[i];//Type your code here
}