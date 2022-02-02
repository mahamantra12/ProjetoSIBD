import java.sql.*;
public class Leitor extends Conexaobd{
    private int idleitor;
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
    public boolean insertLeitor(){
        try{
            Statement statement = this.connection.createStatement();
            statement.executeUpdate("INSERT INTO Leitor (NomeLeitor, Email) VALUES("+this.nome+","+this.email+")");
            ResultSet rs = statement.executeQuery("SELECT * FROM Leitor WHERE NomeLeitor = "+this.nome+" AND Email = "+this.email);
            while(rs.next()){
                this.idleitor = rs.getInt("idleitor");
            }
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
            }
        }
    public boolean deleteLeitor(int id){ 
        try{
            Statement statement = this.connection.createStatement();
            statement.executeUpdate("DELETE FROM Leitor WHERE idLeitor = "+id);
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
            }        
        } 
    public boolean updatenomeLeitor(int id,String n){
        try{
            Statement statement = this.connection.createStatement();
            statement.executeUpdate("UPDATE Leitor SET NomeLeitor = "+n+" WHERE idLeitor = "+id);
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
            }  
        }
    public boolean updateemailLeitor(int id,String m){
        try{
            Statement statement = this.connection.createStatement();
            statement.executeUpdate("UPDATE Leitor SET Email = "+m+" WHERE idLeitor = "+id);
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
            }  
        } 
    public boolean selectLeitor(int id){
        try{
            Statement statement = this.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Leitor WHERE idLeitor = "+id);
            while(rs.next()){
                Integer idl = rs.getInt("idLeitor");
                String nomel = rs.getString("NomeLeitor");
                String emaill = rs.getString("Email");
                System.out.println(idl+" - "+nomel+" - "+emaill);
            }
            return true;
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }        
}
