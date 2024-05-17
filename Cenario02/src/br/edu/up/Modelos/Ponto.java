package br.edu.up.Modelos;

public class Ponto {
  private double x;
  private double y;

  public Ponto(){
    this.x = 0;
    this.y = 0;
  }

  public Ponto(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public void calcularDistancia(double x2, double y2) {
    double distancia = Math.sqrt((Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2)));    
    System.out.printf("%.1f", distancia);
  }

  public void calcularDistancia(Ponto ponto) {
    double distancia = Math.sqrt((Math.pow((this.x - ponto.x), 2) + Math.pow((this.y - ponto.y), 2)));
    System.out.printf("%.1f", distancia);
  }

  
}
