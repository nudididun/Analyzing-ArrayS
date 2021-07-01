/*
Didunoluwa
CSCI 281
Analyzing Arrays
Date: Sunday 18th April, 2021
 */


import java.util.Random;

public class ArrayComparison {
    public static void main(String[] args) {
        int highLimit = 130;
        int lowLimit = 110;
        int size = 25;

        System.out.print("\nWelcome. \nThis Program compares the results of two arrays within the fixed range you provide." +
                "\nIt will calculate the number of high values each array has along with the number of ties. " +
                "\nAlter the array size, high points and low points in the main method of the code.\n\n");


        int[] firstArray = initializeArray(highLimit, lowLimit, size);
        int[] secondArray = initializeArray(highLimit, lowLimit, size);
          printTwoArrays(firstArray, secondArray);
          CompareArrays(firstArray, secondArray);
    }

    public static int[] initializeArray(int upperLimit, int lowerLimit, int elements) {
        int[] arrayOfInts = new int[elements];
        Random rand = new Random();
        int numberValue = upperLimit - lowerLimit + 1;
        for (int dex = 0; dex < elements; dex++) {
            arrayOfInts[dex] = rand.nextInt(numberValue) + lowerLimit;
        }
        return arrayOfInts;
    }

    public static void printTwoArrays (int [] array1, int [] array2)

        {
            for (int i = 0; i<array2.length; i++)
            {
                String i_str = String.format("Index %2d:  %4d  %4d", i, array1[i], array2[i]);
                System.out.print(i_str + "\n");
            }
        }

    public static void CompareArrays (int[] array1, int [] array2)
    {
        int highs = 0;
        int highs2 = 0;
        int tie = 0;
        for (int i = 0; i<array2.length; i++)
        {
           if (array1[i] == array2[i])
           {
               tie++;
           }
           else if (array1[i] > array2[i])
           {
               highs++;
           }
           else
           {
               highs2++;
           }
        }

          String Comparison = "\n\nArray 1 has "+highs+" highs.";
                Comparison += "\nArray 2 has "+highs2+ " highs.";
                Comparison += "\nThere are "+tie+ " ties.";

          System.out.print (Comparison);

          System.out.print ("\n\nProgram now terminating...\n");

    }

}
