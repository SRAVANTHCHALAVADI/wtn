import java.util.*;
public class S2 {
    public static void main(String args[]) {
        int l=args.length,temp=0;
        int n=2;
        if(n*n!=l){
            System.out.println("Please enter 4 integer numbers");
        }else{
      int a[][]=new int[2][2];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              a[i][j]=Integer.parseInt(args[temp]);
              temp++;
              
          }
      }
       
      for(int i=n-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
               System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
      
      
    }
    }
}