import br.edu.up.Modelos.Ponto;

public class Programa {
    public static void main(String[] args){
        
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2,5);

        ponto2.calcularDistancia(ponto1);

        System.out.println();

        ponto2.calcularDistancia(7,2);

        ponto1.setX(10);
        ponto1.setY(3);
    }
}
