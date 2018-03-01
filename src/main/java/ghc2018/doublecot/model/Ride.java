package ghc2018.doublecot.model;

public class Ride {

	int xFrom;
	int yFrom;
	int xTo;
	int yTo;
	int earlyestStart;
	int latesFinish;
	int distance;

	/**
	 * @return the xFrom
	 */
	public int getxFrom() {
		return this.xFrom;
	}

	/**
	 * @param pXFrom
	 *            the xFrom to set
	 */
	public void setxFrom(int pXFrom) {
		this.xFrom = pXFrom;
	}

	/**
	 * @return the yFrom
	 */
	public int getyFrom() {
		return this.yFrom;
	}

	/**
	 * @param pYFrom
	 *            the yFrom to set
	 */
	public void setyFrom(int pYFrom) {
		this.yFrom = pYFrom;
	}

	/**
	 * @return the xTo
	 */
	public int getxTo() {
		return this.xTo;
	}

	/**
	 * @param pXTo
	 *            the xTo to set
	 */
	public void setxTo(int pXTo) {
		this.xTo = pXTo;
	}

	/**
	 * @return the yTo
	 */
	public int getyTo() {
		return this.yTo;
	}

	/**
	 * @param pYTo
	 *            the yTo to set
	 */
	public void setyTo(int pYTo) {
		this.yTo = pYTo;
	}

	/**
	 * @return the earlyestStart
	 */
	public int getEarlyestStart() {
		return this.earlyestStart;
	}

	/**
	 * @param pEarlyestStart
	 *            the earlyestStart to set
	 */
	public void setEarlyestStart(int pEarlyestStart) {
		this.earlyestStart = pEarlyestStart;
	}

	/**
	 * @return the latesFinish
	 */
	public int getLatesFinish() {
		return this.latesFinish;
	}

	/**
	 * @return the distance
	 */
	public int getDistance() {
		return this.distance;
	}

	/**
	 * @param pDistance
	 *            the distance to set
	 */
	public void setDistance(int pDistance) {
		this.distance = pDistance;
	}

	/**
	 * @param pLatesFinish
	 *            the latesFinish to set
	 */
	public void setLatesFinish(int pLatesFinish) {
		this.latesFinish = pLatesFinish;
	}

	public Ride(int pXFrom, int pYFrom, int pXTo, int pYTo, int pEarlyestStart, int pLatesFinish) {
		super();
		this.xFrom = pXFrom;
		this.yFrom = pYFrom;
		this.xTo = pXTo;
		this.yTo = pYTo;
		this.earlyestStart = pEarlyestStart;
		this.latesFinish = pLatesFinish;
		this.distance = Math.abs(this.xFrom - this.xTo) + Math.abs(this.yFrom - this.yTo);
	}

	public Ride() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ride [xFrom=" + this.xFrom + ", yFrom=" + this.yFrom + ", xTo=" + this.xTo + ", yTo=" + this.yTo
				+ ", earlyestStart=" + this.earlyestStart + ", latesFinish=" + this.latesFinish + ", distance="
				+ this.distance + "]";
	}

}
