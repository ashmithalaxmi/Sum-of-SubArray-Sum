import java.util.Scanner;

public class SumOfSubArray {
    public static int SumOfSubarray(int[] arr, int n){
        int[] P= new int[n];
        int sum=0;
        int result=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            P[i]=sum;
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==0){
                    result+=P[j];
                }
                else{
                    result+=P[j]-P[i-1];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] array= new int[n];
        for(int i=0; i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(SumOfSubarray(array,n));

    }
}
