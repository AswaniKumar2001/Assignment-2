import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner two = new Scanner(System.in);
        //enter no of elements in the array
        System.out.println("Enter no of elements :");
        int n = two.nextInt();

        //initializing array
        int array[]=new int[10];
        System.out.println("Enter elements :");
        //taking array elements from the user
        for(int i=0;i<n;i++){
            array[i]=two.nextInt();
        }
        System.out.println("Enter the element : " );
        int m = two.nextInt();
        //finding element index
        for(int i=0;i<n;i++){
            if(m==array[i]){
                System.out.println("index of the element is: "+i);
            }
        }

    }
}
