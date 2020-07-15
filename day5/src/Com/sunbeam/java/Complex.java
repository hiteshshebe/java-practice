package Com.sunbeam.java;

public class Complex {
	private int real;
	private int img;
	public Complex(int real, int img) {
		this.real = real;
		this.img = img;
	}
	public Complex()
	{
		this(0,0);
	}
	public void setReal(int real) {
		this.real = real;
	}
	public void setImg(int img) {
		this.img = img;
	}
	public int getReal() {
		return real;
	}
	public int getImg() {
		return img;
	}
	
	
}
