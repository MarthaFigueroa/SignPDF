//---------------------------------------------------------------------------------------
// Copyright (c) 2001-2021 by PDFTron Systems Inc. All Rights Reserved.
// Consult legal.txt regarding legal and license information.
//---------------------------------------------------------------------------------------

public class PDFTronLicense {
	//Enter your key here. If you don't have it, please go to https://www.pdftron.com/pws/get-key to obtain a demo license or https://www.pdftron.com/form/contact-sales to obtain a production key. 
    private static String LicenseKey = "YOUR_PDFTRON_LICENSE_KEY";
	public static String Key(){
		if(LicenseKey == "YOUR_PDFTRON_LICENSE_KEY" || LicenseKey == ""){
			try{
				throw new Exception("Please enter your license key by replacing \"YOUR_PDFTRON_LICENSE_KEY\" that is assigned to the static String LicenseKey variable in Samples/LicenseKey/JAVA/PDFTronLicense.java. If you do not have a license key, please go to https://www.pdftron.com/pws/get-key to obtain a demo license or https://www.pdftron.com/form/contact-sales to obtain a production key.");
			}
			catch (Exception e){
				e.printStackTrace();
				System.exit(1);
			}
		}
		return LicenseKey;
	}
}