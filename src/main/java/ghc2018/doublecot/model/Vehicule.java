package ghc2018.doublecot.model;

import java.util.ArrayList;

public class Vehicule {
	boolean available;
	ArrayList<Ride> completedRides;
	int x;
	int y;
	Ride currentRide;
	int stepToCompleteRide;

	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return this.available;
	}

	/**
	 * @param pAvailable
	 *            the available to set
	 */
	public void setAvailable(boolean pAvailable) {
		this.available = pAvailable;
	}

	/**
	 * @return the completedRides
	 */
	public ArrayList<Ride> getCompletedRides() {
		return this.completedRides;
	}

	/**
	 * @param pCompletedRides
	 *            the completedRides to set
	 */
	public void setCompletedRides(ArrayList<Ride> pCompletedRides) {
		this.completedRides = pCompletedRides;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * @param pX
	 *            the x to set
	 */
	public void setX(int pX) {
		this.x = pX;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * @param pY
	 *            the y to set
	 */
	public void setY(int pY) {
		this.y = pY;
	}

	/**
	 * @return the currentRide
	 */
	public Ride getCurrentRide() {
		return this.currentRide;
	}

	/**
	 * @param pCurrentRide
	 *            the currentRide to set
	 */
	public void setCurrentRide(Ride pCurrentRide) {
		this.currentRide = pCurrentRide;
	}

	/**
	 * @return the stepToCompleteRide
	 */
	public int getStepToCompleteRide() {
		return this.stepToCompleteRide;
	}

	/**
	 * @param pStepToCompleteRide
	 *            the stepToCompleteRide to set
	 */
	public void setStepToCompleteRide(int pStepToCompleteRide) {
		this.stepToCompleteRide = pStepToCompleteRide;
	}

	public Vehicule() {

	}

	public void setNewRide(Ride pRide) {
		this.completedRides.add(pRide);
		this.currentRide = pRide;
		this.available = false;
		this.stepToCompleteRide = this.currentRide.getDistance();
	}

	public void stepForward() {
		this.stepToCompleteRide--;
		if (this.stepToCompleteRide == 0) {
			this.available = true;
			this.currentRide = null;
		}
	}

}
