package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Columnlength {

	public ArrayList<Integer> getLength(String filepath) {

		BufferedImage img = null;

		String path = String.format("C:\\Users\\cefyo\\Desktop\\architecture\\%s.png", filepath);

		ArrayList<Integer> stock = new ArrayList<Integer>();
		ArrayList<Integer> realone = new ArrayList<Integer>();

		int length = 0;

		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.out.println(e);
		}
		// System.out.println("premiere element : " + stockLength.get(0));
		for (int x = 0; x < (img.getWidth()); x++) {
			for (int y = 0; y < (img.getHeight()); y++) {

				float rgb = img.getRGB(x, y);
				if (rgb == -16777216)
					length++;
			}
			// System.out.println(length);
			if ((stock.isEmpty())) {

				stock.add(length);

			}
			if (length == stock.get(0)) {
				stock.add(length);
			}
			if (length != stock.get(0)) {
				realone.add(stock.get(0));
				stock.clear();
				stock.add(length);
			}
			length = 0;

		}
		for (int j = 0; j < realone.size(); j++) {
			if (realone.get(j) == 0)
				realone.remove(j);
		}

		return (realone);
	}
}