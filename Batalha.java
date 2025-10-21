import java.util.Scanner;

public class Batalha {

    private ABSPersonagem jogador;
    private ABSPersonagem inimigo;
    private int turno;
    private Scanner scanner;

    public Batalha(ABSPersonagem jogador, ABSPersonagem inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
        this.turno = 1;
        this.scanner = new Scanner(System.in);
    }

    public void iniciarBatalha(){
        System.out.println("Batalha começou!");

        while(jogador.vida > 0 && inimigo.vida > 0){
            System.out.println("Turno: " + this.turno);

            System.out.println("Vida jogador: " + jogador.vida + "\nVida inimigo: " + inimigo.vida);

            System.out.println("Turno do Jogador");
            executarTurnoJogador();

            System.out.println("Turno do Inimigo");
            inimigo.atacar(jogador);

            this.turno++;
        }

        verificarVencedor();
        
    }

    private void executarTurnoJogador(){
        System.out.println("Escolha a sua ação: \n1 - Atacar \n2 - Trocar de arma e atacar \n Sua escolha: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                jogador.atacar(inimigo);
                break;
            
            case 2:
                trocarArma();
                jogador.atacar(inimigo);
                break;

            default:
                break;
        }

    }

    private void trocarArma() {
        System.out.println("Trocar arma\n1 - Arco Elfico\n2 - Cajado Arcano\n3 - Espada Longa\n4 - Machado de Guerra");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                jogador.trocarArma(new ArmaArcoElfico());
                break;

            case 2:
                jogador.trocarArma(new ArmaCajadoArcano());
                break;
        
            case 3:
                jogador.trocarArma(new ArmaEspadaLonga());
                break;

            case 4:
                jogador.trocarArma(new ArmaMachadoDeGuerra());
                break;

            default:
                break;
        }
    }

    private void verificarVencedor(){
        if(jogador.vida < 0){
            System.out.println("Jogador perdeu!");
        } else {
            System.out.println("Jogador ganhou!");
        }
    }
}
