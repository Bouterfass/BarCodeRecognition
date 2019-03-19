package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Columnlength {

	public static void main(String[] args) {

		File f = null;
		BufferedImage img = null;

		int tab[] = { 0, 0 };
		int length = 0;

		try {
			img = ImageIO.read(new File("C:\\Users\\cefyo\\Desktop\\architecture\\barcodeTfalse.png"));
		} catch (IOException e) {
			System.out.println(e);
		}

		for (int x = 0; x < (img.getWidth()); x++) {
			for (int y = 0; y < (img.getHeight()); y++) {
				
				float rgb = img.getRGB(x, y);
				if (rgb == -16777216)
					length++;
			}
		if (length != 0)
			System.out.println(length);
		length = 0;
		}
	}

}
