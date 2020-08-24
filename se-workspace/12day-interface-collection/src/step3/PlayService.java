package step3;

import step2.CDPlayer;
import step2.Player;

public class PlayService {

	public void execute(Player player) {
		if(player instanceof CDPlayer)((CDPlayer)player).insertCd();
		player.play();

	}

}
