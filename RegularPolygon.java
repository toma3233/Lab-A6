/**
 * class RegularPolygon - class to model any regular polygon
 * @author Tom Abraham
 * Period # 1
 * 
 */
public class RegularPolygon {
	//instance variables 
	private int myNumSides;
	/** # of sides*/
	private double mySideLength;
	/** length of each side*/
	private double myR;
	/** radius of circumscribed circle*/
	private double myr;
	/** radius of inscribed circle*/


//constructors
/**
 * Default Constructor for Regular Polygon
 * Sets number of sides to three
 */
public RegularPolygon() {
	myNumSides = 3;
}
/**
 * Parameter constructor that initializes myNumSides and mysideLength
 * @param numSides initialized to myNumSides
 * @param sideLength initialized to mySideLength
 * Initializes radii for inscribed and circumscribed circles
 */
public RegularPolygon(int numSides, double sideLength) {
	myNumSides = numSides;
    mySideLength = sideLength;
    myr = 0.5 * mySideLength * (1 / Math.tan(Math.PI / myNumSides));
    myR = 0.5 * mySideLength * (1 / Math.sin(Math.PI / myNumSides));
}

//private methods
/**
 * private method for calculating radius of inscribed circle
 */
private void calcr() {
	 
}
/**
 * private method for calculating radius of circumscribed circle
 */
private void calcR() {
	 
}

//public methods
/**
 * <b>summary</b>: provides a method for calculating the vertex angle
 * @return then it returns the value
 */
public double vertexAngle() {
	double q = ((myNumSides - 2.00) * 180) / myNumSides;
	return q;
}
/**
 * <b>summary</b>: provides a method for calculating the perimeter
 * @return then it returns the value
 */
public double Perimeter() {
	double p = myNumSides * mySideLength;
	return p;
}
/**
 * <b>summary</b>: provides a method for calculating the area
 * @return then it returns the value
 */
public double Area() {
	double area = 0.5 * myNumSides * (myR * myR) * Math.sin((2 * Math.PI) / myNumSides);
	return area;
}
/**
 * <b>summary</b>: provides a method for calling the number of sides
 * @return then it returns the value
 */
public int getNumside() {
	return myNumSides;
}
/**
 * <b>summary</b>: provides a method for calling the length of each side
 * @return then it returns the value
 */public double getSideLength() {
	return mySideLength;
}
/**
 * <b>summary</b>: provides a method for calling the radius of circumscribed circle
 * @return then it returns the value
 */
public double getR() {
	return myR;
}
/**
 * <b>summary</b>: provides a method for calling the radius of the inscribed circle
 * @return then it returns the value
 */public double getr() {
	return myr;
}

}
