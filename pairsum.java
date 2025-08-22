public class pairsum {
     public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int tp=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            for ( int j=i+1;j<a.length;j++){
                System.out.print("("+a[i] +","+ a[j]+")");
                sum=sum+a[i]+a[j];
                tp++;
                System.out.println("sum: "+sum);
            }
            
           System.out.println();
        }
        System.out.println("total pair: "+tp);
    }
}
