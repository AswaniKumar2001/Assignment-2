import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner three = new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<>();
        //enter no of elements in the array
        System.out.println("Enter no of elements :");
        int n = three.nextInt();

        //initializing array
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            array.add(three.nextInt());
        }
        System.out.println(array);
        System.out.println("enter the element that you want to remove :");
        int m = three.nextInt();
        for(int i=0;i<n;i++){
            if(array.get(i)==m){
                array.remove(i);
                break;
            }
        }
        System.out.println("updated array : "+array);
    }
    
}
