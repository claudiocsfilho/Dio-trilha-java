import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devX = new Dev();
        devX.setNome("Xisto");
        devX.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Xisto" + devX.getConteudosInscritos());
        devX.progredir();
        devX.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos Xisto" + devX.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Xisto" + devX.getConteudosInscritos());
        System.out.println("XP: " + devX.calcularTotalXp());

        System.out.println("-------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos João" + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        
    }
}
