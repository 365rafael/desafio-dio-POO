import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Bootcamp de Java - Claro");
        curso1.setCargaHoraria(75);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Javascript");
        curso2.setDescricao("Bootcamp de Java - TakeBlip");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescicao("mentoria com os melhores devs da Claro");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}