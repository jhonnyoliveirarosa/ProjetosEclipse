package rpg;

public class Personagem {
	String tipoHeroi;
	String nome;
	int defesa;
	int forca;
	int poder = 50;
	
	
	//void chamarStatus() {
	//System.out.format("Pesonagem:%s Nome:%s Defesa:%d Forca:%d",tipoHeroi, nome, defesa, forca);
	//}
	
	void atacar(String alvo, String habilidade) {
		
		if(habilidade.isEmpty()) {
			System.out.format("%s atacou um %s e deu %d dano", nome, alvo, forca  );
		}else {
			System.out.format("%s atacou %s com uma %s e causo %d de dano", nome, alvo, habilidade, poder);
		}
			
		
	}
	
	
}
