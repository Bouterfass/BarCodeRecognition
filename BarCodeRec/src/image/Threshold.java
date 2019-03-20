package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Threshold {

	public  File threshold(String filepath, String result) {

		File f = null;
		String path = String.format("C:\\Users\\cefyo\\Desktop\\architecture\\%s.png", filepath);
		String res = String.format("C:\\Users\\cefyo\\Desktop\\architecture\\%s.png", result);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(path) );
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Largeur : " + img.getWidth());
		System.out.println("Hauteur : " + img.getHeight());

	
		float threshold = -8421504;

		for (int x = 0; x < (img.getWidth() ); x++) {
			for (int y = 0; y < (img.getHeight()); y++) {
				
				float rgb = img.getRGB(x, y);
				if (rgb > threshold)
				{
				//	System.out.println("c supp");
					img.setRGB(x, y, -1);
				} else {
				//	System.out.println("c inf");
					img.setRGB(x, y, -16777216);
				}

			}
		}
		try
		{
			f = new File(res);
			ImageIO.write(img, "png", f);
		}catch(IOException e)
		{
			System.out.println(e);
		}
		return f;
	}

}
