package lab9;

public class TestResizableCircle{
	public static void main(String[] args){
		GeometricObject m1 = new ResizableCircle(3.0);
		System.out.println(m1.getArea());
		System.out.println(m1.getPerimeter());
		System.out.println(m1);
		Resizable m2 = (Resizable) m1; 
		m2.resize(5);
		System.out.println(m2);
	}
}
