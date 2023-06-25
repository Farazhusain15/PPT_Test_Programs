import java.util.Arrays;
import java.util.Scanner;

public class LastZero {
    public static int[] LastZero(int[] arr){
        int n=arr.length;
        int p0=0;
        int curr=0;

        for (int i=0;i<n;i++){
            if (arr[curr]!=0){
                int temp=arr[curr];
                arr[curr]=arr[p0];
                arr[p0]=temp;
                curr++;
                p0++;
            }
            else {
                   curr++;
                continue;

            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the Array Elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=LastZero(arr);
        System.out.println(Arrays.toString(ans));
    }
}
