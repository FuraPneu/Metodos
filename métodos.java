import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public String endereco;
    public String RG
    public Date data_de_nascimento;

public Pessoa(String nome, String cpf, String endereco, String RG,
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.RG = RG;
    this.data_de_nascimento = data;
    )

    public void alteraEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    } 

    public void mudaNome(String novoNome){
        this.nome = novoNome;

    }
}
