import java.util.Scanner;

public class Selection_Sort {

    static void selectionSort(int [] arr){
        for(int i=0; i< arr.length-1; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
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
        selectionSort(input); //sorting array elements using Selection Sort
        System.out.println("Sorted number list : ");
        for(int i=0; i < input.length; i++){
            System.out.print(input[i] + "\t");
        }
    }
}