import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente leorio = new Cliente("Leorio", "12345");

        Conta contaCorrente = new ContaCorrente(leorio);
        Conta poupanca = new ContaPoupanca(leorio);

        contaCorrente.depositar(100);
        contaCorrente.imprimirConta();

        contaCorrente.transferir(100, poupanca);
        contaCorrente.imprimirConta();
        poupanca.imprimirConta();
    }
}