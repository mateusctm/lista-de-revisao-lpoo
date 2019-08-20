
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    private Date dataNs;
    private int idade;
    
    public Pessoa(String nome,double altura, String dataNs) throws ParseException{
        this.nome = nome;
        this.altura = altura;
        this.dataNs =  new SimpleDateFormat("yyyy-MM-dd").parse(dataNs);
        
    }
    public Pessoa(){
    }

    Pessoa(String nome, double altura, Date data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public Date  getDataNs() {
        return dataNs;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDataNacimento(String dataNs) throws ParseException {
     
         this.dataNs =  new SimpleDateFormat("yyyy-MM-dd").parse(dataNs);
         
    }
    public void dadosPess(){
     System.out.println(nome + altura + dataNs);
    }
    
    public int calcularIdade(int ano){
      
        Date date = new Date();

        Calendar calendar = new GregorianCalendar();

        calendar.setTime(dataNs);
        

        int year = calendar.get(Calendar.YEAR);
        
        idade = ano - year;
        return idade;
    }


    }
 
        
   
    
    
    

