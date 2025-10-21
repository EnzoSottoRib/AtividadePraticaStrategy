import java.util.Random;

public class ArmaEspadaLonga extends ABSArma{

    public int danoBase = 15;
    public String efeitoEspecial = "Corte Profundo - Chance de 30% de causar sangramento (dano adicional de 5 por 3 turnos)";
    public int custoMana = 0;
    public iStatusEffect efeito = new StatusEffectSangramento();
    public boolean requisito;

    @Override
    public void atacar(ABSPersonagem atacador, ABSPersonagem atacado) {
        this.requisito = atacador.forca >= 10;

        if(!requisito) return;

        atacado.vida -= (danoBase + efeito.causarDano());

        atacador.mana -= custoMana;
    }

}
