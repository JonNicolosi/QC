#include <iostream>
#include <cstring>
using namespace std;

	int count(string x){

		int b = 0;

		for(int i = 0; i<x.length(); i++){

			if(x[i]=='a'){
				b++;
			}
		}
	return b;
	}

	int main(){

		string word;
		cout << "Enter a word: " << endl;
		cin >> word;
		cout << count(word);

	}

