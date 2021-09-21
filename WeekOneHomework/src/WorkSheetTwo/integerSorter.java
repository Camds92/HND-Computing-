package WorkSheetTwo;

public class integerSorter
{
    // method to sort array lowest to highest
    public static void bubbleSortLowToHigh(int[] arrayParameter)
    {
        int i;
        int j;
        int temp;
        int n = arrayParameter.length;

        for (i = 0; i < n-1; i++)
        {
            for (j = 0; j < n - i - 1; j++)
            {
                if (arrayParameter[j] > arrayParameter[j+1])
                {
                    temp = arrayParameter[j];
                    arrayParameter[j] = arrayParameter[j+1];
                    arrayParameter[j+1]= temp;
                }// end of if statement
            }//end of nested loop statement
        }// end of loop statement
    }//End of bubbleSort method

    public static void bubbleSortHighToLow(int[] arrayParameter)
    {
        int i;
        int j;
        int temp;
        int n = arrayParameter.length;

        for (i = 0; i < n-1; i++)
        {
            for (j = 0; j < n - i - 1; j++)
            {
                if (arrayParameter[j] < arrayParameter[j+1])
                {
                    temp = arrayParameter[j+1];
                    arrayParameter[j+1] = arrayParameter[j];
                    arrayParameter[j]= temp;
                }// end of if statement
            }//end of nested loop statement
        }// end of loop statement
    }//End of bubbleSort method

    //Start of method to display array
    public static void outputArrayValues(int[] arrayParameter)
    {
        int counter = 0;
        int n = arrayParameter.length;

        while (counter < n) {
            System.out.print(arrayParameter[counter] + " ");
            counter++;
        }
        System.out.println();
    }//End of outputArrayValues method

    // Start of main sort method
    public static void main(String[] args)
    {

        int[] integerArray1 = {4, 1, 5, 7, 8, 2, 6, 10, 9, 3};

        bubbleSortHighToLow(integerArray1);
        System.out.println("Sorted Array from high to low:");
        outputArrayValues(integerArray1);

        bubbleSortLowToHigh(integerArray1);
        System.out.println("Sorted Array from low to high:");
        outputArrayValues(integerArray1);
    }// end of main method
}// end of class