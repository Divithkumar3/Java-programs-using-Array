import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int average;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        average=sum/n;
        System.out.print("The average is: "+average);
    }}
