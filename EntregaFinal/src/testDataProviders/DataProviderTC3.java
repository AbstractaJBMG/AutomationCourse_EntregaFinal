package testDataProviders;

import org.testng.annotations.DataProvider;

import testCases.MetodosTC;

public class DataProviderTC3 
{
	MetodosTC MTC = new MetodosTC();
	String COD = MTC.GenerarNumero();
	
	@DataProvider(name="DatosTC3")	
	public Object[][] DatosTC3()
	{
		Object [][] Datos = new Object [5][12];
				
		Datos [0][0] = "unopersonamail@yopmail.com";		// Mail
		Datos [0][1] = "contrasenea";						// Clave
		Datos [0][2] = "Homer";								// NuevoNombre*
		Datos [0][3] = "Simpson";							// NuevoApellido*
		Datos [0][4] = "homer_"+COD+"@yopmail.com";			// NuevoMail*
		Datos [0][5] = "55501234567891";					// NuevoNumTel*
		Datos [0][6] = "55598765432101";					// NuevoFax
		Datos [0][7] = "clavehomer";						// NuevaClave*
		Datos [0][8] = "Casa Homero 123";					// NuevaDireccion*
		Datos [0][9] = "Planta Nuclear 135";				// NuevaOtraDireccion
		Datos [0][10] = "San Andreas";						// NuevaCiudad*
		Datos [0][11] = "50000";							// NuevoCodPostal
		 
		Datos [1][0] = "dospersonamail@yopmail.com";		// Mail
		Datos [1][1] = "contrasenea";						// Clave
		Datos [1][2] = "Marge";								// NuevoNombre*
		Datos [1][3] = "Bouvier";							// NuevoApellido*
		Datos [1][4] = "marge_"+COD+"@yopmail.com";			// NuevoMail*
		Datos [1][5] = "55501234567892";					// NuevoNumTel*
		Datos [1][6] = "";									// NuevoFax
		Datos [1][7] = "clavemarge";						// NuevaClave*
		Datos [1][8] = "Casa Marge 456";					// NuevaDireccion*
		Datos [1][9] = "";									// NuevaOtraDireccion
		Datos [1][10] = "San Fierro";						// NuevaCiudad*
		Datos [1][11] = "40000";							// NuevoCodPostal
		
		Datos [2][0] = "trespersonamail@yopmail.com";		// Mail
		Datos [2][1] = "contrasenea";						// Clave
		Datos [2][2] = "Bart";								// NuevoNombre*
		Datos [2][3] = "Szyslak";							// NuevoApellido*
		Datos [2][4] = "bart_"+COD+"@yopmail.com";			// NuevoMail*
		Datos [2][5] = "55501234567893";					// NuevoNumTel*
		Datos [2][6] = "";									// NuevoFax
		Datos [2][7] = "clavebart";							// NuevaClave*
		Datos [2][8] = "Casa Bart 789";						// NuevaDireccion*
		Datos [2][9] = "";									// NuevaOtraDireccion
		Datos [2][10] = "Las Venturas";						// NuevaCiudad*
		Datos [2][11] = "30000";							// NuevoCodPostal
		
		Datos [3][0] = "cuatropersonamail@yopmail.com";		// Mail
		Datos [3][1] = "contrasenea";						// Clave
		Datos [3][2] = "Lisa";								// NuevoNombre*
		Datos [3][3] = "Skinner";							// NuevoApellido*
		Datos [3][4] = "lisa_"+COD+"@yopmail.com";			// NuevoMail*
		Datos [3][5] = "55501234567894";					// NuevoNumTel*
		Datos [3][6] = "";									// NuevoFax
		Datos [3][7] = "clavelisa";							// NuevaClave*
		Datos [3][8] = "Casa Lisa 012";						// NuevaDireccion*
		Datos [3][9] = "";									// NuevaOtraDireccion
		Datos [3][10] = "Carcer City";						// NuevaCiudad*
		Datos [3][11] = "20000";							// NuevoCodPostal
		
		Datos [4][0] = "cincopersonamail@yopmail.com";		// Mail
		Datos [4][1] = "contrasenea";						// Clave
		Datos [4][2] = "Maggie";							// NuevoNombre*
		Datos [4][3] = "Flanders";							// NuevoApellido*
		Datos [4][4] = "maggie_"+COD+"@yopmail.com";		// NuevoMail*
		Datos [4][5] = "55501234567895";					// NuevoNumTel*
		Datos [4][6] = "";									// NuevoFax
		Datos [4][7] = "clavemaggie";						// NuevaClave*
		Datos [4][8] = "Casa Maggie 345";					// NuevaDireccion*
		Datos [4][9] = "";									// NuevaOtraDireccion
		Datos [4][10] = "Liberty City";						// NuevaCiudad*
		Datos [4][11] = "10000";							// NuevoCodPostal
		
		return Datos;
	}
}
