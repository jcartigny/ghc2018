package ghc2018.doublecot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ghc2018.doublecot.service.GHCFileManager;

public class Main {

	private static final Logger LOG = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		LOG.traceEntry();

		GHCFileManager fileManager = new GHCFileManager();

		fileManager.deserialzeAddress("src/main/resources/small.in");

		LOG.traceExit();
	}

}
