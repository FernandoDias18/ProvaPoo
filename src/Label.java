import java.io.Serializable;
// Label herda todos os seus método e atributos de GUI// //  a classe GUI herda os comportamentos de conjunto de métodos/Interface Serializable 
public class Label extends GUI implements Serializable{

    // Atributo privado "texto" da própria classe
    private String texto; 
    // Atributo privado "fonte" da própria classe
    private int fonte;

    // Construtor com herança completa
    public Label(String nome, Float x, Float y) {
        super(nome, x, y);
    }

    // Construtor que será utilizado, com herança (Sobrecarga)
    public Label(Float x, Float y, String texto, int fonte) {
        super(x, y);
        this.texto = texto;
        this.fonte = fonte;
    }

    // Getter do atributo texto da própria classe
    public String getTexto() {
        return texto;
    }

    // Setter do atributo texto da própria classe
    public void setTexto(String texto) {
        this.texto = texto;
    }

     // Getter do atributo fonte da própria classe
    public int getFonte() {
        return fonte;
    }

     // Setter do atributo fonte da própria classe
    public void setFonte(int fonte) {
        this.fonte = fonte;
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

    @Override
    // Método onDraw (Mostrar que o Circle foi desenhado), sobrescrita do método onDraw
    public void onDraw() {
        // Herda o método onDraw
        super.onDraw();
        // Adiciona o System.out.print
        System.out.print("Label " + texto);

    }
}
