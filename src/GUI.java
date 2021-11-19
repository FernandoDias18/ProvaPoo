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
    // Getter (nome) herdado, 
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
    // Setter (y) herdado, 
    public void setY(Float y) {
        super.setY(y);
    }

    @Override
    public void onDraw() {
        System.out.println(" draw");
    }


}
