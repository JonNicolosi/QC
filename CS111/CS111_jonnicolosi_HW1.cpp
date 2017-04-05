#include <iostream>
using namespace std;

	int main () {

	double length;
	double width;
	cout << "Enter the length and width of a rectangle that you wish to find the area and perimeter of " << endl;
	cin >> length;
	cin >> width;
	cout << "The perimeter of the rectangle is " << ((length*2)+(width*2)) << endl;
	cout << "The area of the recetangle is " << (length*width) << endl;
	return 0;
}
