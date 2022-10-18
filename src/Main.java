public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente(1092,1234,0);
        Conta cp = new ContaPoupanca(1093,4567,0);

        Cliente cliente1 = new Cliente("Marco",cc,"Itaú");
        Cliente cliente2 = new Cliente("Iago", cp, "Caixa Econômica");

        cc.depositar(300);
        cp.depositar(400);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println(cliente1.toString());

    }
}