import java.util.*;
public class Array1{
    public static void main(String[] args) {
        int []arr=new int[10];
        Scanner sc=new Scanner (System.in);
        int sum=0;
        int count=0;
        while(count <10){
            
            int num=sc.nextInt();
            if(num==0 || num<0)break;
            arr[count]=num;
            sum+=num;

            
            count++;
        }
        System.out.print(sum);

    }
}