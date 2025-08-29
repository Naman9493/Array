class trapwater{
    public static void main(String[] args) {
        int h[]={4,6,2,3,0};
        int n=h.length;
        int l[]=new int[n];
        l[0]=h[0];
        for(int i=1;i<n;i++){
            if(h[i]>l[i-1]){
                l[i]=h[i];
            }
            else{
                l[i]=l[i-1];
            }
        }
        int r[]=new int[n];
        r[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            if(h[i]>r[i+1]){
                r[i]=h[i];
            }
            else{
                r[i]=r[i+1];
            }
        } 
        int trappedw=0;
        int water ;
        for(int i=0;i<n;i++){
            if(l[i]>r[i]){
                water=r[i];
            }
            else{
                water=l[i];
            }
            trappedw=trappedw+water-h[i];
            
        }
        System.out.println(trappedw);
    
    }
}
