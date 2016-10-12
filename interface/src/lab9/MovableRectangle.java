package lab9;

public class MovableRectangle implements Movable{
	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}
	public void moveUp(){
		topLeft.y -= topLeft.ySpeed;
		bottomRight.y -= bottomRight.ySpeed;
	}

	public void moveDown(){
		topLeft.y += topLeft.ySpeed;
		bottomRight.y += bottomRight.ySpeed;
	}

	public void moveLeft(){
		topLeft.x -= topLeft.xSpeed;
		bottomRight.x -= bottomRight.xSpeed;
	}

	public void moveRight(){
		topLeft.x += topLeft.xSpeed;
		bottomRight.x += bottomRight.xSpeed;
	}

	public String toString(){
		return String.format("x1-coord: %d --- y1-coord: %d -- x2-coord: %d --- y2-coord: %d", topLeft.x,topLeft.y,bottomRight.x,bottomRight.y);
	}
}
