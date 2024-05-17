package br.edu.up.modelos;

public class ClienteEmpresa extends Cliente {
    private String cnpj;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, String cnpj, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, 25000.0);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getDados() {
        return "\nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail() + "\nCNPJ: " + cnpj + "\nInscrição Estadual: " + inscEstadual + "\nAno de Fundação: " + anoFundacao;
    }

    @Override
    public String toString() {
        return getDados() + "\nSaldo: " + getSaldo();
    }
}
