import java.util.List;

public class Banco {

    private String nome;
    List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaConta(Conta conta){
        contas.add(conta);
    }

    public void  removeConta(Conta conta){
        contas.remove(conta);
    }

    public void listarClientes(){

    }
}
