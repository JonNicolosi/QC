#include <iostream>
using namespace std;

	int main () {
		int x;
		cout <<  "Enter a positive integer with 2 digits ";
		cin >> x;
		
		int sum;
		int firstdigit;
		int seconddigit;
		firstdigit = (x/10);
		seconddigit = (x%10);
		sum = firstdigit + seconddigit;	
		

		if ((x>100) || (x<10))  {
			cout << "Too difficult!" << endl;
		}
		else cout << "The sum of each digit of your number is : " << sum << endl;
		return 0;
}
