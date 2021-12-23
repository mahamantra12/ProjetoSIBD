
public class Leitor{
    private String nome;
    private String email;
    
    public void Leitor(String nome,String email){
        this.nome = nome;
        this.email = email;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setemail(String email){
        this.email = email;
    }
    public String getnome(){
        return this.nome;
    }
    public String getemail(){
        return this.email;
    }
}
