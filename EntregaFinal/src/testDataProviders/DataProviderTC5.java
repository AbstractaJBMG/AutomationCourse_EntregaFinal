package testDataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderTC5 
{
	@DataProvider(name="DatosTC5")	
	public Object[][] DatosTC5()
	{
		Object [][] Datos = new Object [5][3];
				
		Datos [0][0] = "unopersonamail@yopmail.com";			// Mail
		Datos [0][1] = "contrasenea";							// Clave

		Datos [1][0] = "dospersonamail@yopmail.com";			// Mail
		Datos [1][1] = "contrasenea";							// Clave
		
		Datos [2][0] = "trespersonamail@yopmail.com";			// Mail
		Datos [2][1] = "contrasenea";							// Clave
		
		Datos [3][0] = "cuatropersonamail@yopmail.com";		// Mail
		Datos [3][1] = "contrasenea";							// Clave
		
		Datos [4][0] = "cincopersonamail@yopmail.com";		// Mail
		Datos [4][1] = "contrasenea";							// Clave
		
		return Datos;
	}
}
