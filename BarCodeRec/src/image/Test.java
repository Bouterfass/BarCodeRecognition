package image;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = null;
		Threshold th = new Threshold();
		Grayimage gi = new Grayimage();

		f = gi.grayImage("barcode", "barcodegi");
		f = th.threshold("barcodegi", "barcodegiT");

		Columnlength cl = new Columnlength();

		System.out.println(cl.getLength("barcodegiT"));
		CheckArray ca = new CheckArray();
		System.out.println(ca.check(cl.getLength("barcodegiT")));

	}

}
