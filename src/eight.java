import java.util.*;

public class eight {
    public static void main(String[] args) {
        Scanner eight = new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        //enter no of elements in the array
        System.out.println("Enter no of elements :");
        int n = eight.nextInt();

        //initializing array
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            a1.add(eight.nextInt());
        }
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a1.get(i)>a1.get(j)){
                    temp=a1.get(i);
                    a1.set(i,a1.get(j));
                    a1.set(j,temp);
                }
            }
        }
        System.out.println("2nd minimum element is : "+a1.get(1));
    }
}
