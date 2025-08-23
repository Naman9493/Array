public class reverse {
    // public static void  reverse(int a[]){
    //     int n=a.length;
    //     for(int i=0;i<n/2;i++){
        //  int temp=a[i];                                                ////////////  FIRST METHOD
    //      a[i]=a[n-1-i];
    //      a[n-1-i]=temp;
    //     }
    //     for(int i=0;i<n;i++){
    //      System.out.print(a[i]+" ");
    //     }
      
    //    }
//  *******************************************************************************/// SECOND METHOD
 public static void Rev(int a[]) {
        int f=0;
        int last=a.length-1;
        while(f<last){
            int temp=a[last];
            a[last]=a[f];
            a[f]=temp;
            f++;
            last--;
        } 
    }

    public static void main(String[] args) {
        int a[]={2,3,6,5,7,4};
        // reverse(a);
       Rev(a);for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    
    }
}
