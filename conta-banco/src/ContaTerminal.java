import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO:Conhecer e Importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //EXIBIR as mensgens par o noso usuario
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("por favor digite o seu código de úsuario !");
        int numero = scanner.nextInt();

        System.out.println("por favor digite seu Nome e Sobrenome ");
        String nome = scanner.next();
        String sobrenome = scanner.nextLine();
        String nomeCliente = nome + " " + sobrenome;

        System.out.println("Por favor digite seu saldo !");
        double saldo = scanner.nextDouble();

        //EXIBIR a mensagem conta criada
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
