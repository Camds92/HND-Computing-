package WorkSheetOne;

public class functions
{

    public static void outputArrayValues(int [] arrayParameter)
    {
        int counter = 0;

        while (counter < arrayParameter.length) {
            System.out.println(arrayParameter[counter]);
            counter++;
        }
    }//End of outputArrayValues method

    public static void main(String[] args)
    {
        int[] intergerArray1 = {12, 1, 5, 7, 8, 15, 6, 18, 9, 3};
        int[] intergerArray2 = {4, 17, 12, 2, 10};

        outputArrayValues(intergerArray1);
        outputArrayValues(intergerArray2);
    }// end of main method
}// End of class
