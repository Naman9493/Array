public class stock {
     public static int buyandsell(int a[]) {
        int buystock=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<a.length;i++){
            if(buystock<a[i]){
                int p=a[i]-buystock;
                if(maxprofit<p){
                    maxprofit=p;
                }
            }
            else{
                buystock=a[i];
            }    
        }
        return maxprofit;   
    }
    public static void main(String[] args) {
        int a[]={10,8,12,7,15,6};
        
        int n=buyandsell(a);
        System.out.println(n);
    }
}
