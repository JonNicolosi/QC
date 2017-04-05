#include <iostream>
#include <cstdlib>
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



    void backtrack (int&c){
        c--;
        if (c==-1){
                exit(0);
        }
    }


    void print ( int b[]){
        static int count = 0;
        cout << "Solution #" << ++count << endl;
        cout << "  " <<b[0] <<" "<<b[1]<< ' '<< endl;
        cout << b[2] <<" "<<b[3] <<" "<<b[4]<<" "<<b[5]<< ' '<< endl;
        cout << "  " <<b[6] <<" "<<b[7]<< ' '<< endl;
    }




    int main(){

        int q[8];
        q[0]=1;
        int c=1;

        for (int i = 0; i<8; c++ ) {
            if (c==8)
        {
        print(q);
            c--;
                q[c]++;
        }
        else
        q[c] = 1;
            for (int i = 0; i<8; q[c]++)
               {
                if ( q[c] == 9 ){
                    c--;
                    if ( c == -1 ){
                        return 0;
                    }
                    else continue;
                }
        if (ok(q,c)){
            break;
        }
        else{
            continue;
        }
            }
        }
}
