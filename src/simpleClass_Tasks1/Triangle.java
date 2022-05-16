package simpleClass_Tasks1;

public class Triangle {
	private int x1;//координаты, точка А
	private int y1;//координаты, точка А
	private int x2;//координаты, точка B
	private int y2;//координаты, точка B
	private int x3;//координаты, точка C
	private int y3;//координаты, точка C
	private double ab;//длинна стороны
	private double ac;//длинна стороны
	private double bc;//длинна стороны
	public double s;//площадь
	public double p;//периметр
	Triangle(){
	}
	Triangle(int x1,int y1,int x2,int y2,int x3,int y3){
		this.setX1(x1);
		this.setY1(y1);
		this.setX2(x2);
		this.setY2(y2);
		this.setX3(x3);
		this.setY3(y3);
	}
	//найдём стороны  АB AC BC
	public void searchSide() {
		this.setAb(Math.sqrt( (Math.pow(getX2()-getX1(), 2)) + (Math.pow(getY2()-getY1(), 2)) ));
		this.setBc(Math.sqrt( (Math.pow(getX2()-getX3(), 2)) + (Math.pow(getY2()-getY3(), 2)) ));
		this.setAc(Math.sqrt( (Math.pow(getX1()-getX3(), 2)) + (Math.pow(getY1()-getY3(), 2)) ));
		System.out.println("Сторона АВ =  "+this.getAb());
		System.out.println("Сторона ВС =  "+this.getBc());
		System.out.println("Сторона АС =  "+this.getAc());
	}
	//найдём периметр
	public double searchP() {
		return this.p=(this.getAb()+this.getAc()+this.getBc());
	}
	//найдём площадь
	public double searchS() {
		return this.s=Math.sqrt(p*(p-this.getAb())*(p-this.getBc())*(p-this.getAc()));
	}
	//найдём точку пересечения
	public void searchD( ) {
		double x0,y0;
		x0=(getX1()+getX2()+getX3())/3;
		y0=(getY1()+getY2()+getY3())/3;
		System.out.println("Точка пересечения : D("+x0+","+y0+")");
	}
	public static void main(String[] args) {
		int x1,x2,x3,y1,y2,y3;
		Triangle objectTriangle = new Triangle();
		//Scanner in = new Scanner(System.in);
		System.out.println("Введём введём координаты точки  X1 = -5 и Y1 = -2 ");
		x1 = -5; y1=-2;
		System.out.println("Введём введём координаты точки  X2 = 7 и Y2 = -7 ");
		x2 = 7; y2=-7;
		System.out.println("Введём введём координаты точки  X1 = 5 и Y1 = 7 ");
		x3 = 5; y3=7;
		//in.close();
		//создадим триугольник
		objectTriangle = new Triangle(x1,y1,x2,y2,x3,y3);
		//найдём длинну сторон треугольника
		objectTriangle.searchSide();
		System.out.println("Периметр триугольника: "+objectTriangle.searchP());
		System.out.println("Площадь триугольника: "+objectTriangle.searchS());
		objectTriangle.searchD();
	}
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		this.ab = ab;
	}
	public double getAc() {
		return ac;
	}
	public void setAc(double ac) {
		this.ac = ac;
	}
	public double getBc() {
		return bc;
	}
	public void setBc(double bc) {
		this.bc = bc;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getX3() {
		return x3;
	}
	public void setX3(int x3) {
		this.x3 = x3;
	}
	public int getY3() {
		return y3;
	}
	public void setY3(int y3) {
		this.y3 = y3;
	}
}