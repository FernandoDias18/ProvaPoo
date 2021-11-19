public abstract class GUI extends GameObject implements Drawable {
    public GUI(String nome, Float x, Float y) {
        // Construtor herda os atributos nome, x e y
        super(nome, x, y); 
    }

    //Sobrecarga do constructor somente com parametros x e y
    public GUI(Float x, Float y) {
        super(x, y);
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
    public void onDraw() {
        System.out.println(" draw");
    }


}
