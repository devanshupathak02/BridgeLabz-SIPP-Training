import java.util.*;
public  class Temperature{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Eneter temp in celsius");
int temp=sc.nextInt();

System.out.println("temp in f" + (float)((temp * 9/5) + 32));
}
}
