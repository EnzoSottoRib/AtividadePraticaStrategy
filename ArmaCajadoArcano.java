public class ArmaCajadoArcano extends ABSArma{

    public int danoBase = 8;
    public String efeitoEspecial = "Bola de Fogo - Causa queimadura (dano de 10 por 2 turnos)";
    public int custoMana = 25;
    public iStatusEffect efeito = new StatusEffectQueimadura();
    public boolean requisito;

    @Override
    public void atacar(ABSPersonagem atacador, ABSPersonagem atacado) {
        this.requisito = atacador.inteligencia >= 12;

        if(!requisito) return;

        atacado.vida -= (danoBase + efeito.causarDano());

        atacador.mana -= custoMana;
    }

}
