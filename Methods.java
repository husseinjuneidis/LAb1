import java.util.Scanner;

/**
 * Created by Arabic on 20/02/09.
 */
public class Methods {
    public static void main(String[] args) {

        int arr[]= new int [3];
        System.out.println("Enter Array Elements: ");
        insert(arr);
        System.out.print("Array Elements is : ");
        print(arr);
    }
    public static void insert(int arr[])
    {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i]=in.nextInt();
        }
    }

    public static void print(int arr[])
    {
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }

}
