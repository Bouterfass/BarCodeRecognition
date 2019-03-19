package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Threshold {

	public static void main(String[] args) {

		File f = null;
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("C:\\Users\\cefyo\\Desktop\\architecture\\barcodegray.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Largeur : " + img.getWidth());
		System.out.println("Hauteur : " + img.getHeight());

		System.out.println("Couleur hors cercle : " + img.getRGB(10, 10));
		System.out.println("Couleur dans le cercle : " + img.getRGB(250, 250));
		float threshold = -8421504;

		for (int x = 0; x < (img.getWidth() ); x++) {
			for (int y = 0; y < (img.getHeight()); y++) {
				
				float rgb = img.getRGB(x, y);
				if (rgb > threshold)
				{
					System.out.println("c supp");
					img.setRGB(x, y, -1);
				} else {
					System.out.println("c inf");
					img.setRGB(x, y, -16777216);
				}

			}
		}
		try
		{
			f = new File("C:\\Users\\cefyo\\Desktop\\architecture\\barcodeT.png");
			ImageIO.write(img, "png", f);
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
