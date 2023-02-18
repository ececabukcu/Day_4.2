package gameSimulation;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("oyun: " + game.getGameName() + game.getPrice() + "TL fiyatla eklendi");
		
	}

	@Override
	public void update(Game game) {
	
		System.out.println("oyun: " + game.getGameName() + game.getPrice() + "TL fiyatla güncellendi");
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun: " + game.getGameName() + "silindi");
	
		
	}
	
	

}
