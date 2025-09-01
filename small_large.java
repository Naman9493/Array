import java.util.*;
public class small_large {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int n=a.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int large=0;
        int small=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
                if(a[i][j]>large){
                large=a[i][j];} 
                if(a[i][j]<small)    {
                    small=a[i][j];
                }
            }

            System.out.println();
        }
        System.out.println(large+" ");
       
        System.out.println(small+" ");
}
}
