import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arrayOfNumbers = ArrayUtils.readFromFile("/Users/gio_paksa/IdeaProjects/G.P_Homework/inputNumber");
            int sum = ArrayUtils.sumOfNumbers(arrayOfNumbers);
            System.out.println("Sum of numbers in the array: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unknown exception");
            e.printStackTrace();
        }
    }
}