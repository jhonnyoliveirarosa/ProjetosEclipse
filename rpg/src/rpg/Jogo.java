package rpg;

public class Jogo {
public static void main(String[] args) {
		Personagem heroi = new Personagem();
		heroi.tipoHeroi = "Dps";
		heroi.nome="Skarlet";
		heroi.defesa=15;
		heroi.forca=15;
		heroi.poder=15;
		
		Personagem boss = new Personagem();
		boss.tipoHeroi="boss";
		boss.nome="minions";
		boss.defesa=120;
		boss.forca=70;
		
		//heroi.chamarStatus();
		heroi.atacar("Minotauro","Ultimate");
		
	}


}
