import br.edu.up.Modelos.Livro;

public class Programa {
    public static void main(String[] args){

    String[] vetAutor1 = new String[2];
    vetAutor1[0] = "Cay S. Horstmann";
    vetAutor1[1] = "Gary Cornell";    

    Livro livro1 = new Livro("1598FHK", "Core Java 2", vetAutor1, "0130819336", 2005);

    String[] vetAutor2 = new String[1];
    vetAutor2[0] = "Harvey Deitel";
    
    Livro livro2 = new Livro("9865PLO", "Java, como Programar", vetAutor2, "0130341517", 2015);

    System.out.println("Livro 1: ");
    System.out.println("Código: " + livro1.getCodigo());
    System.out.println("Título: " + livro1.getTitulo());
    System.out.println("Autores: ");
    for (int i = 0; i < livro1.getAutores().length; i++){
        System.out.println(vetAutor1[i]);
    }
    System.out.println("ISBN: " + livro1.getIsbn());
    System.out.println("Ano: " + livro1.getAno());

    System.out.println();
    System.out.println();
    System.out.println("Livro 2: ");
    System.out.println("Código: " + livro2.getCodigo());
    System.out.println("Título: " + livro2.getTitulo());
    System.out.println("Autores: ");
    for (int i = 0; i < livro2.getAutores().length; i++) {
        System.out.println(vetAutor2[i]);
    }
    System.out.println("ISBN: " + livro2.getIsbn());
    System.out.println("Ano: " + livro2.getAno());

    System.out.println();
    System.out.println();
    







    }
}
