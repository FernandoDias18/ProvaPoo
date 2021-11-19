import java.io.*;
import java.util.ArrayList;
// Interface, a classe game herda os comportamentos de  conjunto de métodos/Interface Serializable 
public class Game implements Serializable{
    private ArrayList<GameObject> colecao;

    public Game() {
        this.colecao = new ArrayList<GameObject>(); //instancia um novo ArrayList GameObject
    }

    // Adiciona objeto do tipo GameObject ao Array
    public void addObject(GameObject gameObject){ 
       try{
           colecao.add(gameObject);
       } catch( Exception e){
           e.printStackTrace();
       }
    }

    // Remove objeto do tipo GameObject do Array
    public void removeObject(GameObject gameObject){
        try{
            colecao.remove(gameObject);
            //Exceção caso tente remover elemento de um Arraylist vazio
       }catch (NullPointerException e){
           System.out.println("Coleção está vazio");
       }
    }

    // Método drawAll (Mostra que cada objeto foi desenhado(apenas objetos com o método onDraw))
    public void drawAll(){
        System.out.println("drawAll called");
        // Para cada item salvo no ArrayList colecao será realizado as verificações abaixo
        colecao.forEach( item->{
            // Verifica se o item é uma instância da Interface Drawable
            if (item instanceof Drawable drawable)
            // Caso o item seja um instância da Interface Clickable, ele chama o método onDraw
                drawable.onDraw();
        });
    }

    // Método clickAll (Mostra que cada objeto foi clicado(apenas objetos com o método onClick))
    public void clickAll(){
        System.out.println("clickAll called");
        //Para cada item salvo no ArrayList coleção será realizado as verificações abaixo
        colecao.forEach( item->{
            //Verifica se o item é uma instância da Interface Clickable
            if (item instanceof Clickable clickable)
            //Caso o item seja um instância da Interface Clickable ele chama o método onClick
                clickable.onClick();
        });   
    }

    // Método para fazer a leitura dos objetos salvos no arquivo .dat
    public void loadAll(){
        // Limpa o Array colecao
        colecao.clear();
        try(ObjectInputStream leitor = new ObjectInputStream(new FileInputStream("componentes.dat"))){

            // Dados salvos no arquivo são convertidos novamente para um ArrayList do tipo GameObject
            ArrayList<GameObject> item = (ArrayList<GameObject>) leitor.readObject(); 

            // Mostra que o método foi chamado
            System.out.println("loadAll called");

            // Para cada item do array faz as verificações abaixo
            for (GameObject c : item) {
                // Verifica se o objeto é uma instância de Quad para pegar os dados
                if (c instanceof Quad d) {
                    System.out.println("Quad loaded " + 
                                        "(" + d.getLargura() + ", " +
                                         d.getAltura() + ", " +
                                         d.getX() + ", " +
                                         d.getY() + ")");
                }
                // Verifica se o objeto é uma instância de Circle para pegar os dados
                else if (c instanceof Circle d) {
                    System.out.println("Circle loaded " + 
                                        "(" + d.getX() + ", " +
                                         d.getY() + ", " +
                                         d.getRaio() + ")");
                }
                // Verifica se o objeto é uma instância de Label para pegar os dados
                else if (c instanceof Label d) {
                    System.out.println("Label loaded " + 
                                        "(" + c.getX() + ", " +
                                         c.getY() + ", " +
                                         d.getTexto() + ", " +
                                         d.getFonte() + ")");
                }
                // Verifica se o objeto é uma instância de Button para pegar os dados
                else if (c instanceof Button d) {
                    System.out.println("Button loaded " + 
                                        "(" + c.getX() + ", " +
                                         c.getY() + ", " +
                                         d.getTexto() + ")");
                }
            }

            //Arquivo de texto é fechado
            leitor.close();
            //Exceção gerada ao acessar informações de um arquivo
        } catch (IOException e) {
            e.printStackTrace();
            //Exceção gerada ao não encontrar uma classe
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Método para salvar os dados do Array em um arquivo .dat
    public void saveAll(){   
        // Mostra que o método foi chamado
        System.out.println("saveAll Called");
        
        try(ObjectOutputStream gravador = new ObjectOutputStream(new FileOutputStream("componentes.dat"))) {

                try {
                    gravador.writeObject(colecao); // Grava no arquivo .dat
                    gravador.flush(); 
                    gravador.close();
                    
                } catch (IOException e) {
                    //Exceção gerada ao não encontrar uma classe
                    e.printStackTrace();
                }
                try {
                    gravador.flush();
                } catch (IOException e) {
                     //Exceção gerada ao não encontrar uma classe
                    e.printStackTrace();
                }
            

        } catch (FileNotFoundException e) {
            //Excessão que apresentará um erro caso o arquivo não seja encontrado.
            e.printStackTrace();
        } catch (IOException e) {
            //Exceção gerada ao acessar informações de um arquivo
            e.printStackTrace();
        }
        
        // Para cada objeto do Array apresenta que ele foi salvo
        for (GameObject c : colecao){
            System.out.println(c.getClass().getSimpleName() + " saved"); 
        }
    }
}

