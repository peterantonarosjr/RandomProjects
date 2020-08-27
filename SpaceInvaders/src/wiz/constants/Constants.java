package wiz.constants;

public class Constants {
	
	//Game Title
	public static final String GAME_TITLE = "Space Invaders!";
	
	//Game Frame Dimensions
	public static final int BOARD_WIDTH = 950;
	public static final int BOARD_HEIGHT = 700;
	
	//Refresh Speed
	public static final int GAME_REFRESH = 10;
	
	//Ship dimensions
	public static final int FSHIP_HEIGHT = 35;
	public static final int FSHIP_WIDTH = 64;
	public static final int ESHIP_HEIGHT = 64;
	public static final int ESHIP_WIDTH = 50;
	
	//Enemy Ship Start positions
	public static final int E_ROWS = 3;
	public static final int E_COLS = 9;
	public static final int E_XPOS = Constants.BOARD_WIDTH/2-(9*ESHIP_WIDTH)/2-75;
	public static final int E_YPOS = Constants.BOARD_HEIGHT-(Constants.BOARD_HEIGHT-50);
	
	//Laser dimensions
	public static final int LASER_VERTICAL = 5;
	public static final int LASER_WIDTH = 18;
	public static final int LASER_HEIGHT = 20;
	
	//Bomb dimensions
	public static final int BOMB_VERTICAL = 7;
	public static final int BOMB_WIDTH = 28;
	public static final int BOMB_HEIGHT = 25;
	
	//Image and Sound Paths
	public static final String BACKGROUND_URL = "images/Background.png";
	public static final String ENEMY_SHIP_URL = "images/EnemyShip.png";
	public static final String FRIENDLY_SHIP_URL = "images/FriendlyShip.png";
	public static final String BOMB_URL = "images/Bomb.png";
	public static final String LASER_URL = "images/Laser.png";
	
	//Logs
	public static final String LOG_TITLE = "Report Log";
	
	

}
