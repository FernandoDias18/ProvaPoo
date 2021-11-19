import java.io.Serializable;
// Interface, a classe GameObject herda os comportamentos de conjunto de métodos/Interface Serializable 
//Serializable precisa ser implementado na classe pai, para que possamos salvar o objeto em um arquivo, na classe Game
public abstract class GameObject implements Serializable {

    // Atributos da própria classe
    protected String nome;
    protected Float x;
    protected  Float y;

    // Construtor da classe com nome, x e y
    public GameObject(String nome, Float x, Float y) {
            this.nome = nome;
            this.x = x;
            this.y = y;
    
    }

    // Sobrecarga do construtor da classe apenas com x e y
    public GameObject(Float x, Float y) {
        
            this.x = x;
            this.y = y;
       
    }
    // Getter de do atributo nome
    public String getNome() {
        return nome;
    }

    // Setter de do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter de do atributo x
    public Float getX() {
        return x;
    }

    // Setter de do atributo x
    public void setX(Float x) {
        this.x = x;
    }

    // Getter de do atributo y
    public Float getY() {
        return y;
    }

    // Setter de do atributo y
    public void setY(Float y) {
       
        this.y = y;
       
    }

}
