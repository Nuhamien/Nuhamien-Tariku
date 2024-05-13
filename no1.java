import java.util.Scanner;
 class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int searchNumber = input.nextInt();
        int counter = 0;
        for (int num : numbers) {
            if (num == searchNumber) {
                counter++;
            }
        }

        if (counter > 0) {
            System.out.println(searchNumber + " found " + counter + " times in the array.");
        } else {
            System.out.println(searchNumber + " not found in the array.");
        }

       input.close();
    }
}
