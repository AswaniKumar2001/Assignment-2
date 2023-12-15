import java.util.*;

public class ten {
    public static void main(String[] args) {
        Scanner ten = new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        //enter no of elements in the array
        System.out.println("Enter no of elements :");
        int n = ten.nextInt();

        //initializing array
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            a1.add(ten.nextInt());
        }
        Collections.sort(a1);
        int c=0;
        for(int i=0;i<n;i++){
            if(a1.get(i)==0 || a1.get(i)==-1 ){
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println("both or one of 0 and -1 are not present");
        }
        else{
            System.out.println("both or one of 0 and -1 are present");
        }
    }
}
