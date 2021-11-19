import java.io.*;
public class Button extends GUI implements Clickable, Serializable{

private String texto;

    public Button(Float x, Float y, String texto) {
        super(x, y);
        this.texto = texto;
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public void onClick() {
        System.out.println("Button " + texto + " clicked");
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

    @Override
    public void onDraw() {
        System.out.print("Button " + texto);
        super.onDraw();
    }
}
