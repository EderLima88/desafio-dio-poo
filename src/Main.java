import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

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



        System.out.println(curso1);
        System.out.println(curso1);
        System.out.println(mentoria1);

    }
}