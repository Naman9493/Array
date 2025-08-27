public class sort_problem {
    public static void Sort(int a[]) {
        
        for(int i=0;i<a.length-1;i++){
             
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]==0 && a[j+1]!=0){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    
                }
            }
        }
        System.out.println("After sorting");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }}
         public static void main(String[] args) {
        int a[]={15,0,3,4,0,2,6};
        Sort(a);
         }
}
