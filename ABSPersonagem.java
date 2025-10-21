public abstract class ABSPersonagem {
    public int forca;
    public int destreza;
    public int inteligencia;
    public int vida;
    public int mana;
    public ContextoArma contexoArma;
    
    public ABSPersonagem(int forca, int destreza, int inteligencia, int vida, int mana, ContextoArma contexoArma) {
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.vida = vida;
        this.mana = mana;
        this.contexoArma = contexoArma;
    }

    public void atacar(ABSPersonagem atacado) {
        contexoArma.usarArma(this, atacado);
    }

    public void trocarArma(iArma arma) {
        contexoArma.setArma(arma);
    }
}
