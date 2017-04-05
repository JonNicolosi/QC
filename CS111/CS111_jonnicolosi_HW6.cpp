#include <iostream>

using namespace std;


    bool isALeapYear( int year )
{

	if ( (year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0))
		return true;
	else
		return false;
}

int main()
{

    int x;

    cout << "Enter a year to check if it is/was a leap year: " << endl;

    cin >> x;

    int a = 1;

    while (x<0) {
        if (a==2){
            cout << "Bye-bye, idiot! " << endl;
            return 0;

        }

        cout << "Try again. " << endl;
        cin >> x;

        a++;
    }

    if (isALeapYear(x)){
        cout << x << " is a leap year. " << endl;
    }

    else {
        cout << x << " is not a leap year. " << endl;
    }
    return 0;
}
