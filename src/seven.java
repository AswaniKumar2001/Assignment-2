import java.util.*;

public class seven {
    public static void main(String[] args) {
    Scanner seven = new Scanner(System.in);
        ArrayList<Integer>a1=new ArrayList<>();
        ArrayList<Integer>a2=new ArrayList<>();
        //enter no of elements in the array
        System.out.println("Enter no of elements for 1st array :");
        int n = seven.nextInt();

        //initializing array
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            a1.add(seven.nextInt());
        }
        //enter no of elements in the array
        System.out.println("Enter no of elements for 2nd array :");
        int m = seven.nextInt();

        //initializing array
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<m;i++){
            a2.add(seven.nextInt());
        }
        System.out.println("common elements are :");
        for (int i=0;i<n;i++){
            if(a2.contains(a1.get(i))){
                System.out.println(a1.get(i));
            } 
        }
    }
}
