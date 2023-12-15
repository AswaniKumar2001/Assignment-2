import java.util.*;

public class five {
    public static void main(String[] args) {
        Scanner five = new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<>();
        //enter no of elements in the array
        System.out.println("Enter no of elements :");
        int n = five.nextInt();

        //initializing array
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            array.add(five.nextInt());
        }
        int maxi=array.get(0);
        int mini=array.get(0);
        //loop for getting maximum element
        for(int i=1;i<n;i++){
            if(array.get(i)>maxi){
                maxi=array.get(i);
            }
        }
        //loop for getting maximum element
        for(int i=1;i<n;i++){
            if(array.get(i)<mini){
                mini=array.get(i);
            }
        }
        System.out.println("maximum element is : "+maxi);
        System.out.println("manimum element is : "+mini);
    }
}
