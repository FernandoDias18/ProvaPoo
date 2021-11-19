
public class Main {

    public static void main (String[] args) {

        Game game = new Game();
       
         game.addObject(new Quad(32f, 12f, 5f, 5f));
         game.addObject(new Circle(4f, 4f, 3f));
         game.addObject(new Label(0f, 0f,"Nome do jogo", 12));
         game.addObject(new Button(0f, 0f, "Iniciar"));

         game.clickAll();
         game.drawAll();

   
         game.saveAll();
         game.loadAll();
       }
    
}
