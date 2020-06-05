#include<iostream>
#include<bits/stdc++.h>
void fun(int m,int n,int req){
  if(pow(m,n)>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
int main(){
  int m,n,req;
  std::cin>>m>>n>>req;
  fun(m,n,req);
}