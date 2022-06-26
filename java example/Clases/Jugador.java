package Clases;

public class Jugador extends Entidad{

    //constructor de clase
    public Jugador(String nombre,float vida){
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public float ChequearVida(float value) {
        // TODO Auto-generated method stub
        return super.ChequearVida(value);
    }

    @Override
    public void Mover() {
        //super.Mover();
        System.out.println("me muevo a la izquierda");
        this.Saludar();
    }
    
}
