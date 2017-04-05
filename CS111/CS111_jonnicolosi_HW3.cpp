#include <iostream>

using namespace std;

int main()
{
    int x;
    cout << "Enter an integer: ";
    cin >> x;

    if (x<0) {
        cout << "Goodbye" << endl;
        return 0;
    }

    while (x>0)
    {
        cout << x--;

    }
}
