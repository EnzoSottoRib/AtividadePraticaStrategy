import java.util.Random;

public class ArmaEspadaLonga implements iArma{

    Random random = new Random();

    int danoBase = 15;

    public int atacar(){
        return danoBase;
    }

    // public int usarEfeitoEspecial(iStatusEffect statusEffect){
    //     int randomNumber = random.nextInt(100);
    //     if (randomNumber <= 30){

    //     }
    // }
}
