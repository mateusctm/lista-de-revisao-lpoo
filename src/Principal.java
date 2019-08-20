import java.text.ParseException;
import java.util.Scanner;
public class Principal {
    public static void main(String[]args) throws ParseException{
        Scanner ler = new Scanner(System.in);
        System.out.println("informe nome , altura e data de nascimento");
        String nome = ler.next();
        double altura = ler.nextDouble();
        String dataNs = ler.next();
        
        Pessoa pessoa = new Pessoa(nome, altura, dataNs);
        System.out.println("informe o ano atual");
        int ano = ler.nextInt();
        System.out.println(pessoa.calcularIdade(ano));
        Agenda agenda = new Agenda();
        
        agenda.armazenaPessoa(nome, altura, dataNs);
        System.out.println(agenda.buscarPessoa(nome));
        agenda.imprimeAgenda();
        System.out.println("informe a posição da agenda");
        int index = ler.nextInt();
        agenda.imprimePessoa(index);
    }
    
}
