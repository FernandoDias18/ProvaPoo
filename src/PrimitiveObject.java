import java.io.Serializable;
// classe abstrata Primitive Obeject  serve como modelo para a classe derivada Game Object, está herda os comportamentos de  conjunto de métodos/Interface Drawable
public abstract class PrimitiveObject extends GameObject implements Drawable {
    // Construtor da classe com herança completa (nome, x e y)
    public PrimitiveObject(String nome, Float x, Float y) {
        super(nome, x, y);
    }

    // Construtor da classe com herança apenas de x e y
    public PrimitiveObject(Float x, Float y) {
        super(x,y);
    }

    @Override
    // Método onDraw (Mostra que o objeto foi desenhado)
    public void onDraw() {
        System.out.println(" draw");
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
