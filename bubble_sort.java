public class bubble_sort {
     public static void Bubble(int a[]) {
        int swap=0;
        for(int i=0;i<a.length-1;i++){
             swap=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    swap++;
                }
            }
        }
        System.out.println("After sorting");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
