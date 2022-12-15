import java.util.Scanner;

public class Insertion_Sort {

    static void insertionSort(int [] arr){
        for(int i=1; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int a = sc.nextInt();
        int input[] = new int [a];
        System.out.println("Enter the numbers : ");
        for(int i=0; i<a; i++){
            input[i] = sc.nextInt();
        }
        insertionSort(input); //sorting array elements using Selection Sort
        System.out.println("Sorted number list : ");
        for(int i=0; i < input.length; i++){
            System.out.print(input[i] + "\t");
        }
    }
}
