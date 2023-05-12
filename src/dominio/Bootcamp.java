package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private Set<Devs> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Devs> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Devs> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudosBootcamp() {
        return conteudosBootcamp;
    }

    public void setConteudosBootcamp(Set<Conteudo> conteudosBootcamp) {
        this.conteudosBootcamp = conteudosBootcamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFim, bootcamp.dataFim) && Objects.equals(devInscritos, bootcamp.devInscritos) && Objects.equals(conteudosBootcamp, bootcamp.conteudosBootcamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFim, devInscritos, conteudosBootcamp);
    }
}
