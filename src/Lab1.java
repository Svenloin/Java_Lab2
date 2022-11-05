import java.util.*;


public class Lab1 {
	public static void main(String[] args) {
		
		Point3d point1 = new Point3d();
		Point3d point2 = new Point3d();
		Point3d point3 = new Point3d();

		point1.setX(Double.parseDouble(args[0]));
		point1.setY(Double.parseDouble(args[1]));
		point1.setZ(Double.parseDouble(args[2]));

		point2.setX(Double.parseDouble(args[3]));
		point2.setY(Double.parseDouble(args[4]));
		point2.setZ(Double.parseDouble(args[5]));

		point3.setX(Double.parseDouble(args[6]));
		point3.setY(Double.parseDouble(args[7]));
		point3.setZ(Double.parseDouble(args[8]));

		if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3)) {
			System.out.println("Identical points, the area is not calculated");
		}
		else{
			System.out.println("Sqrt trinagle:	" + computeAre(point1, point2, point3));	
		}
	}

	public static double computeAre(Point3d pointA, Point3d pointB, Point3d pointC){
		double vectorAB = pointA.distanceTo(pointB);
		double vectorAC = pointA.distanceTo(pointC);
		double sqrtTr = 0.5 * Math.abs(vectorAB * vectorAC);
		return sqrtTr;
	}
}