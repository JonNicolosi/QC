#include <iostream>
#include <search.h>
using namespace std;

    bool isPalindrome(string x){

        int b = x.length();

        char c;

        for (int i = 0; i < b; i++){
                c = x[i];
           if (x[i]==x[b-1] || (x[i]==(x[b-1])-32) || (x[i]-32==x[b-1])) {
                return true;
            }
            else {
                return false;
            }
            b--;
        }

    }






int main()
{

    string y;
    cout << "Enter a word: " << endl;
    cin >> y;
    if (isPalindrome(y)==1){
        cout << y << " is a palindrome. " << endl;
    }
    else {
        cout << y << " is not a palindrome. " << endl;
    }


    return 0;
}
