package rpg;

public class Personagem {
	String tipoHeroi;
	String nome;
	int defesa;
	int forca;
	
	
	void chamarStatus() {
	System.out.format("Pesonagem:%s Nome:%s Defesa:%d Forca%d",tipoHeroi, nome, defesa, forca);
	}
	
}
