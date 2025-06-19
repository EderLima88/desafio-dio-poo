import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("um curso sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso C");
        curso2.setDescricao("um curso sobre C");
        curso2.setCargaHoraria(9);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Aula");
        mentoria1.setDescricao("Aula de java");
        mentoria1.setData(LocalDate.now());
/*
    ======Exemplo e comparaçãode polimosrfismo======
        List<String> conteudo = new ArrayList<>();

        Conteudos ment = new Mentoria();
        Conteudos cur = new Curso();

        System.out.println(curso1);
        System.out.println(curso1);
        System.out.println(mentoria1);
*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprendizado Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("-------------------------------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosIndcritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Progrediu");
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosIndcritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-------------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosIndcritos());
        devJoao.progredir();
        System.out.println("Progrediu");
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosIndcritos());
        System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}