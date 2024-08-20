import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso compelto de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("curso completo de javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria java com os melhores devs do mercado");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFalcao = new Dev();
        devFalcao.setNome("Falcão");
        devFalcao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Falcão:" + devFalcao.getConteudosInscritos());
        devFalcao.progredir();
        devFalcao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Falcão:" + devFalcao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Falcão:" + devFalcao.getConteudosConcluidos());
        System.out.println("XP:" + devFalcao.calcularTotalXp());

        System.out.println("-------");

        Dev devMike = new Dev();
        devMike.setNome("Mike");
        devMike.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mike:" + devMike.getConteudosInscritos());
        devMike.progredir();
        devMike.progredir();
        devMike.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mike:" + devMike.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Mike:" + devMike.getConteudosConcluidos());
        System.out.println("XP:" + devMike.calcularTotalXp());

    }

}