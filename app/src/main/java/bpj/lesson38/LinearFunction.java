package bpj.lesson38;

public class LinearFunction implements LinearFunctionMethods {
    //y = mx + b
    private double xCoordinate; // (y-b)/m
    private double yCoordinate; // mx + b
    private double mSlope;
    private double bYintercept;// where the line cuts the Y-Axis

    public LinearFunction(){
        mSlope = 1;
        bYintercept = 3;
    }
    public LinearFunction(double slope, double yIntercept){
        mSlope = slope;
        bYintercept = yIntercept;
    }

    public double getSlope(){  return mSlope; }
    public double getYintercept(){ return bYintercept; }
    public double getRoot(){
        //root == value of x that makes the function zero
        //this is also x-intercept; where the line cuts X-Axis, so that y-coordinate is zero

        return (-bYintercept)/mSlope;
    }

    public double getXvalue(double y){ return (y - bYintercept)/mSlope; }
    public double getYvalue(double x){ return (mSlope * x) + bYintercept; }
}

