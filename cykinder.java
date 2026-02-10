import java.util.Scanner;
class Operations{
//	 instance variable
	float r,h;
//	 create a constructor
	public Operations() {
//		 create object of scanner class 
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of radius");
		r = sc.nextFloat();
		System.out.print("enter the height of cylinder ");
		h = sc.nextFloat();
		sc.close();	
	}
// find curved surface area
	public void curvedsurfacearea() {
		 double curvedarea = (Math.PI * r * h);
		System.out.println(" the curved surface area of cylinder"+ curvedarea);
	
	}
//	total surface area
	public void totalarea() {
	 double totalarea=(2*Math.PI*r*(h+r));
		System.out.println("the total area of cylinder "+totalarea);
        }
//	volume of cylinder 
	public void volume() {
		double volume= (Math.PI*r*r*h);
		System.out.println("the volume of cylinder "+volume);

	}
}

public class Cylinder {
	public static void main(String[] args) {
		Operations O = new Operations();
		O.curvedsurfacearea();
		O.totalarea();
		O.volume();
		
	}

}
