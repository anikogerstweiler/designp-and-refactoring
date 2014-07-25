package solution2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class AdventureGameTest {

	@Test
	public void testMain() throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ByteArrayInputStream bais = new ByteArrayInputStream(("n\n" + "n\n" + "y\n" + "n\n" + "y\n" + "y\n" + "y\n" + "y\n" + "n\n" + "y\n" + "n\n"
				+ "n\n" + "n\n").getBytes());
		System.setOut(new PrintStream(baos));
		System.setIn(bais);

		AdventureGame.main(null);

		Assert.assertEquals(
				" Welcome! \n You are now in the street with a dead body on the floor drowned in blood \n there is a building right ahead of you\n Enter building?\nY/N:  "
						+ "You are in the street with a dead body on the floor drowned in blood.\n You should enter the building...\n Enter building?\nY/N:  "
						+ "You are in the street with a dead body on the floor drowned in blood.\n You should enter the building...\n Enter building?\nY/N:  "
						+ "You entered in the building.\n There is a dragon.\n Attack?\nY/N:  "
						+ "Congratulations, you win :) \n New game?\nY/N:  "
						+ "Welcome! \n You are now in the street with a dead body on the floor drowned in blood \n there is a building right ahead of you\n Enter building?\nY/N:  "
						+ "You entered in the building.\n There is a dragon.\n Attack?\nY/N:  "
						+ "Unfortunately, you died :(\n New game?\nY/N:  "
						+ "Welcome! \n You are now in the street with a dead body on the floor drowned in blood \n there is a building right ahead of you\n Enter building?\nY/N:  "
						+ "You are in the street with a dead body on the floor drowned in blood.\n You should enter the building...\n Enter building?\nY/N:  "
						+ "You entered in the building.\n There is a dragon.\n Attack?\nY/N:  " + "Congratulations, you win :) \n New game?\nY/N: ",
				new String(baos.toByteArray()));
	}

}
