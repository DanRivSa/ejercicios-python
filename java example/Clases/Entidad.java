package Clases;

public class Entidad {
    //atributos
    public float velocidad;
    public float vida;
    public String nombre;

    //constructor 
    public Entidad(){

    }

    //metodos
    public void Mover(){
        //nada
    }

    public float ChequearVida(float value){
        float vida_actual = this.vida + value;
        if(vida_actual<=0){
            this.Morir();
            return 0;
        }else{
            this.vida = vida + value;
            System.out.println("Yo, "+this.nombre + " sigo vivo, me queda: "+this.vida);
            return this.vida;
        } 
    }

    public void Saludar()
    {
        System.out.println("Hola mi nombre es: " + this.nombre);
    }

    private void Morir(){
        System.out.println(this.nombre + "Ha muerto");
    }


}
