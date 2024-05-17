import br.edu.up.Telas.MenuInicial;
import br.edu.up.Modelos.Segurado;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        


        MenuInicial menuInicial = new MenuInicial();

        menuInicial.inicio();    

        scan.close();
    }
}
