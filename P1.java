
import processing.core.*;

public class P1 extends PApplet {
	
	int x = 10;
	int y = 10;
	int xMax =600;
	int yMax =600;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("P1");
	}
	
	public void settings() {
		
		size(600,600);
		
	}
	
public void setup() {
		
		background(255,255,0);
		
	}

public void draw()
{
	background(255,255,0);
	
	
	ellipse(x, y, 20,20);
}


public void mousePressed() {
	
	fill(0,0,255);

	
}

public void mouseReleased() {
	
	fill(255,0,0);

	
}

public void keyPressed() {
	
	if (keyCode == LEFT) {
	
		fill(0,255,0);
		x += 10;
	
	}
		
	else if (keyCode == RIGHT) {
			
			fill(0,0, 255);
			x -= 10;
			
	}
	
	else if (keyCode == UP) {
		
		fill(255,255, 0);
		y -= 10;
		
}
	else if (keyCode == DOWN) {
		
		fill(255,255, 0);
		y += 10;
		
}
	else if (key == 's') {
		
		fill(200,200, 30);
		y += 10;
		x += 10;
		
}	
	
	

    if (x < 0 ) x = xMax;
	
	else if (x > xMax) x = 10;
	
	else if (y < 0 ) y = yMax;
	
	else if (y > yMax) y = 10;
	

	
}

}


