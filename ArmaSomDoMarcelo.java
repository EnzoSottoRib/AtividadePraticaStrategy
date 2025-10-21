public class ArmaSomDoMarcelo extends ABSArma {

    public int danoBase = 18;
    public String efeitoEspecial = "Hiper Onda Sonora - Deixa os inimigos em estado de êxtase";
    public int custoMana = 30;
    public iStatusEffect efeito = new StatusEffectExtase();
    public boolean requisito; 

    @Override
    public void atacar(ABSPersonagem atacador, ABSPersonagem atacado) {
        this.requisito = atacador.forca >= 15;

        if(!requisito) return;

        atacado.vida -= (danoBase + efeito.causarDano());

        atacador.mana -= custoMana;
    }

}
