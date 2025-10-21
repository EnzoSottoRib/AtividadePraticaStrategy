public class ContextoArma {
    private iArma Arma;

    ContextoArma(iArma Arma){
        this.Arma = Arma;
    }
    
    public void setArma(iArma Arma){
        this.Arma = Arma;
    }

    public void usarArma(ABSPersonagem atacador, ABSPersonagem atacado){
        this.Arma.atacar(atacador, atacado);
    }
}
