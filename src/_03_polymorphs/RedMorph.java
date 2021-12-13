package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph {
	
	RedMorph(int WIDTH, int HEIGHT) {
		super(WIDTH, HEIGHT);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 50, 50);
		
	}
}
