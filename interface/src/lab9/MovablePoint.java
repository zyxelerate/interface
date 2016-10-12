package lab9;

public class MovablePoint implements Movable{
	int x, y, xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void moveUp(){
		y -= ySpeed;
	}

	public void moveDown(){
		y += ySpeed;
	}

	public void moveLeft(){
		x -= xSpeed;
	}

	public void moveRight(){
		x += xSpeed;
	}

	public String toString(){
		return "x-coord: " + this.x + " --- y-coord: " + this.y;
	}
}
