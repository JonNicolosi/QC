#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;


    bool ok(int q[], int col){
            for(int i=0; i<col; i++)
            if(q[col]==q[i] || (col-i)==abs(q[col]-q[i])) return false;

            return true;
}

    void backtrack(int &col){

            col--;
            if(col==-1)
            {
                exit(1);
            }
    }
/*
    void print(int q[]){
        static int count=1;
        cout<< count++ <<endl<<endl;
        int i;
        for(i=0; i<8; i++)
        cout<<q[i]<<" ";
        cout<<endl<<endl;
    }
*/

    void fancyEQPrintout(int q[]) {
    int i,j,k,l;
    typedef char box[5][7];
    box bb,wb,wq,bq,*board[8][8];
    //fill in bb=black box and wb=whitebox
    for(i=0; i<5; i++){
        for(j=0; j<7; j++){
            wb[i][j]=' ';
            bb[i][j]=char(219);
            wq[i][j]=' ';
            bq[i][j]=char(219);
        }
    }

    wq[1][1] = char(219);
	wq[2][1] = char(219);
	wq[3][1] = char(219);
	wq[3][2] = char(219);
	wq[2][3] = char(219);
	wq[3][3] = char(219);
	wq[3][4] = char(219);
	wq[1][5] = char(219);
	wq[2][5] = char(219);
	wq[3][5] = char(219);

    bq[1][1] = char(' ');
	bq[2][1] = char(' ');
	bq[3][1] = char(' ');
	bq[3][2] = char(' ');
	bq[2][3] = char(' ');
	bq[3][3] = char(' ');
	bq[3][4] = char(' ');
	bq[1][5] = char(' ');
	bq[2][5] = char(' ');
	bq[3][5] = char(' ');

    //fill board with pointers to bb and wb in alternate positions
    for(i=0;i<8;i++){
        for(j=0;j<8;j++){
            if((i+j)%2==0){
                board[i][j]=&wb;
                if (q[i]==j)
                    board[i][j]=&wq;
            }
            else{
                board[i][j]=&bb;
                if (q[i]==j)
                    board[i][j]=&bq;
            }
        }

    }
    // print the board via the pointers in array board


    // first print upper border
    cout<<" ";
    for(i=0;i<7*8;i++)
    cout<<'_';
    cout<<endl;
    // now print the board
    for(i=0;i<8;i++)
        for(k=0;k<5;k++){
                cout<<" "<<char(179); //print left border
    for(j=0;j<8;j++)
        for(l=0;l<7;l++)
            cout<<(*board[i][j])[k][l];
            cout<<char(179)<<endl; // at end of line print bar and then newline
    }
    //before exiting print lower border
    cout<<" ";
    for(i=0;i<7*8;i++)
    cout<<char(196);
    cout<<endl;


}

    int main(){
        int q[8]; q[0]=0;
        int c=1;



    bool from_backtrack=false;


    while(true){
        while(c<8)
            {


            if(!from_backtrack)
                q[c]=-1;
            from_backtrack=false;


            while(q[c]<8){
                q[c]++;


                if (q[c]>=8){
                    backtrack(c);
                    continue;
                }

                if(ok(q,c))
                       break;

            }

            c++;

        }

        fancyEQPrintout(q);
        backtrack(c);
        from_backtrack=true;
    }
 return 0;
}
