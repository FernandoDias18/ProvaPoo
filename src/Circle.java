import java.io.*;
public class Circle extends PrimitiveObject implements Serializable {
    private Float raio;

    public Circle(String nome, Float x, Float y, Float raio) {
        super(nome, x, y);
        this.raio = raio;
    }
    public Circle( Float x, Float y, Float raio) {
        super(x, y);
        this.raio = raio;
    }

    public Float getRaio() {
        return raio;
    }

    public void setRaio(Float raio) {
        this.raio = raio;
    }

    @Override
    public void onDraw() {
        System.out.print("Circle");
        super.onDraw();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public Float getX() {
        return super.getX();
    }

    @Override
    public void setX(Float x) {
        super.setX(x);
    }

    @Override
    public Float getY() {
        return super.getY();
    }

    @Override
    public void setY(Float y) {
        super.setY(y);
    }
}
