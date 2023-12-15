import java.util.Scanner;

public class one {
    public static void main(String[] args){
        Scanner one = new Scanner(System.in);
        System.out.println("Enter no of elements");
        //reading the number of elements from the that we want to enter  
        int n = one.nextInt();
        //creates an array in the memory of length 10  
        int array[]= new int[10];

        System.out.println("Enter elements : ");
        for(int i=0; i<n; i++){
        //reading array elements from the user   
            array[i]=one.nextInt();
        }
        //taking sum as 0
        int s=0;
        for(int i=0;i<n; i++){
            s=s+array[i];
        }
        System.out.println("sum of elements in the array : "+s);
        //finding average of elements in the array
        int a=(s/n);
        System.out.println("average of elements in the array : "+a);
    }
    
}
