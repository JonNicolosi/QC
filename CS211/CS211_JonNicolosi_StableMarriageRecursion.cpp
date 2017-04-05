#include <iostream>
#include <cmath>
using namespace std;

    bool ok(int q[], int col){
            int mp[3][3] = {0,2,1,0,2,1,1,2,0};
            int wp[3][3] = {2,1,0,0,1,2,2,0,1};
            for (int i = 0; i < col; i++){
                if (q[col]==q[i])
                    return false;
            }
            for(int i=0; i<col; i++) {
            if (mp[i][q[col]] < mp[i][q[i]] && wp[q[col]][i] < wp[q[col]][col] )
                return false;
            if (wp[q[i]][col] < wp[q[i]][i] && mp[col][q[i]] < mp[col][q[col]])
                return false;
            }
            return true;

    }

    void print(int q[]) {
       int i,j;
       cout<<"Man"<<"  "<<"Woman"<<endl;
       for( i=0;i<3;i++)
       {
          cout<<" "<<i<<"     "<<q[i]<<endl;
       }

    }

void move(int* q, int i) // try place in col i
{
 if(i==3)
 {
 print(q);
 return;
 }

 for(int j=0;j<3;j++) // j is the row value
 { q[i]=j;
 if(ok(q,i)) // try and place a queen in row j of col i,if yes
 move(q,i+1); // go to next column otherwise try next j
 }

 // no value of j worked so return;
};
int main()
{
 int q[3];
 move(q,0);
 return 0;
}