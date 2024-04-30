package DAO;
import java.util.ArrayList;
import model.Aluno;

public class AlunoDAO {
    public static ArrayList<Aluno>minhaLista= new Arraylist<>();
    public static ArrayList<Aluno>getMinhaLista(){
   return minhaLista;   
    }
    public static void setMinhaLista(ArrayList<Aluno>minhaLista){
        AlunoDAO.minhaLista= minhaLista;
    }
    public static int maiorID(){
        int maiorId=0;
        for(int i=0;i<minhaLista.size();i++){
            if(minhaLista.get(i).getId()>maiorId){
                maiorId=minhaLista.get(i).getId();
            }
        }  
        return maiorId; 
    }
}