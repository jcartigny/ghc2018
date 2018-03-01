package ghc2018.doublecot.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ghc2018.doublecot.model.Grid;
import ghc2018.doublecot.model.Pizza;
import ghc2018.doublecot.model.Ride;

public class GHCFileManager {
	private static final Logger LOG = LogManager.getLogger(GHCFileManager.class);

	/**
	 * 
	 */
	public GHCFileManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grid deserialize(String filename) {
		LOG.traceEntry();
		Grid result = new Grid();
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader br = new BufferedReader(fileReader);
			String line;

			// première ligne : ex : 3 rows, 4 columns, 2 vehicles, 3 rides, 2
			// bonus and 10 steps
			line = br.readLine();
			LOG.debug(line);
			String[] splitedValues = line.split(" ");
			result.setRows(Integer.parseInt(splitedValues[0]));
			result.setColumns(Integer.parseInt(splitedValues[1]));
			result.setVehicles(Integer.parseInt(splitedValues[2]));
			result.setNbRides(Integer.parseInt(splitedValues[3]));
			result.setBonus(Integer.parseInt(splitedValues[4]));
			result.setSteps(Integer.parseInt(splitedValues[5]));

			result.setRides(new ArrayList<Ride>());

			// lignesuivantes : ex : ride from [0, 0] to [1, 3], earliest start
			// 2, latest finish 9
			while ((line = br.readLine()) != null) {
				String[] splitedRideValues = line.split(" ");
				Ride ride = new Ride(Integer.parseInt(splitedRideValues[0]), Integer.parseInt(splitedRideValues[1]),
						Integer.parseInt(splitedRideValues[2]), Integer.parseInt(splitedRideValues[3]),
						Integer.parseInt(splitedRideValues[4]), Integer.parseInt(splitedRideValues[5]));
				result.getRides().add(ride);
			}

			br.close();

		} catch (FileNotFoundException fnfe) {
			LOG.debug("not found : " + new File(filename).getAbsolutePath());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		LOG.traceExit(result);
		return result;
	}

	public void serialize(Pizza pPizza, String pFilename) {
		LOG.traceEntry();

		try {
			File file = new File(pFilename);

			if (file.exists()) {
				file.renameTo(new File(file.getPath() + ".bkp." + new Date().getTime()));
			}
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write("doublecot\n".getBytes());
			fileOutputStream.write(new Date().toString().getBytes());
			fileOutputStream.write("\n".getBytes());
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		LOG.traceExit();
	}

}
