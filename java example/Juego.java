import Clases.Entidad;
import Clases.Jugador;
import Clases.Mob;
import Clases.NPC;

public class Juego{
    public static void main(String[] args){
        Entidad jugador = new Jugador("Link",100);  
        Entidad jugador2 = new Jugador("Zelda",150);  
        Mob caballero1 = new Mob("Knight 1");
        NPC caballero2 = new Mob("Knight 2");
        jugador.Saludar();
        jugador.ChequearVida(0);
        caballero1.Saludar();
        caballero1.Atacar(jugador);
    }
}