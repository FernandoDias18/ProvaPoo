import java.io.Serializable;

public abstract class GameObject implements Serializable {
    protected String nome;
    protected Float x;
    protected  Float y;

    public GameObject(String nome, Float x, Float y) {
        this.nome = nome;

        try{
            this.x = x;
            this.y = y;
        }catch(Exception e){

            Float xConvertido = x;
            Float yConvertido = y;

            this.x = xConvertido;
            this.y = yConvertido;

        }
    }

    public GameObject(Float x, Float y) {
        
        try{

            this.x = x;
            this.y = y;
        }catch(Exception e){

            Float xConvertido = x;
            Float yConvertido = y;

            this.x = xConvertido;
            this.y = yConvertido;

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

}
