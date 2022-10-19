import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria curso java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("curso HTML");
        curso2.setDescricao("descrição curso HTML");
        curso2.setCargaHoraria(5);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Gustavo: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP: " + devGustavo.calcularTotalXp());

        System.out.println("--");

        Dev devAlice = new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Alice: " + devAlice.getConteudosInscritos());
        devAlice.progredir();
        devAlice.progredir();
        devAlice.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Alice: " + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Alice: " + devAlice.getConteudosConcluidos());
        System.out.println("XP: " + devAlice.calcularTotalXp());
    }
}
