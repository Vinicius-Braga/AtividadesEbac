package br.com.braga.domain;

public class Cliente implements Persistente{

    private String nome;
    private Long Cpf;
    private String cidade;
    private String end;
    private String estado;
    private int nuemro;
    private long tel;

    public Long getCpf() {
        return Cpf;
    }

    public void setCpf(Long cpf) {
        this.Cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEnd() {
        return end;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setNuemro(int nuemro) {
        this.nuemro = nuemro;
    }

    public int getNuemro() {
        return nuemro;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public long getTel() {
        return tel;
    }
}
