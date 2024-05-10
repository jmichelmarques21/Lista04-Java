import br.edu.up.Modelos.*;

public class Programa {
    public static void main(String[] args){
        
      Agenda agenda = new Agenda();

      Compromisso compromisso = new Compromisso("Jean", "Curitiba", "Trabalho", 20);

      Dia dia = new Dia(29);
      dia.adicionarCompromisso(compromisso);

      Mes mes = new Mes(30, "Abril");

      Ano ano = new Ano(2024, true);


        
    }
}
