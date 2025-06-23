
import java.util.*;

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int age=sc.nextInt();
            if(age >=18) System.out.println("can vote");
            else System.out.println("cannot vote");
        }    
    }
}
