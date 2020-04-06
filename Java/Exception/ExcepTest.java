import java.io.*;
public class ExcepTest
{
    public static void main(String[] args)
    {
        try
        {
            int[] a = new int[2];
            System.out.println("Access element three: " + a[0]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exceptrion thrown : " + e);
        }finally
        {
            System.out.println("Out of the block!");
            System.out.println("==================================");
        }
    }
}