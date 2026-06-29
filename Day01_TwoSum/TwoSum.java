import java.util.*;
public class InsertElement {
    public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
    int[] arr=new int[n+1];
    for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
    }
int pos =sc.nextInt();
int x=sc.nextInt(); 
int idx=pos-1;//0 based indexing
for(int j=n;j>idx;j--){
    arr[j]=arr[j-1];
    }
    arr[idx]=x;
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
