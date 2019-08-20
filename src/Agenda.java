
import java.text.ParseException;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Agenda {
    private final Pessoa[]pessoas = new Pessoa[10];
    
    public void armazenaPessoa(String nome,double altura, String data) throws ParseException{
        
        Pessoa p1 = new Pessoa(nome,altura,data);
        
        for(int i=0;i<=pessoas.length;i++){
            if(pessoas[i] == null){
                pessoas[i] = p1;
                break;
            }
                
          }
        
    }
    public void removePessoa(String nome){
        for(int i=0;i<=pessoas.length;i++){
            if(pessoas[i].getNome() == null ? nome == null : pessoas[i].getNome().equals(nome)){
                pessoas[i] = null;
            }
        }
    }
    public int buscarPessoa(String nome){
        int a = 0;
        for(int i=0;i<=pessoas.length;i++){
            if(nome == null ? pessoas[i].getNome() == null : nome.equals(pessoas[i].getNome())){
                 a = i;
                break;
            }
        }
       
        return a ;
    
    }
    public void imprimeAgenda(){
        for(int i = 0;i<=pessoas.length;i++){
            if(pessoas[i] != null){
                System.out.println(pessoas[i].getNome()+pessoas[i].getAltura()+pessoas[i].getDataNs());
            } else {
            }
        }
    }
    public void imprimePessoa(int index){
        if(index <= pessoas.length){
            System.out.println(pessoas[index].getNome()+pessoas[index].getAltura()+pessoas[index].getDataNs());
        }
    }
    

}
