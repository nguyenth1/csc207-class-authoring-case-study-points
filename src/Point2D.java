
public class Point2D {
	double x, y;
	
	public Point2D () {
	}
	
	public Point2D (double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Point2D add(double dx, double dy) {
		return new Point2D (x+dx, y+dy);
	}
	
	public void translate (Point2D point) {
		this.x += point.x;
		this.y += point.y;
	}
	
	public double distance (double x, double y){
		return Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
	}
	
	public String toString (){
		return "(" + x + ", " + y + ")";
	}
}
