import java.util.*;

public class four {
    public static void main(String[] args) {
        Scanner four = new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<>();
        //enter no of elements in the array
        System.out.println("Enter no of elements :");
        int n = four.nextInt();

        //initializing array
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            array.add(four.nextInt());
        }
        System.out.println(array);
        System.out.println("enter the element that you want to add :");
        int m = four.nextInt();
        System.out.println("enter the index :");
        int ind = four.nextInt();
        array.add(ind,m);
        System.out.println("updated array :"+array);
    }
}
