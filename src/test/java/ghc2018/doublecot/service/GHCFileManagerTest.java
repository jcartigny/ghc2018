package ghc2018.doublecot.service;

import org.junit.Test;

public class GHCFileManagerTest {

	public GHCFileManager ghcFileManager = new GHCFileManager();

	@Test
	public void myFirstTest() {
		ghcFileManager.deserialize("src/main/resources/city/a_example.in");
	}
}
