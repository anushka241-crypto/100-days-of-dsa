import java.util.*;

public class LinearSearchwithComparisonCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean val=false;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<arr.length;i++){
            c++;
            if(arr[i]==k){
                System.out.println("Found at index:"+i);
                System.out.println("Comparions:"+c);
                val=true;
                break;
            }
        }
        if(!val){
            System.out.println("Element not found");
            System.out.println("Comparisons: " + c);
        }
    }
}
