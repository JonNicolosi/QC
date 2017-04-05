#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;


    bool ok(int q[], int col){
            for(int i=0; i<col; i++)
            if(q[col]==q[i] || (col-i)==abs(q[col]-q[i])) return false;

            return true;
}

   bool backtrack(int &col){
    col--;
    if(col==-1) return false;
    return true;
};

    /*void print(int n, int count){
        cout << "There are " << n << " solutions to the " << count << " Queens problem. " << endl;


    }
    */


    int queens(int n, bool from_backtrack, int count, int c){

        int* q = new int[n];

        for(int i=0; i<n; i++) q[i]=0;

     while(true){
        while(c<n)
            {


            if(!from_backtrack)
                q[c]=-1;
            from_backtrack=false;


            while(q[c]<n){
                q[c]++;


                if (q[c]>=n){
                    if (backtrack(c))
                    continue;
                    else return count;
                }

                if(ok(q,c))
                       break;

            }

            c++;
            from_backtrack=false;

        }
        count++;

        //print(count, n);
        if(!backtrack(c)) return count;
        from_backtrack=true;

    }
    delete [] q;
    return count;

    }



    int main(){
        int n;
        int count = 0;
        int c = 0;



    cout << "How large is the chess board? ";
    cin >> n;

    bool from_backtrack=false;

    for(int i=1; i<=n; i++){
        cout << "There are " << queens(i,from_backtrack, count, c) << " solutions to the " << i << " queens problem." << endl;
    }





 return 0;
}
