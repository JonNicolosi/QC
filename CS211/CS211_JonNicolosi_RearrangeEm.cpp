#include <iostream>
#include <cstdlib>
using namespace std;

    void printArray (int a[], int n){
        for (int i = 0; i<n; i++){
            cout << a[i] << " ";
        }
    }

    void populateArray (int a[], int n){
        for (int i = 0; i<n; i++){
            a[i] = rand()%100+1;
        }
    }




    void p(int k[], int n){


     {
      int i, j, x = 1;
      int temp;

      for(i = 1; (i <= n) && x; i++)
     {
          x = 0;
          for (j=0; j < (n -1); j++)
         {
               if (k[j+1] < k[j])
              {
                    temp = k[j];
                    k[j] = k[j+1];
                    k[j+1] = temp;
                    x = 1;
              }
          }
     }

     }




}






	int main(){
		int t1[5], t2[10],t3[15],t4[20];
		populateArray (t1, 5);
		printArray (t1,5);
		p(t1,5);
		cout << endl;
		printArray (t1,5);
		cout << endl << endl;

        populateArray (t2, 10);
		printArray (t2,10);
		p(t2,10);
		cout << endl;
		printArray (t2,10);
        cout << endl << endl;

        populateArray (t3, 15);
		printArray (t3,15);
		p(t3,15);
		cout << endl;
		printArray (t3,15);
        cout << endl << endl;

        populateArray (t4, 20);
		printArray (t4,20);
		p(t4,20);
		cout << endl;
		printArray (t4,20);
        cout << endl << endl;

		return 0;
	}
