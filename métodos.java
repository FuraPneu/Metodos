import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public String endereco;
    public String RG
    public Date data_de_nascimento;

public Pessoa(String _nome, String _cpf, String_endereco, String _RG,
    this.nome = _nome;
    this.cpf = _cpf;
    this.endereco = _endereco;
    this.RG = _RG;
    this.data_de_nascimento = _data;
    )

    public void alteraEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    } 

    public void mudaNome(String novoNome){
        this.nome = novoNome;

    }
}