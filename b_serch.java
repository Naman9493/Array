import java.util.*;
public class b_serch {
     public static int Binary_search(int arr[],int s,int l,int h,int e) {
        int f=1;
        int mid;
    
        while(l<=h){
            mid=(l+h)/2;
       if(arr[mid]==e){
        return 1;
        
    }
        else if(e>arr[mid]){
           l=mid+1;}
        else{
          h=mid-1;
        }}
        return -1;
       }   

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Give size of your array :");
          int s = sc.nextInt();
         System.out.print("Give all elements : ");
         int arr[]=new int[s];
         for (int i=0;i<s;i++){
            arr[i]=sc.nextInt();
         }
         System.out.print("Enter Search element: ");
        int e=sc.nextInt();
         int l=0;
         int h=arr.length-1;
         

         
         int f=Binary_search(arr, s, l, h, e);
         if(f==1){
            System.out.print(" Search element found ");
         }
         else{
            System.out.print(" Search element not found ");
         }
    }
}
