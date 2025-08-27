class insertion_sort{
  public static void insertion_sort(int a[]) {
       for(int i=1;i<a.length;i++){
        int j=i;
            while(j>0&& a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
       System.out.println("After sorting");
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
     }
      public static void main(String[] args) {
        int a[]={15,0,3,4,0,2,6};

        insertion_sort(a);
       
    }
}
