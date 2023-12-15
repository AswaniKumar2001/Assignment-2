import java.util.*;

public class nine {
    public static void main(String[] args) {
        Scanner nine = new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        //enter no of elements in the array
        System.out.println("Enter no of elements :");
        int n = nine.nextInt();

        //initializing array
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            a1.add(nine.nextInt());
        }
        Collections.sort(a1);
        for(int i=0;i<n;i++){
            if(a1.get(i)!=i+1){
                System.out.println("Missing number is: "+(i+1));
                break;
            }
        }
    }
}
