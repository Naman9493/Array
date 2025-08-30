public class sorted_matrix {
      public static boolean sort(int a[][],int key) {
        int n=a.length;
        
        int r=0;
        int c=a[0].length-1;
        while(r<n&& c>=0){
            if(a[r][c]==key){
                System.out.println(r+" "+c);
                return true;
            }
            else if(a[r][c]<key){
                r++;
            }
            else if(a[r][c]>key){
                c--;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int a[][]={{10,20,30},{40,50,60},{70,80,90}};
        int key=50;
        boolean b=sort(a, key);
        System.out.println(b);
    }
}
