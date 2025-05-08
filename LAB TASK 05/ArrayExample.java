public class ArrayExample
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }
        int sum = 0;
        for (int num : numbers)
        {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("\nAverage of the Array Elements:");
        System.out.println("The average of the array elements is: " + average);
    }
}
