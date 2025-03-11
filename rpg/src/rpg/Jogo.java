package rpg;

public class Jogo {
public static void main(String[] args) {
		Personagem heroi = new Personagem();
		heroi.tipoHeroi = "Dps";
		heroi.nome="Skarlet";
		heroi.defesa=15;
		heroi.forca=30;
		
		heroi.chamarStatus();
		
	}


}
