package ghc2018.doublecot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ghc2018.doublecot.model.Grid;
import ghc2018.doublecot.model.Vehicule;
import ghc2018.doublecot.service.GHCFileManager;
import ghc2018.doublecot.service.PoolManager;

public class Main {

	private static final Logger LOG = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		LOG.traceEntry();

		GHCFileManager fileManager = new GHCFileManager();

		Grid entry = fileManager.deserialize("src/main/resources/city/a_example.in");

		PoolManager poolManager = new PoolManager(entry);

		Vehicule[] vehicules = poolManager.algo();

		for (Vehicule vehicule : vehicules) {
			LOG.debug(vehicule);
		}

		fileManager.serialize(vehicules, "out/a_example.out");

		LOG.traceExit();
	}

}
