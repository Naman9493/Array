import java.util.*;
public class num {
    public static int element(int arr[]) {
         int k = 0 ;
         int r  = 1 ;
         
         while(r < arr.length){
            if(arr[k] == arr[r]){
             r++;
            }
            else {
             
            arr[k+1] = arr[r];
             k++;
             r++ ;
            }
         }
         return k +1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
         System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=element(a);
        System.out.println(c);
        
    }
}
