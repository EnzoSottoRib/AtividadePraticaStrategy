public class ArmaArcoElfico extends ABSArma{
    
    public int danoBase = 12;
    public String efeitoEspecial = "Chuva de Flechas - Ataque em área, atinge todos os inimigos";
    public int custoMana = 15;
    public iStatusEffect efeito = new StatusEffectSangramento();
    public boolean requisito;

    @Override
    public void atacar(ABSPersonagem atacador, ABSPersonagem atacado) {
        this.requisito = atacador.destreza >= 8;

        if(!requisito) return;

        atacado.vida -= (danoBase + efeito.causarDano());

        atacador.mana -= custoMana;
    }

}
