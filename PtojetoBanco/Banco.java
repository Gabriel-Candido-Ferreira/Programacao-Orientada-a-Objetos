import java.util.ArrayList;

public class Banco {
  private ArrayList<Conta> contas;

  public Banco(){
    this.contas = new ArrayList<Conta>();
  }

  public boolean addConta(Conta c){
    return this.contas.add(c);
  }

  public Conta getContaByNro(String nroConta){
    for(int i=0; i<contas.size(); i++){
      Conta c = contas.get(i);
      if(c.getNro().equals(nroConta)){
        return c;
      }
    }
    return null;
  }
}
