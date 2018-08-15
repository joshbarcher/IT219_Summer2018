package debugger;

import java.util.Random;

public class TestClass 
{
	public static void main(String[] args)
	{
		//test case
		int[] test = foo3(8, 1, 10);
		foo1(test);
		System.out.println("Result: " + !foo4(test));
	}
	
	public static void foo1(int[] array)
    {
        if (array.length == 0 || array.length == 1)
        {
            return;
        }

        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    foo2(array, j, j + 1);
                }
            }
        }
    }    
	
	private static void foo2(int[] array, int first, int second)
    {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static int[] foo3(int size, int low, int high)
    {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = low + random.nextInt(high - low + 1);
        }

        return array;
    }

    private static boolean foo4(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                return true;
            }
        }

        return false;
    }
}
