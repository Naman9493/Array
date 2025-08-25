public class sum {
    public static void sum(int arr[],int a){
   boolean b=false;
   for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++ ){
         if(arr[i]+arr[j]==a){
            System.out.println("first is "+i +" second is "+j);
            b=true;
         }
      }
   }if(b==false){
      System.out.println("not found");
   }
}
public static void main(String[] ar){
   int arr[]={12,3,4,67,86,4,3};
   int a=79;
   sum(arr,a);
}
}