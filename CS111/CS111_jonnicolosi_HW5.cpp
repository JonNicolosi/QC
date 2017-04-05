#include <iostream>

using namespace std;

    int digitsum(int n){

    int sum = 0;

    while (n!=0){

        sum = sum + n%10;

        n = n/10;
    }

    return sum;



}


    int printdigits(int a){

    cout << "The digits are: " << endl;


    while (a>10) {

        cout << a%10 << endl;
        a = a/10;
    }





    return a;

    }


    int main()
{

    int x;

    cout << "Enter a number: " << endl;

    cin >> x;

    if (x<0){

        cout << "Goodbye. " << endl;
        return 0;
    }

    cout << printdigits(x) << endl;

    cout << "The sum of the digits is: " << endl << digitsum(x);

return 0;



}
