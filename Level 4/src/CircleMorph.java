import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void draw(Graphics g) {
	   	 g.setColor(Color.GREEN);
	   	 g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}
	@Override
	public void update() {
		
	}

}