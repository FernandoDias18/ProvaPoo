import java.io.Serializable;

public class Label extends GUI implements Serializable{

    private String texto; 
    private int fonte;


    public Label(String nome, Float x, Float y) {
        super(nome, x, y);
    }

    public Label(Float x, Float y, String texto, int fonte) {
        super(x, y);
        this.texto = texto;
        this.fonte = fonte;
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getFonte() {
        return fonte;
    }

    public void setFonte(int fonte) {
        this.fonte = fonte;
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
        System.out.print("Label " + texto);
        super.onDraw();
    }
}
