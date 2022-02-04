public class Main {

    public static void main(String[] args) {
        Cliente Vanessa = new cliente();
        Vanessa.setNome("Vanessa");

        Conta cc = new ContaCorente(Vanessa);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(Vanessa);
        cc.transferir(100, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}