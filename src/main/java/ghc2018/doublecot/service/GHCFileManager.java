package ghc2018.doublecot.service;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ghc2018.doublecot.model.Pizza;

public class GHCFileManager {
	private static final Logger LOG = LogManager.getLogger(GHCFileManager.class);

	/**
	 * 
	 */
	public GHCFileManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza deserialzeAddress(String filename) {
		LOG.traceEntry();
		Pizza pizza = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null) {
				LOG.debug(line);
			}
			br.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		LOG.traceExit(pizza);
		return pizza;
	}

}
