
import java.util.*;
public class OddEven{
    public static void main(String[] args) {
       
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int main[]= new int[num];
        int count=0;
        //store the elements inn the array
        
        while(count < 10){
            
            main[count]=sc.nextInt();
            count++;
        }
        int Ecount=0;
        int Ocount=0;
        for(int i=0;i<10;i++){
            if(main[i] %2==0) Ecount++;
            else Ocount++;
        }
        int odd[]=new int[Ocount];
        int even[]=new int[Ecount];
        int m = 0;
        int n = 0;
        for(int i=0;i<num;i++){
            if(main[i] %2==0){
                even[m++]=main[i];
            }else{
                odd[n++]=main[i];
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

    }

}