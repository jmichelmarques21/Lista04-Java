import br.edu.up.Modelos.*;

public class Programa {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro();
        carro.setModelo("March");
        carro.setCor("Preto");
        carro.setPlaca("AVL5I44");

        Estacionamento carroNovo = new Estacionamento(10);
        
    }
}
