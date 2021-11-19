import java.io.*;
public class Quad extends PrimitiveObject implements Serializable {

    // Atributo privado "largura" da própria classe
    private Float largura;
    // Atributo privado "altura" da própria classe
    private Float altura;
    
    // Construtor com a herança completa
    public Quad(String nome, Float x, Float y, Float largura, Float altura) {
        super(nome, x, y);
        this.largura = largura;
        this.altura = altura;
    }

    // Construtor que será utilizado, com herança (Sobrecarga)
    public Quad(Float largura, Float altura, Float x, Float y) {
        // Herda x e y
        super(x,y);
        
        this.largura = largura;
        this.altura = altura;
            
        
    }

    // Getter do atributo largura da própria classe
    public Float getLargura() {
        return largura;
    }

    // Setter do atributo largura da própria classe
    public  void setLargura(Float largura) {
        this.largura = largura;
    }

    // Getter do atributo altura da própria classe
    public Float getAltura() {
        return altura;
    }

    // Setter do atributo altura da própria classe
    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    // Método onDraw (Mostrar que o Circle foi desenhado)
    public void onDraw() {
        // Adiciona o System.out.print
        System.out.print("Quad");
        // Herda o método onDraw
        super.onDraw();
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
}
