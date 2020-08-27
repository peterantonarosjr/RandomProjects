package wiz.image;

import java.awt.Image;

import javax.swing.ImageIcon;

import wiz.constants.Constants;

public class ImageFactory {
	
	public static ImageIcon createImage(Images image) {
		
		ImageIcon imageIcon = null;
		
		switch (image) {
		case ESHIP:
			imageIcon = new ImageIcon(Constants.ENEMY_SHIP_URL);
			imageIcon.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT);
			break;
		case FSHIP:
			imageIcon = new ImageIcon(Constants.FRIENDLY_SHIP_URL);
			//imageIcon.getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT);
			break;
		case BOMB:
			imageIcon = new ImageIcon(Constants.BOMB_URL);
			imageIcon.getImage().getScaledInstance(15, 30, Image.SCALE_DEFAULT);
			break;
		case LASER:
			imageIcon = new ImageIcon(Constants.LASER_URL);
			imageIcon.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
			break;
		case BACKGROUND:
			imageIcon = new ImageIcon(Constants.BACKGROUND_URL);
			imageIcon.getImage().getScaledInstance(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT, Image.SCALE_DEFAULT);
			break;
		default:
			break;
		}
		return imageIcon;
	}

	
	

}
