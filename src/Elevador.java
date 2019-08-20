/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MATEUS
 */
public class Elevador {
    private int quantAndar;
    private int quantPessoa;
    private int pessoa;
    private int andarAtual;
    
    public Elevador(int quantAndar, int pessoa){
        this.pessoa = pessoa;
        this.quantAndar = quantAndar;
    }

    public int getQuantAndar() {
        return quantAndar;
    }

    public int getQuantPessoa() {
        return quantPessoa;
    }

    public int getPessoa() {
        return pessoa;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setQuantAndar(int quantAndar) {
        this.quantAndar = quantAndar;
    }

    public void setQuantPessoa(int quantPessoa) {
        this.quantPessoa = quantPessoa;
    }

    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    
    public void entrar(){
        if(pessoa <quantPessoa){
            pessoa = pessoa + 1;
        }
        else{
            System.out.println("nao é possivel a entrada de mais pessoas, elevador cheio");
        }
    }
    public void saida(){
        if(pessoa > 0){
            pessoa = pessoa - 1;
        }else{
            System.out.print("nao há pessoas no elevador");
        }
    }
    public void subir(){
        if(andarAtual < quantAndar){
            andarAtual = andarAtual + 1;
        }else{
            System.out.println("nao é possivel subir, elevador está no ultimo andar");
        }
    }
    public void descer(){
        if(andarAtual > 0){
            andarAtual = andarAtual - 1;
        }else{
            System.out.println("elevador se encontra no terreo");
        }
    }
}
