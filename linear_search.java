import java.util.*;
public class linear_search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Give size of your array :");
          int s = sc.nextInt();
         System.out.print("Give all elements : ");
         int arr[]=new int[s];
        for (int i=0;i<s;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.print("Enter Search element: ");
        int e=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                System.out.println("search element is "+e+"found at index: "+i);
            break;}
        }
    }
}
