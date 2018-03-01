package ghc2018.doublecot.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

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
		Vehicule vehicule = new Vehicule();

		ghcFileManager.serialize(vehicules, "out/test.out");
	}
}
