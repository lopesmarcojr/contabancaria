public class Conta {

    private int agencia;
    private int numero;
    private double saldo;

    public Conta(){

    };

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    };

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void transferir(double valor, int numero, int agencia){
        if(numero == this.numero && agencia  == this.agencia){
            this.saldo -= valor;
        }
    }

    public void imprimirExtrato(){
        System.out.println("Agência: " + agencia);
        System.out.println("Numero da conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
