
public class Livro{
    private String nome;
    private String autor;
    private int edicao ;
    private int ano ;
    private String editora;
    
    public void Livro(String n, String a, int ed,int an,String edi){
        this.nome = n;
        this.autor = a;
        this.edicao = ed;
        this.ano = an;
        this.editora = edi;
        
    }
    
public void setnome(String n){
    this.nome = n;
}
public void setautor(String a){
    this.autor = a;
}
public void setedicao(int ed){
    this.edicao = ed;
}
public void setano(int an){
    this.ano = an;
}
public void seteditora(String edi){
    this.editora = edi;
}

public String getnome(){
    return this.nome;
}
public String getautor(){
    return this.autor;
}
public int getedicao(){
    return this.edicao;
}
public int getano(){
    return this.ano;
}
public String geteditora(){
    return this.editora;
}

    
}
