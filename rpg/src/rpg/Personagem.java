package rpg;

import java.util.Random;

public class Personagem {
	String tipoHeroi;
	String nome;
	int defesa;
	int forca;
	int poder;
	
	
	//void chamarStatus() {
	//System.out.format("Pesonagem:%s Nome:%s Defesa:%d Forca:%d",tipoHeroi, nome, defesa, forca);
	//}
	
	int danoAoBoss() {
		Random dadoAleatorio = new Random();
		int dadodaSorte = 5 + dadoAleatorio.nextInt(29);
		int valorDano = poder + dadodaSorte;
		return valorDano;
		
		
		
		
		
	}
	
	
	void atacar(String alvo, String habilidade) {
		int danoCausado = danoAoBoss();
		
		if(habilidade.isEmpty()) {
			System.out.format("%s atacou um %s e deu %d dano", nome, alvo, forca );
		}else {
			System.out.format("%s atacou %s com uma %s e causo %d de dano", nome, alvo, habilidade, danoCausado);
		}
			
		
	}
	
	
}
