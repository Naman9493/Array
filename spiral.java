import java.util.*;
public class spiral {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][4];
        int n=a.length;
        int m=a[0].length;
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sr=0;
        int er=a.length-1;
        int s=0;
        int ec=a[0].length-1;

        while(sr<=er&& s<=ec){
            for(int i=s;i<=ec;i++){
                System.out.print(a[sr][i]+" ");
            }
            
            for(int i=sr+1;i<=er;i++){
                System.out.print(a[i][ec]+" ");
            }
          
            for(int i=ec-1;i>=s;i--){
                if(sr==er){
                    break;
                }
                System.out.print(a[er][i]+" ");
            }
          
            for(int i=er-1;i>=sr+1;i--){
                if(s==ec){
                    break;
                }
                System.out.print(a[i][s]+" ");
            }
            s++;
            sr++; 
            er--;
            ec--;

        }
        System.out.println();

    }
}
