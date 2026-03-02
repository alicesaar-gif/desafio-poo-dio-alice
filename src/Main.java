import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Orientado a Objetos");
        curso1.setDescricao("Aprendendo Abstração, Herança, Encapsulamento e Polimorfismo");
        curso1.setCargaHoraria(8); 

        Curso curso2 = new Curso();
        curso2.setTitulo("Collections Framework");
        curso2.setDescricao("Dominando List, Set e Map");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Como se destacar no mercado Java");
        mentoria.setData(LocalDate.now());

    
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer - DIO");
        bootcamp.setDescricao("Desafio de Projeto: Abstraindo um Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlice = new Dev();
        devAlice.setNome("Alice"); 
        devAlice.inscreverBootcamp(bootcamp);
        
        System.out.println("Olá, " + devAlice.getNome() + "!");
        System.out.println("Conteúdos Inscritos: " + devAlice.getConteudosInscritos());
        
        System.out.println("--- Progredindo no Bootcamp ---");
        devAlice.progredir(); 
        devAlice.progredir(); 
        
        System.out.println("Conteúdos Concluídos: " + devAlice.getConteudosConcluidos());
        System.out.println("Seu XP Total: " + devAlice.calcularTotalXp());
        
        System.out.println("-----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        
        System.out.println("XP do " + devJoao.getNome() + ": " + devJoao.calcularTotalXp());
    }
}