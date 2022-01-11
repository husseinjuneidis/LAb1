import java.util.Scanner;

/**
 * Created by Arabic on 20/02/09.
 */
public class Insert_Item {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=in.nextInt();

        }


        System.out.print("The array elements is : ");
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
