import java.io.IOException;
import java.util.Scanner;

public class EvenNumber {
	
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
    	for (int i = 1; i <= number; i++) {
    		if (i % 2 == 0) System.out.println(i);
    	}
    }
	
}