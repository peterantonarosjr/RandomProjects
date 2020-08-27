package wiz.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.ArrayList;
import wiz.callbacks.EventListener;
import wiz.constants.Constants;
import wiz.figures.FriendlyShip;
import wiz.figures.EnemyShip;
import wiz.figures.Lasers;
import wiz.image.ImageFactory;
import wiz.image.Images;

public class GamePanel extends JPanel{
	
	private ImageIcon backgroundImage;
	private Timer timer;
	private FriendlyShip spaceShip;
	private Lasers laser;
	private boolean inGame = true;
	private JLabel scoreBoard;
	private int score = 0;
	private int direction = 1;
	private List<EnemyShip> enemyList;
	
	public GamePanel() {
		
		createLayout();
		createVariables();
		initEShips();
	}

	private void initEShips() {
		for(int i=0; i<Constants.E_ROWS; i++) {
			for(int j=0; j<Constants.E_COLS; j++) {
				
				EnemyShip enemyShip = new EnemyShip(Constants.E_XPOS+70*j,Constants.E_YPOS+70*i);
				this.enemyList.add(enemyShip);
			}
		}
		
	}

	private void createVariables() {
		this.enemyList = new ArrayList<>();
		this.spaceShip = new FriendlyShip();
		this.laser = new Lasers();
		this.backgroundImage = ImageFactory.createImage(Images.BACKGROUND);
		scoreBoard = new JLabel("Score: "+score);
		scoreBoard.setForeground(Color.WHITE);
		scoreBoard.setBounds(Constants.BOARD_WIDTH-85, 20, 85, 20);
		this.add(scoreBoard);
		this.setLayout(null);
		this.timer = new Timer(Constants.GAME_REFRESH, new GameLoop(this));
		this.timer.start();
	}

	private void createLayout() {
		addKeyListener(new EventListener(this));
		this.setFocusable(true);
		this.setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
		
	}
	
	private void drawPlayer(Graphics g) {
		g.drawImage(spaceShip.getImage(), spaceShip.getX(), spaceShip.getY(), this);
	}
	
	private void drawLaser(Graphics g) {
		if(!laser.isDead()) {
			g.drawImage(laser.getImage(), laser.getX(), laser.getY(), this);
		}
	}
	
	private void drawAliens(Graphics g) {
		
		for(EnemyShip enemyShip : enemyList) {
			if(enemyShip.isVisible()) {
				g.drawImage(enemyShip.getImage(), enemyShip.getX(), enemyShip.getY(), this);
			}
		}
		
	}

	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backgroundImage.getImage(), 0, 0, null);
		drawAll(g);
		System.out.println("Paint");
	}

	private void drawAll(Graphics g) {
		if(inGame) {
			drawPlayer(g);
			drawLaser(g);
			drawAliens(g);
		}else {
			if(timer.isRunning()) {
				timer.stop();
			}
		}
		Toolkit.getDefaultToolkit().sync();
		
		System.out.println("PlayerDrawn");
		
	}


	public void completeCycle() {
		update();
		repaint();
		
	}

	private void update() {
		this.spaceShip.move();
		this.laser.move();
		//updateScore();
		System.out.println("Update");
		
	}
	/**
	private void updateScore() {
		//Change score if laser hits enemy ship
		score++;
		scoreBoard.setText("Score: "+score);
	}
	**/
	
	public void keyReleased(KeyEvent e) {
		this.spaceShip.keyReleased(e);
		
	}

	public void keyPressed(KeyEvent e) {
		this.spaceShip.keyPressed(e);
		
		int key = e.getKeyCode();
		if(key==KeyEvent.VK_SPACE) {
			int laserX = this.spaceShip.getX();
			int laserY = this.spaceShip.getY();
			
			if(inGame && laser.isDead()) {
				laser = new Lasers(laserX,laserY);
			}
		}
	}

}
