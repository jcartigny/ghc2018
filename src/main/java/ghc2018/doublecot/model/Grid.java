/**
 * 
 */
package ghc2018.doublecot.model;

import java.util.List;

/**
 * @author LGPW1431
 *
 */
public class Grid {

	/**
	 * 
	 */

	int rows;
	int columns;
	int vehicles;
	int nbRides;
	int bonus;
	int steps;

	List<Ride> rides;

	public Grid() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the rows
	 */
	public int getRows() {
		return this.rows;
	}

	/**
	 * @param pRows
	 *            the rows to set
	 */
	public void setRows(int pRows) {
		this.rows = pRows;
	}

	/**
	 * @return the columns
	 */
	public int getColumns() {
		return this.columns;
	}

	/**
	 * @param pColumns
	 *            the columns to set
	 */
	public void setColumns(int pColumns) {
		this.columns = pColumns;
	}

	/**
	 * @return the vehicles
	 */
	public int getVehicles() {
		return this.vehicles;
	}

	/**
	 * @param pVehicles
	 *            the vehicles to set
	 */
	public void setVehicles(int pVehicles) {
		this.vehicles = pVehicles;
	}

	/**
	 * @return the nbRides
	 */
	public int getNbRides() {
		return this.nbRides;
	}

	/**
	 * @param pNbRides
	 *            the nbRides to set
	 */
	public void setNbRides(int pNbRides) {
		this.nbRides = pNbRides;
	}

	/**
	 * @return the bonus
	 */
	public int getBonus() {
		return this.bonus;
	}

	/**
	 * @param pBonus
	 *            the bonus to set
	 */
	public void setBonus(int pBonus) {
		this.bonus = pBonus;
	}

	/**
	 * @return the steps
	 */
	public int getSteps() {
		return this.steps;
	}

	/**
	 * @param pSteps
	 *            the steps to set
	 */
	public void setSteps(int pSteps) {
		this.steps = pSteps;
	}

	/**
	 * @return the rides
	 */
	public List<Ride> getRides() {
		return this.rides;
	}

	/**
	 * @param pRides
	 *            the rides to set
	 */
	public void setRides(List<Ride> pRides) {
		this.rides = pRides;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Grid [rows=" + this.rows + ", columns=" + this.columns + ", vehicles=" + this.vehicles + ", nbRides="
				+ this.nbRides + ", bonus=" + this.bonus + ", steps=" + this.steps + ", rides=" + this.rides + "]";
	}

}
