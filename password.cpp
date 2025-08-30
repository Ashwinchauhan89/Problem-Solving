#include<iostream>
using namespace std;
int main() {
    int pwd=8799;
    int mypwd;
    cout<<"ENTER THE PASSWORD"<<endl;
    cin>>mypwd;
    while(pwd>0)
    
    
    {
        if(pwd!=mypwd) {
            cout<<"ENTER PASSWORD IS INVALID , PLEASE TRY AGAIN"<<endl;
            cin>>mypwd;
        }




        
        else {
            cout<<"ENTER PASSWORD IS RIGHT, YOUR SYSTEM HAS TO BE A UNLOCKED, THANKS YOU";
            break;
        }
    }
}









