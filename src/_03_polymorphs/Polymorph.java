package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph extends RedMorph{
    protected int x;
    protected int y;
    private int width = 50;
    private int height = 50;
    
    int getX() {
    	return x;
    }
    int setX(int i) {
    	x = i; 
    	return x;
    }
    
    int getY() {
    	return y;
    }
    int setY(int i) {
    	y = i; 
    	return y; 
    }
    
    int getWidth() {
    	return width;
    }
    int setWidth(int i) {
    	width = i;
    	return width;
    }
    
    int getHeight() {
    	return height; 
    }
    int setHeight(int i) {
    	height = i; 
    	return height;
    }
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    
    public void update(){
    	MovingMorph mm = new MovingMorph();
    
    	
    }
    
    public abstract void draw(Graphics g);
}
