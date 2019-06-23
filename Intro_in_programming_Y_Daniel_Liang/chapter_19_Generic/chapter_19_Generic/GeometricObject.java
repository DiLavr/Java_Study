package chapter_19_Generic;



public abstract class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
		color = "white";
		filled = false;
	}

	/** Construct a geometric object with color and filled value */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	/**
	 * Return filled. Since filled is boolean, the get method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "GeometricObject: \ncreated on: " + dateCreated + "\ncolor: "
				+ color + "\nfilled: " + filled + "\nObject: "
				+ super.toString();
	}

//	 public static void main(String[] args) {
//	 GeometricObject go = new GeometricObject ("black", true);
//	 System.out.println(go);
//	 }

}