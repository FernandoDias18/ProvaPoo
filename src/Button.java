import java.io.*;
public class Button extends GUI implements Clickable, Serializable{

    // Atributo privado "texto" da classe
    private String texto;
    
    // Construtor da classe 
    public Button(Float x, Float y, String texto) {
        // Recebe herança de x e y
        super(x, y);
        this.texto = texto;
    }

    // Getter do atributo texto da própria classe
    public String getTexto() {
        return texto;
    }
    // Setter do atributo texto da própria classe
    public void setTexto(String texto) {
        this.texto = texto;
    }


    @Override
    // Método onClick (Apenas mostra que o botão foi clicado)
    public void onClick() {
        System.out.println("Button " + texto + " clicked");
    }

    @Override
    // Getter (nome) herdado
    public String getNome() {
        return super.getNome();
    }

    @Override
    // Setter (nome) herdado
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    // Getter (x) herdado
    public Float getX() {
        return super.getX();
    }

    @Override
    // Setter (x) herdado
    public void setX(Float x) {
        super.setX(x);
    }

    @Override
    // Getter (y) herdado
    public Float getY() {
        return super.getY();
    }

    @Override
    // Setter (y) herdado
    public void setY(Float y) {
        super.setY(y);
    }

    @Override
    // Método onDraw (Mostrar que o Button foi desenhado)
    public void onDraw() {
        // Adiciona o System.out.print
        System.out.print("Button " + texto);
        // Herda o método onDraw
        super.onDraw();

        
    }
}
