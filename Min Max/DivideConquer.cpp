#include<bits/stdc++.h>
using namespace std;


/*-----------Min-Max Function-------------*/
void max_min(int a[], int s, int e, int *min, int *max){
   //condition-1
   if(s == e){
    *max = a[s];
    *min = a[s];
   }
   //end condition-1
   
   else
   //condition-2
   if(s == e-1){
       if(a[s] < a[e]){
           *max = a[e];
           *min = a[s];
       }
       else{
           *max = a[s];
           *min = a[e];
       }
   }
   //end condition-2
   
   //condition-3
   else{
       //Divide
       int mid, max1, min1;
       max1 = INT_MIN;
       min1 = INT_MAX;
       mid = (s + e)/2;
       max_min(a, s, mid, min, max);
       max_min(a, mid+1, e, &min1, &max1);
       //Conquer
       if(max1 > *max)
            *max = max1;
       if(min1 < *min)
            *min = min1;
   }
   //end condition-3
   
}

/*-------------Driver Function-------------*/
int main(){
    int a[] = {11, 9, 10, 25, 8, 15, 4, 13, 2};    //Taking array 'a'
    int max, min;   //taking max and min elements
    max = min = a[0];
    max_min(a, 0, 8, &min, &max);  //calling function max_min()
    cout<<"\n Maximum element in the array is "<<max;  //Printing max value
    cout<<"\n Minimum element in the array is "<<min;  //Printing min value
    return 0;
}
