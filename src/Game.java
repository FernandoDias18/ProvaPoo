import java.io.*;
import java.util.ArrayList;

public class Game implements Serializable{
    private ArrayList<GameObject> colecao;

    public Game() {
        this.colecao = new ArrayList<GameObject>();
    }

    public void addObject(GameObject gameObject){
        colecao.add(gameObject);
    }

    public void removeObject(GameObject gameObject){
        colecao.remove(gameObject);
    }   

    public void drawAll(){
        System.out.println("drawAll called");

        colecao.forEach( item->{
            if (item instanceof Drawable drawable)
                drawable.onDraw();
        });
    }

    public void clickAll(){
        System.out.println("clickAll called");

        colecao.forEach( item->{
            if (item instanceof Clickable clickable)
                clickable.onClick();
        });
        
    }
    public void loadAll(){
        colecao.clear();
        try(ObjectInputStream leitor = new ObjectInputStream(new FileInputStream("componentes.dat"))){

            ArrayList<GameObject> item = (ArrayList<GameObject>) leitor.readObject();

            System.out.println("loadAll called");

            for (GameObject c : item) {
                if (c instanceof Quad d) {
                    System.out.println("Quad loaded " + 
                                        "(" + d.getLargura() + ", " +
                                         d.getAltura() + ", " +
                                         d.getX() + ", " +
                                         d.getY() + ")");
                }
                else if (c instanceof Circle d) {
                    System.out.println("Circle loaded " + 
                                        "(" + d.getX() + ", " +
                                         d.getY() + ", " +
                                         d.getRaio() + ")");
                }
                else if (c instanceof Label d) {
                    System.out.println("Label loaded " + 
                                        "(" + c.getX() + ", " +
                                         c.getY() + ", " +
                                         d.getTexto() + ", " +
                                         d.getFonte() + ")");
                }
                else if (c instanceof Button d) {
                    System.out.println("Button loaded " + 
                                        "(" + c.getX() + ", " +
                                         c.getY() + ", " +
                                         d.getTexto() + ")");
                }
                
               
            }

            leitor.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveAll()
    {
        System.out.println("saveAll Called");
        try(ObjectOutputStream gravador = new ObjectOutputStream(new FileOutputStream("componentes.dat"))) {

                try {

                    gravador.writeObject(colecao);
                    gravador.flush();
                    gravador.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    gravador.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (GameObject c : colecao){
            System.out.println(c.getClass().getSimpleName() + " saved");
        }
    }
}

