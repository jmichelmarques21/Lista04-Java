package br.edu.up.Modelos;

public class EventoModel {
  private String nome;
  private String data;
  private String local;
  private int lotacaoMaxima;
  private int ingressosVendidos;
  private double precoIngresso;
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }
  public String getLocal() {
    return local;
  }
  public void setLocal(String local) {
    this.local = local;
  }
  public int getLotacaoMaxima() {
    return lotacaoMaxima;
  }
  public void setLotacaoMaxima(int lotacaoMaxima) {
    this.lotacaoMaxima = lotacaoMaxima;
  }
  public int getIngressosVendidos() {
    return ingressosVendidos;
  }
  public void setIngressosVendidos(int ingressosVendidos) {
    this.ingressosVendidos = ingressosVendidos;
  }
  public double getPrecoIngresso() {
    return precoIngresso;
  }
  public void setPrecoIngresso(double precoIngresso) {
    this.precoIngresso = precoIngresso;
  }

  
}
