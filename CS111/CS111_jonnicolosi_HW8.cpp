#include <iostream>

using namespace std;

    void displayArray(int x[], int cap){

        for(int i = 0; i < cap; i++){
            cout << x[i];
            if (i<cap-1){
                cout << ", ";
            }
            else {
                cout << ".";
            }
        }
    }




    int main()
{
    int cap;
    int a[] = {0,1,2,3,4,5,6,7,8,9};
    cin >> cap;
    while (cap > 10){
        cout << "Illegal, number is greater than array size. Try again! " << endl;
        cin >> cap;

    }

    displayArray(a,cap);
    return 0;



}
