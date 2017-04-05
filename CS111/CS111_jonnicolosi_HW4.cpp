#include <iostream>
using namespace std;

int main() {


   for (int r = 1; r <= 10; r=r+2) {
     for (int c = 1; c <= r; c++){
        cout << "*";}
     cout << endl;
   }

    for (int a=9; a>=0; a=a-2){
        for (int b = 1; b <= a; b++){
            cout << "*";}
        cout << endl;
    }

   return 0;
}
