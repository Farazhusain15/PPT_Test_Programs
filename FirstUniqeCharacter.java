import java.util.Arrays;
import java.util.Scanner;

public class FirstUniqeCharacter {
    public static char FirstUniqeCharacter(String s){
        char[] arr=s.toCharArray();
        int n=arr.length;
        char result;
        for (int i=0;i<n;i++){
           for (int j=i+1;j<n;j++){
               if (arr[i]==arr[j]) {
                   result=arr[i];

               return  result;
           }
           }
        }
        return (char) -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ans=FirstUniqeCharacter(s);
        System.out.println(ans);
    }
}
