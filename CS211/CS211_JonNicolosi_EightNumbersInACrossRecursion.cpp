#include <iostream>
#include <cmath>
using namespace std;

    bool ok(int b[], int c){
        int a[8][5] = {
            {-1},
            {0, -1},
            {1, -1},
            {0, 1, 2, -1},
            {1, 2, 3, -1},
            { 2, 4, -1},
            { 0, 3, 4, -1},
            {3, 4, 5, 6, -1}};
        for (int i = 0; i < c; ++i)
            if (b[i] == b[c]) return false;
        for (int i = 0; a[c][i]!=-1; i++){
            if (1==abs(b[c]-b[a[c][i]])) return false;
        }
        return true;
    }

    void print ( int b[]){
        static int count = 0;
        cout << "Solution #" << ++count << endl;
        cout << "  " <<b[0] <<" "<<b[1]<< ' '<< endl;
        cout << b[2] <<" "<<b[3] <<" "<<b[4]<<" "<<b[5]<< ' '<< endl;
        cout << "  " <<b[6] <<" "<<b[7]<< ' '<< endl;
    }
    void move(int* q, int i) // try place in col i
    {
        if(i==8){
            print(q);
            return;
        }

        for(int j=0;j<8;j++) // j is the row value
        {
            q[i]=j;
            if(ok(q,i)) // try and place a queen in row j of col i,if yes
            move(q,i+1); // go to next column otherwise try next j
        }

 // no value of j worked so return;
};
int main()
{
 int q[8];
 move(q,0);
return 0;
}
