package dominio;

import java.util.*;

public class Devs {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosFinalizados = new LinkedHashSet<>();

    public double calcularTotalXp() {
        Iterator<Conteudo> i = this.conteudosFinalizados.iterator();
        double soma = 0;
        while (i.hasNext()) {
            double proximo = i.next().calcularXp();
            soma += proximo;
        }
        return soma;
    }

    public void finalizarConteudo() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findAny();
        if (conteudo.isPresent()) {
            this.conteudosFinalizados.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public void inscricaoBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudosBootcamp());
        bootcamp.getDevInscritos().add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosFinalizados() {
        return conteudosFinalizados;
    }

    public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
        this.conteudosFinalizados = conteudosFinalizados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(conteudosInscritos, devs.conteudosInscritos) && Objects.equals(conteudosFinalizados, devs.conteudosFinalizados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosFinalizados);
    }
}
