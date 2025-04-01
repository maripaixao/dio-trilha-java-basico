import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("-= Olá, bem-vindo ao banco Babylon! =-");

        System.out.print("Para criar sua conta, informe o seu nome completo: ");
        String name = sc.nextLine();

        System.out.print("Digite o número da Agência com dígito: ");
        String agency = sc.next();

        System.out.print("Digite o número da conta: ");
        int accountNumber = sc.nextInt();

        System.out.print("Informe seu saldo R$ ");
        double value = sc.nextDouble();

        Cliente account = new Cliente();
        account.accountCreated(name, agency, accountNumber, value);

        sc.close();
    }
}