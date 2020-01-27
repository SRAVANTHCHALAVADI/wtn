import java.util.*;
public class S1 {
    public static void main(String args[]) {
        int l=args.length,temp=0;
        int n=3;
        if(n*n!=l){
            System.out.println("Please enter 9 integer numbers");
        }else{
      int a[][]=new int[l][l];
      for(int i=0;i<l/3;i++){
          for(int j=0;j<l/3;j++){
              a[i][j]=Integer.parseInt(args[temp]);
              temp++;
              
          }
      }
       int max= a[0][0];

      for(int i=0; i<l/3; i++){
            for(int j=0; j<l/3; j++){
                if(max<a[i][j]){
                    max= a[i][j];
                }
            }
      }
      
      System.out.println(max);
    }
    }
}