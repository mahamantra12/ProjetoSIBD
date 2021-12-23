
public class Telefone{
    private int idleitor;
    private int numero;
    public void Telefone(int id,int numero){
        this.idleitor = id;
        this.numero = numero;
    }
    public void setid(int id){
        this.idleitor = id;
    }
    public void setnumero(int numero){
        this.numero = numero;
    }
    public int getid(){
        return this.idleitor;
    }
    public int getnumero(){
        return this.numero;
    }
}
