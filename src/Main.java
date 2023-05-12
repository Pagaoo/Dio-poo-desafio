import dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cursos cursoJava = new Cursos();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setDescricao("Curso de java básico para iniciantes");
        cursoJava.setCargaHoraria(40);

        Cursos cursoJavaAvancado = new Cursos();
        cursoJavaAvancado.setTitulo("Java Avançado");
        cursoJavaAvancado.setDescricao("Curso de java avançado destinado a programadores com conhecimento intermediário em Java");
        cursoJavaAvancado.setCargaHoraria(80);

        Mentorias springBootMentoria = new Mentorias();
        springBootMentoria.setTitulo("Spring Boot");
        springBootMentoria.setDescricao("Mentoria em Spring Boot");
        springBootMentoria.setData(LocalDate.now());

        Bootcamp javaBootcamp = new Bootcamp();
        javaBootcamp.setNome("Bootcamp programador Java");
        javaBootcamp.setDescricao("Bootcamp focado em aprendizado de Java e Spring Boot");
        javaBootcamp.getConteudosBootcamp().add(cursoJava);
        javaBootcamp.getConteudosBootcamp().add(cursoJavaAvancado);
        javaBootcamp.getConteudosBootcamp().add(springBootMentoria);

        Devs dev_1 = new Devs();
        dev_1.setNome("Gabriel");
        dev_1.inscricaoBootcamp(javaBootcamp);
        System.out.println("Conteúdos inscritos: " + dev_1.getConteudosInscritos());
        dev_1.finalizarConteudo();
        System.out.println("Conteúdo Concluido: " + dev_1.getConteudosFinalizados());
        System.out.println("Conteúdos inscritos: " + dev_1.getConteudosInscritos() + ", XP obtida: " + dev_1.calcularTotalXp());
        dev_1.finalizarConteudo();
        dev_1.finalizarConteudo();
        dev_1.finalizarConteudo();
        System.out.println("Conteúdo finalizado: " + dev_1.getConteudosFinalizados());
        System.out.println("Conteúdos inscritos: " + dev_1.getConteudosInscritos() + ", XP obtida: " + dev_1.calcularTotalXp());
    }
}
