import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Paulo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos "+dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("\nConteudos Inscritos "+dev1.getConteudosInscritos());
        System.out.println("\nConteudos Concluídos "+dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Henrique");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos "+dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("\nConteudos Inscritos "+dev2.getConteudosInscritos());
        System.out.println("\nConteudos Concluídos "+dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularTotalXp());



    }
}





