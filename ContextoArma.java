public class ContextoArma {
    private iArma Arma;

    ContextoArma(iArma Arma){
        this.Arma = Arma;
    }

    public void setArma(iArma Arma){
        this.setArma(Arma);
    }

    public void usarArma(iStatusEffect Effect){
        this.Arma.atacar();
    }
}
