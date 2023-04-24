import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayUtils {
    private ArrayUtils(){}

    public static int[] readFromFile(String fileName) throws FileNotFoundException, InvalidNumberException {
        int[] arrayOfNumbers = new int[10];
        int i = 0;
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                int numbers = Integer.parseInt(line);
                if (line.isEmpty()) {
                    continue;
                }
                if (numbers < 0) {
                    throw new InvalidNumberException("Negative numbers");
                }
                arrayOfNumbers[i] = numbers;
                i++;
            }
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            throw e;
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
            throw e;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw e;
        } catch (Exception e) {
            System.out.println("Unknown exception");
        }
        return arrayOfNumbers;
    }


    public static int sumOfNumbers(int[] arr) {
        int sumOfNumbers = 0;
        try {
            for (int i : arr) {
                if (i == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                sumOfNumbers += i;
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown exception ");
        }
        return sumOfNumbers;
    }
}

