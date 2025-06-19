package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudos> conteudosIndcritos = new LinkedHashSet<>();
    private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIndcritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    };

    public void progredir() {
        Optional<Conteudos> conteudo = this.conteudosIndcritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIndcritos.remove(conteudo.get());
        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo!!!");
        }
    };

    public double  calcularTotalXp() {
return this.conteudosConcluidos.stream().mapToDouble(c -> c.calcularXp()).sum();
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudos> getConteudosIndcritos() {
        return conteudosIndcritos;
    }

    public void setConteudosIndcritos(Set<Conteudos> conteudosIndcritos) {
        this.conteudosIndcritos = conteudosIndcritos;
    }

    public Set<Conteudos> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudos> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIndcritos, dev.conteudosIndcritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIndcritos, conteudosConcluidos);
    }
}
