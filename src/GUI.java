public abstract class GUI extends GameObject implements Drawable {
    public GUI(String nome, Float x, Float y) {
        super(nome, x, y);
    }
    public GUI(Float x, Float y) {
        super(x, y);
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
        System.out.println(" draw");
    }


}
