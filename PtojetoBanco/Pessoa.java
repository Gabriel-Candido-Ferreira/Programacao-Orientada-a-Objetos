//POJO - Plain Old Java Object
public class Pessoa {
  private String nome;
  private String cpf;
  private String endereco;
  private String telefone;

  //Construtores
  public Pessoa(String nome, String cpf, String endereco, String telefone){
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = "";
    this.telefone = "";
  }


  //Retorna o valor
  public String getNome(){
    return this.nome;
  }

  public String getCpf(){
    return this.cpf;
  }

  public String getEndereco(){
    return this.endereco;
  }

  public String getTelefone(){
    return this.telefone;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }
}
