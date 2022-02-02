import java.sql.*;

public class Locacao extends Conexaobd{ 
    private int idlocacao;
    private int idleitor;
    private int idlivro;
    private double valor;
    private String obs;
    public Locacao (int lei,int li, double v){
    	this.idleitor = lei;
    	this.idlivro = li;
    	this.valor = v;
    }
    public void setlivro(int id){
        this.idlivro = id;
    }
    public void setleitor(int id){
        this.idleitor = id;
    }
    public void setvalor(double v){
    	this.valor = v;
    }
 	public void setobs(String o){
 		this.obg = o;
 	}
    public int getlocacao(){
        return this.idlocacao;
    }
    public int getleitor(){
        return this.idleitor;
    }
    public int getlivro(){
        return this.idlivro;
    }
    public double getvalor(){
        return this.obs;
    }
    public String getobs(){
        return this.obs;
    }       
}
