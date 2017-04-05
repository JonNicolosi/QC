#include <iostream>
#include <cmath>
using namespace std;

int main()
{
  int q[8], c=0;
  int x = 1;

  q[0]=0;

    nc:
        {
        c++;

        if(c==8) {
        goto print;
        }
        q[c]=-1;
        }


    nr:
        {
        q[c]++;

        if(q[c]==8) goto backtrack;
        }

        /*for (int i = 0; i<c; i++)
            if (q[i]==q[c])goto nr;
        for (int i = 0; i<c; i++)
            if (c-i==q[c]-q[i])
                goto nr;
        */

        for (int i = 0; i<c; i++)
        if (q[c]==q[i] || abs(q[c]-q[i])==c-i)
        goto nr;
        goto nc;

    backtrack:
        {
        c--;

        if(c==-1) return 0;
        goto nr;
        }

    print:
        cout << endl;
        cout << x << endl << endl;

        x++;
        int b[8][8] = {0};

        for (int j = 0; j<8; j++){
            b[q[j]][j] = 1;
        }

        for (int m = 0; m<8; m++){
            for (int n = 0; n<8; n++){
                cout << b[m][n];
                b[m][n] = 0;
            }
            cout << endl;
        }



    goto backtrack;


}
