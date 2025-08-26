class selection_sort{
     public static void selection_sort(int a[]) {
        for (int i=0;i<a.length-1;i++){
            int min=i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min]; 
            a[min]=temp;
        }
        System.out.println("After sorting");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={15,0,3,4,0,2,6};
        selection_sort(a);
    }
}