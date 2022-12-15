import java.util.Scanner;

public class Bubble_Sort {
    static void bubbleSort(int [] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<(n-i-1); j++){
                if(arr[j] > arr[j+1]){
                    //swap elements:
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int a = sc.nextInt();
        int input[] = new int [a];
        System.out.println("Enter the numbers : ");
        for(int i=0; i<a; i++){
            input[i] = sc.nextInt();
        }
        bubbleSort(input); //sorting array elements using bubble sort
        System.out.println("Sorted number list : ");
             for(int i=0; i < input.length; i++){
                 System.out.print(input[i] + "\t");
         }
    }
}