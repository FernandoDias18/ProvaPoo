import java.io.*;
public class Quad extends PrimitiveObject implements Serializable {

    private Float largura;
    private Float altura;
    

    public Quad(String nome, Float x, Float y, Float largura, Float altura) {
        super(x, y);
        this.largura = largura;
        this.altura = altura;
    }

    public Quad(Float largura, Float altura, Float x, Float y) {
        
        super(x,y);
        try{
            this.largura = largura;
            this.altura = altura;
            
        }catch(Exception e){

            float larguraConvertida = largura;
            float alturaConvertida = altura;
            this.largura = larguraConvertida;
            this.altura = alturaConvertida;

        }

    }


    public Float getLargura() {
        return largura;
    }

    public  void setLargura(Float largura) {
        this.largura = largura;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Quad(String nome, Float x, Float y) {
        super(nome, x, y);
    }

    @Override
    public void onDraw() {
        System.out.print("Quad");
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
