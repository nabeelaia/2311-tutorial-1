package prac;



public class runneer implements personn {

	
	public int pi = 2;
	public int area= 7;
	private static int circlenumber = 0;
	private int circleid;
	

	@Override
	public String toString() {
		return "runneer [pi=" + pi + ", area=" + area + ", circleid=" + circleid + "]";
	}

	public int getPi() {
		return pi;
	}

	public void setPi(int pi) {
		this.pi = pi;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public static int getCirclenumber() {
		return circlenumber;
	}

	public static void setCirclenumber(int circlenumber) {
		runneer.circlenumber = ++circlenumber;
	}

	public int getCircleid() {
		return circleid;
	}

	public void setCircleid(int circleid) {
		this.circleid = circleid;
	}

	public runneer(int pi, int area) {
		super();
		this.pi = pi;
		this.area = area;
		this.circleid = ++this.circlenumber;
	}

	@Override
	public int id() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	


