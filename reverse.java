public class reverse {
    public static void  reverse(int a[]){
        int n=a.length;
        for(int i=0;i<n/2;i++){
         int temp=a[i];
         a[i]=a[n-1-i];
         a[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
         System.out.print(a[i]+" ");
        }
      
       }
 

    public static void main(String[] args) {
        int a[]={2,3,6,5,7,4};
        reverse(a);
       
    }
}
