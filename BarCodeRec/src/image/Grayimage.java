package image;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Grayimage {

	public File grayImage(String filepath, String result) throws IOException {

		File f = null;
		BufferedImage img = null;

		String path = String.format("C:\\Users\\cefyo\\Desktop\\architecture\\%s.png", filepath);
		String res = String.format("C:\\Users\\cefyo\\Desktop\\architecture\\%s.png", result);
		// read image
		try {
			f = new File(path);
			img = ImageIO.read(f);

		} catch (IOException e) {
			System.out.println(e);
		}

		// get width and height

		int width = img.getWidth();
		int height = img.getHeight();

		// convert to grayscale

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int p = img.getRGB(x, y);

				int a = (p >> 24) & 0xff;
				int r = (p >> 16) & 0xff;
				int g = (p >> 8) & 0xff;
				int b = p & 0xff;

				int avg = (r + g + b) / 3;
				p = (a << 24) | (avg << 16) | (avg << 8) | avg;

				img.setRGB(x, y, p);
			}
		}

		try {
			f = new File(res);
			ImageIO.write(img, "png", f);
		} catch (IOException e) {
			System.out.println(e);
		}
		return f;
	}

}
