import java.io.*;
public class Circle extends PrimitiveObject implements Serializable {

    // Atributo privado "raio" da classe
    private Float raio;

    // Construtor da classe com herança completa
    public Circle(String nome, Float x, Float y, Float raio) {
        super(nome, x, y);
        this.raio = raio;
    }

    // Construtor que será utilizado, com herança (Sobrecarga)
    public Circle( Float x, Float y, Float raio) {
        super(x, y);
        this.raio = raio;
    }

    // Getter do atributo raio da própria classe
    public Float getRaio() {
        return raio;
    }

    // Setter do atributo raio da própria classe
    public void setRaio(Float raio) {
        this.raio = raio;
    }

    @Override
    // Método onDraw (Mostrar que o Circle foi desenhado)
    public void onDraw() {
        // Herda o método onDraw
        super.onDraw();
        // Adiciona o System.out.print
        System.out.print("Circle");
    }

    @Override
    // Getter (nome) herdado, sobrescrita do método getNome
    public String getNome() {
        return super.getNome();
    }

    @Override
    // Setter (nome) herdado, sobrescrita do método setNome
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    // Getter (x) herdado, sobrescrita do método getX
    public Float getX() {
        return super.getX();
    }

    @Override
    // Setter (x) herdado, sobrescrita do método setX
    public void setX(Float x) {
        super.setX(x);
    }

    @Override
    // Getter (y) herdado, sobrescrita do método getY
    public Float getY() {
        return super.getY();
    }

    @Override
    // Setter (y) herdado, sobrescrita do método setY
    public void setY(Float y) {
        super.setY(y);
    }
}
