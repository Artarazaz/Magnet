import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 1;
        scanner.nextLine();
        String string = scanner.nextLine();
        for (int i = 0; i < n-1; i++){
            String string1 = scanner.nextLine();
            if (!string1.equals(string)){
                string = string1;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
