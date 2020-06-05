#include <iostream>
#include<string.h>
int main()
{
char str[100], rev[100];     
int c= 0, end, i;
std::cin.getline(str,100);
for(i=strlen(str)-1;i>=0;i--){
  rev[c]=str[i];
  c++;
}
rev[c]='\0';
//Your code goes here               
std::cout<<rev;
}