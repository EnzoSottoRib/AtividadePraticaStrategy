public class Cliente {
    public static void main(String[] args) {
        System.out.println("Criando personagens");

        ABSPersonagem jogador = new ClasseMago();
        ABSPersonagem inimigo = new ClasseGuerreiro();

        Batalha batalha = new Batalha(jogador, inimigo);

        batalha.iniciarBatalha();
    }
}
