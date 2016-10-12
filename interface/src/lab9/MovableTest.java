package lab9;

public class MovableTest{
	public static void main(String[] args){
		Movable m1 = new MovablePoint(5, 6, 10, 10);     // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
   
		Movable m2 = new MovableCircle(2, 1, 2, 20, 10); // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);

		Movable m3 = new MovableRectangle(3, 2, 1, 5, 20, 10); // upcast
		System.out.println(m3);
		m3.moveRight();
		System.out.println(m3);
	}
}