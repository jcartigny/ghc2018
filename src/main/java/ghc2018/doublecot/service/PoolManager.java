package ghc2018.doublecot.service;

import java.util.LinkedList;
import java.util.List;

import ghc2018.doublecot.model.Grid;
import ghc2018.doublecot.model.Ride;
import ghc2018.doublecot.model.Vehicule;

public class PoolManager {

  private final Grid input;

  private List<Ride> remainingRides;

  public PoolManager(Grid input) {
    super();
    this.input = input;
    this.remainingRides = new LinkedList<Ride>();
    this.remainingRides.addAll(input.getRides());
  }

  public Vehicule[] algo() {
    Vehicule[] pool = new Vehicule[input.getVehicles()];
    
    // for each step
    for (int i = 0; i < input.getSteps(); i++) {
      if (remainingRides.isEmpty()) {
        // no more ride to affect
        break;
      }

      // test if vehicule is available or not
      for (Vehicule vehicule : pool) {
        if (vehicule.isAvailable() && !remainingRides.isEmpty()) {
          vehicule.setNewRide(getBestRideForVehicule(vehicule));
        } else {

        }
      }
    }

    return pool;
  }

  private Ride getBestRideForVehicule(Vehicule vehicule) {
    Ride minRideForVehicule;
    for (Ride ride : remainingRides) {

    }

    return null;
  }

  public static int distance(int ordFrom, int ordTo, int absFrom, int absTo) {
    return Math.abs(ordFrom - ordTo) + Math.abs(absFrom - absTo);
  }

}
