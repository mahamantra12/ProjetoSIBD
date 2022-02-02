import java.sql.*;

public class Endereco extends Conexaobd{
    private int idendereco;
    private int idleitor;
    private String tipoend;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    public void Endereco (int id, String te, String e, int n, String b, String c,String es){
        this.idleitor = id;
        this.tipoend = te;
        this.endereco = e;
        this.numero = n;
        this.bairro = b;
        this.cidade = c;
        this.estado = es;
    }
    
    public void setid(int id){
        this.idleitor = id;
    }
    public void settipoend(String n){
        this.tipoend = n;
    }
    public void setendereco(String n){
        this.endereco = n;
    }
    public void setnumero(int n){
        this.numero = n;
    }
    public void setbairro(String n){
        this.bairro = n;
    }
    public void setcidade(String n){
        this.cidade = n;
    }
    public void setestado(String n){
        this.estado = n;
    }
    public int getid(){
        return this.idleitor;
    }
    public String gettipoend(){
        return this.tipoend;
    }
    public String getendereco(){
        return this.endereco;
    }
    public int getnumero(){
        return this.numero;
    }
    public String getbairro(){
        return this.bairro;
    }
    public String getcidade(){
        return this.cidade;
    }
    public String getestado(){
        return this.estado;
    }
    public int getidend(){
        return this.idendereco;
    }
    
}
