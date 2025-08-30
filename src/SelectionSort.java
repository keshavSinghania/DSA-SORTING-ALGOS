import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of you array");
        int n = sc.nextInt();

        int[] myArr = new int[n];
        System.out.println("Enter the elements of your array");

        for(int i=0; i<n; i++){
            myArr[i] = sc.nextInt();
        }

        sort(myArr, n);

        System.out.println(Arrays.toString(myArr));
    }

    //function to sort array using selection sort
    public static void sort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int minInd = i;
            for(int j=i; j<n; j++){
                if(arr[minInd] > arr[j]){
                    minInd = j;
                }
            }
            //swap with minimum index
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }
}
