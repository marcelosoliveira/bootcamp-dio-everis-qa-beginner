import java.util.Locale;
import java.util.Scanner;

public class EntradaSaidaCPF {
	public static void main(String[] args) {

		Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        String[] cpf = sc.nextLine().replace("-", ".").split("\\.");

        for (String number : cpf) {
            System.out.println(number);
        }
        sc.close();
   }
}
