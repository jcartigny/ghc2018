package ghc2018.doublecot.service;

import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ghc2018.doublecot.model.Grid;
import ghc2018.doublecot.model.Ride;
import ghc2018.doublecot.model.Vehicule;

public class PoolManager {

	private static final Logger LOG = LogManager.getLogger(PoolManager.class);

	private final Grid input;

	private List<Ride> remainingRides;

	public PoolManager(Grid input) {
		super();
		this.input = input;
		this.remainingRides = new LinkedList<Ride>();
		this.remainingRides.addAll(input.getRides());
	}

  public Vehicule[] algo() {
  LOG.traceEntry("rides : " + remainingRides);

    Vehicule[] pool = new Vehicule[input.getVehicles()];
    for (int i = 0; i < pool.length; i++) {
      pool[i] = new Vehicule();
    }
    
    // for each step
    for (int step = 0; step < input.getSteps(); step++) {
      if (remainingRides.isEmpty()) {
        // no more ride to affect
        break;
      }

      // test if vehicule is available or not
      for (Vehicule vehicule : pool) {
        if (vehicule.isAvailable() && !remainingRides.isEmpty()) {
          vehicule.setNewRide(getBestRideForVehicule(vehicule, step));
        } else {

        }
      }
    }

    return pool;
  }

  private Ride getBestRideForVehicule(Vehicule vehicule, int step) {
    Ride bestRideForVehicule = remainingRides.get(0);
    int timeToWait = 999999999;
    for (Ride ride : remainingRides) {
      int distToStart = distance(vehicule.getX(), ride.getxFrom(), vehicule.getY(), ride.getyFrom());
      int newtimeToWait = ride.getEarlyestStart() - (step + distToStart);
      
      int timeArrival = step + distToStart + ride.getDistance();
      if (timeArrival <= ride.getLatesFinish() && newtimeToWait < timeToWait) {
        bestRideForVehicule = ride;
      }
    }

    return bestRideForVehicule;
  }

	public static int distance(int ordFrom, int ordTo, int absFrom, int absTo) {
		return Math.abs(ordFrom - ordTo) + Math.abs(absFrom - absTo);
	}

}
