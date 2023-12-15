import java.util.*;

public class six {
    public static void main(String[] args) {
        Scanner six = new Scanner(System.in);
        ArrayList<String> a1=new ArrayList<>();
        //enter no of strings in the array
        System.out.println("Enter no of strings in array :");
        int n = six.nextInt();

        //initializing array
        System.out.println("Enter strings :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            a1.add(six.next());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a1.get(i).equals(a1.get(j))){
                    System.out.println("duplicate string is :"+ a1.get(i));
                    break;
                }
        }
        }
    }
}