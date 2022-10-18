public class ContaPoupanca extends Conta{

    public ContaPoupanca(){

    };

    public ContaPoupanca(int agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    };

    @Override
    public  void imprimirExtrato(){
        System.out.println("===Extrato da Conta Poupança===");
        super.imprimirExtrato();
    }

}
