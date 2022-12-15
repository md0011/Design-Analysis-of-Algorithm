import java.util.Scanner;
public class Quick_Sort {

    static void quickSort(int [] arr, int first, int last){
        int i,j,pivot,temp;
        if(first < last){
            pivot = first;
            i = first;
            j = last;
            while(i < j){
                while(arr[i] <= arr[pivot] && i<last)
                    i++;
                while(arr[j] > arr[pivot])
                    j--;
                if(i < j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            temp = arr[pivot];
            arr[pivot] = arr[j];
            arr[j] = temp;
            quickSort(arr, first, j-1);
            quickSort(arr, j+1, last);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter : ");
        int a = sc.nextInt();
        int input[] = new int [a];
        System.out.println("Enter the numbers : ");
        for(int i=0; i<a; i++){
            input[i] = sc.nextInt();
        }
        quickSort(input,0,a-1); //sorting array elements using Quick Sort
        System.out.println("Sorted number list : ");
        for(int i=0; i < input.length; i++){
            System.out.print(input[i] + "\t");
        }
    }
}
