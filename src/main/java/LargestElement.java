import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {

            System.out.print("Element " + (i + 1) + ": ");

            array[i] = scanner.nextInt();

        }

        scanner.close();

        int largestElement = findLargestElement(array);

        System.out.println("The largest element in the array is: " + largestElement);

    }

    private static int findLargestElement(int[] array) {

        int largest = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > largest) {

                largest = array[i];

            }

        }

        return largest;

    }
}
