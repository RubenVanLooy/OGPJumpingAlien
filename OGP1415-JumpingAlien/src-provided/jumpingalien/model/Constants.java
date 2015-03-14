package jumpingalien.model;

/**
 * @Value
 * 
 * A class containing constants that apply to any Mazub and the world arround it.
 * 
 * @author Ruben
 */
public class Constants {
	
	public final static int worldXMin = 0;
	public final static int worldXMax = 1023;
	public final static int worldYMin = 0;
	public final static int worldYMax = 767;
	public final static double mazubHorizontalAcceleration = 90;
	public final static double mazubMaxHorizontalVelocityNoDuck = 300.;
	public final static double mazubMaxHorizontalVelocityDucking = 100.;
	public final static double mazubInitialHorizontalVelocity = 100.;
	public final static double mazubInitialVerticalVelocity = 800.;
	public final static double mazubVerticalAcceleration = -1000.;
}
