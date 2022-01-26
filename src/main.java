public class main {

    public static void main(String[] args) {

        Cliente Jherssica = new Cliente();
        Jherssica.setNome("Jherssica");

        Conta cc = new ContaCorrente(Jherssica);
        Conta Poupanca = new ContaPoupanca(Jherssica);


        cc.depositar(100);
        cc.transferir(100,Poupanca);

        cc.imprimirExtrato();
        Poupanca.imprimirExtrato();
    }
}
