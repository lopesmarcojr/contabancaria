public class Cliente {

    private String nome;
    private Conta conta;
    private String banco;

    public Cliente(){

    }

    public Cliente(String nome, Conta conta, String banco) {
        this.nome = nome;
        this.conta = conta;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Cliente: '" + nome + '\'' +
                ", Numero da Agencia: " + conta.getAgencia() + ", Número da conta: " + conta.getNumero() +
                ", Banco: '" + banco;
    }
}
