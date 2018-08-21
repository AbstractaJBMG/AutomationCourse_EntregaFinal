package testDataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderTC2 
{
	@DataProvider(name="DatosTC2")	
	public Object[][] DatosTC2()
	{
		Object [][] Datos = new Object [5][3];
				
		Datos [0][0] = "unopersonamail@yopmail.com";			// Mail
		Datos [0][1] = "contrasenea";							// Clave
		Datos [0][2] = "mac";									// Item

		Datos [1][0] = "dospersonamail@yopmail.com";			// Mail
		Datos [1][1] = "contrasenea";							// Clave
		Datos [1][2] = "iphone";								// Item
		
		Datos [2][0] = "trespersonamail@yopmail.com";			// Mail
		Datos [2][1] = "contrasenea";							// Clave
		Datos [2][2] = "tab";									// Item
		
		Datos [3][0] = "cuatropersonamail@yopmail.com";		// Mail
		Datos [3][1] = "contrasenea";							// Clave
		Datos [3][2] = "syncmaster";							// Item
		
		Datos [4][0] = "cincopersonamail@yopmail.com";		// Mail
		Datos [4][1] = "contrasenea";							// Clave
		Datos [4][2] = "nikon";									// Item
		
		return Datos;
	}
}
