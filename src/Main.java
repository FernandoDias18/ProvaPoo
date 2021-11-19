
public class Main {

    public static void main (String[] args) {

      // Instancia o objeto game
      Game game = new Game();
       
      //Adiciona um objeto de cada classe no objeto game(Array do tipo GameObject)
      game.addObject(new Quad(32f, 12f, 5f, 5f));
      game.addObject(new Circle(4f, 4f, 3f));
      game.addObject(new Label(0f, 0f,"Nome do jogo", 12));
      game.addObject(new Button(0f, 0f, "Iniciar"));

        // Chama o método clickAll
        game.clickAll();
        // Chama o método drawAll
        game.drawAll();
        // Chama o método saveAll
        game.saveAll();
        // // Chama o método loadAll
        game.loadAll();
       }
    
}
