#include<iostream>
using namespace std;
int main() {
    int i,num;
    cout<<"enter the number :";
    cin>>num;
    cout<<"THE MUTLIPLICATIVE TABLE"<<num<<endl;
    for (i=1; i<=10; i++)
    {
        cout<<num<<"*"<<i<<"="<<num*i<<endl;
    }
}