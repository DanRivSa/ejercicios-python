package Clases;

public class Mob extends NPC{

    public Mob(String nombre ) {
        this.nombre = nombre;
    }

    @Override
    public float ChequearVida(float value) {
        return super.ChequearVida(value);
    }

    @Override
    public void Mover() {
        super.Mover();
    }

    public void Atacar(Entidad jugador){
        System.out.println(this.nombre + ", ataca a " + jugador.nombre + ", produciendo 100 de danio");
        jugador.ChequearVida(-100);
    }

    @Override
    public void Saludar() {
        //super.Saludar();
        System.out.println("Hola, soy " + this.nombre + "y he venido a matarte");
    }
    
}
