import java.util.*;
class duplicate{
public static boolean Duplicate(int a[]) {
    boolean r=false;
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j]){
                
                r=true;
                return r;
                
            }
             }
    }
    
    return r;
 }   
 public static void main(String[] args) {
    int a[]={4,1,2,4,5};
    boolean n=Duplicate(a);
    if(n==true){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }      
}
}