package ghc2018.doublecot.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
			FileReader fileReader = new FileReader(filename);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
			while ((line = br.readLine()) != null) {
				LOG.debug(line);
			}
			br.close();

		} catch (FileNotFoundException fnfe) {
			LOG.debug("not found : " + new File(filename).getAbsolutePath());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		LOG.traceExit(pizza);
		return pizza;
	}

}
