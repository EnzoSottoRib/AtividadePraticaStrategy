public class ArmaMachadoDeGuerra extends ABSArma{

    public int danoBase = 18;
    public String efeitoEspecial = "Golpe Esmagador - Chance de 25% de atordoar o inimigo (perde 1 turno)";
    public int custoMana = 5;
    public iStatusEffect efeito = new StatusEffectAtordoado();
    public boolean requisito;

    @Override
    public void atacar(ABSPersonagem atacador, ABSPersonagem atacado) {
        this.requisito = atacador.forca >= 15;

        if(!requisito) return;

        atacado.vida -= (danoBase + efeito.causarDano());

        atacador.mana -= custoMana;
    }
    
}