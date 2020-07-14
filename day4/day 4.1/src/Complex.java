class Complex
{
    private int real;
    private int img;
    Complex(int real,int img)
    {
        this.real=real;
        this.img=img;
    }
    public int getReal() {
        return real;
    }
    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }
    public void setReal(int real) {
        this.real = real;
    }

}