enum BorderStyle {
	NONE, THIN, THICK;
}

class Banner {

	private double width;
	private double height;
	private BorderStyle style;

	public Banner(double w, double h) {
		width = w;
		height = h;
		style = BorderStyle.NONE;
	}

	public void borderStyle(boolean yes) {
		style = yes ? BorderStyle.THIN : BorderStyle.NONE;
	}

	public void borderStyle(BorderStyle border) 
	{
		style=border;
	}

	public double area() 
	{
		double t;
		switch(style){
			case THIN:
				t = 2;
				break;
			case THICK:
				t = 3;
				break;
			default:
				t = 0;
		}
		return (width+2*t)*(height+2*t);
	}

}

