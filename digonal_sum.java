import java.util.*;
  class digonal_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int n=a.length;
         int sum=0;
         int second=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
             for(int j=0;j<n;j++){
               
                if(i==j){
                    sum=sum+a[i][j];
                }
                else if(i+j==n-1){
                    sum=sum+a[i][j];
                }

            }
            System.out.println();
        }
        System.out.println(sum+" ");
        System.out.println(second+" ");


// ********************************************************************  METHOD 2
        for(int i=0;i<n;i++){
            sum+=a[i][i];
            if(i!=n-i-1){
                sum=sum+a[i][n-i-1];
            }
        }
        System.out.println(sum+" ");
    }
}

