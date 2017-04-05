#include <iostream>
using namespace std;


	int main(){

		int b[8][8] = {0},r,c=0;
		b[0][0] = 1;
		int x = 0;
		nc:

		        c++;
                if (c==8){
                x++;
                cout << x << endl << endl;
				goto print;
                }
                r = -1;


		nr:


		    r++;

			if (r==8){
                    goto backtrack;
			}

        // row conflict
		for (int i=0; i<c; i++){
			if (b[r][i]==1){
				goto nr;
			}
		}
		// up diagonal test
		for (int i=1;((c-i>=0)&&((r-i)>=0)); i++){
			if (b[r-i][c-i]==1){
				goto nr;
			}
		}
		// down diagonal test
		for (int i=1;((c-i>=0)&&((r+i)<8));i++){
			if(b[r+i][c-i]==1){
				goto nr;
			}
		}
		b[r][c]=1;
				goto nc;
		backtrack:
		     c--;
			if (c==-1){
				return 0;
			}
			r=0;
			while (b[r][c]!=1){
				r++;
			}
		b[r][c]=0;
			goto nr;

		print:
		for(int j = 0; j<8;j++){
				for (int k = 0; k<8; k++){
					cout << b[j][k];
				}
		cout << endl;
			}
		cout << endl;


		goto backtrack;

}
