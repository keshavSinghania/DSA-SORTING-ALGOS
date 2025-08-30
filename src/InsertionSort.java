import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the ele of your array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,n);

        System.out.println("Your sorted array");
        System.out.println(Arrays.toString(arr));
    }

    //function for selection sort
    public static void selectionSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
