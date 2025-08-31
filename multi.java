import java.util.*;
class multi{
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter First Array Row & Column size: ");
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    System.out.print("Enter Second Array Row & Column size: ");
     int r2=sc.nextInt();
    int c2=sc.nextInt();
    if (c1!=r2){
        System.out.println("Multiplication is not possible");
    }
    else{
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        System.out.println("Enter the matrix  a element: ");
         for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                 a[i][j]=sc.nextInt();
            }
            
         }
         System.out.println("Enter the matrix  b element: ");
         for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
            
         }
         int c[][]=new int[r1][c2];
        
         for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
           
         }
         System.out.println("After multiplication : ");
          for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
         }
    }
}
}