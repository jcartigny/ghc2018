package ghc2018.doublecot.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ghc2018.doublecot.model.Ride;
import ghc2018.doublecot.model.Vehicule;

public class GHCFileManagerTest {

	public GHCFileManager ghcFileManager = new GHCFileManager();

	@Test
	public void deserializeTest() {
		ghcFileManager.deserialize("src/main/resources/city/a_example.in");
	}

	@Test
	public void serializeTest() {
		List<Vehicule> vehicules = new ArrayList<Vehicule>();
		for (int j = 0; j < 3; j++) {
			Vehicule vehicule = new Vehicule();
			for (int i = 0; i < 3; i++) {
				Ride ride = new Ride();
				ride.setIndex(j * 10 + i);
				vehicule.getCompletedRides().add(ride);
			}
			vehicules.add(vehicule);
		}

		ghcFileManager.serialize(vehicules, "out/test.out");
	}
}
