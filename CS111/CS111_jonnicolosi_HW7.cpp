#include <iostream>

using namespace std;

    int digits(int& sum, int n){

    if (n<1) return n;


    cout << n%10 << endl;

    sum = n%10 + digits(sum, n/10);



    return sum;


}







int main()
{
    int sum, n;

    cout << "Enter a number: " << endl;

    cin >> n;

    while (n<0) {
        cout << "Try again. " << endl;
        cin >> n;
    }

    digits(sum,n);

    cout << "The sum is " << sum << endl;


    return 0;

}
