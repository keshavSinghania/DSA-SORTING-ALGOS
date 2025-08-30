import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        System.out.println("Enter the length of you array");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//input the size

        System.out.println("Enter the elements of the array ");
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr,n);

        System.out.println(Arrays.toString(arr));
    }

    //function to sort the array using bubble sort
    public static void bubbleSort(int[] arr, int n){
        for(int i=n-1; i>=1; i--){
            boolean swapped = false;
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    //swaping
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
