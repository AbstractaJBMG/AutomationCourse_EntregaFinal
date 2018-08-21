package testDataProviders;

import org.testng.annotations.DataProvider;

import testCases.MetodosTC;

public class DataProviderTC1 
{
	@DataProvider(name="DatosTC1")	
	public Object[][] DatosTC1()
	{
		Object [][] Datos = new Object [1][13];
				
		Datos [0][0] = "Persona Nombre Uno";				// Nombres*
		Datos [0][1] = "Persona Apellido Uno";				// Apellidos*
		Datos [0][2] = "unopersonamail@yopmail.com";		// Mail*
		Datos [0][3] = "10123456789";						// NumTel*
		Datos [0][4] = "10987654321";						// NumFax
		Datos [0][5] = "Tesla Motors";						// Empresa
		Datos [0][6] = "Uno Casa 123";						// Direccion1*
		Datos [0][7] = "Av Siempreviva 30";					// Direccion2
		Datos [0][8] = "Ciudad Uno";						// Ciudad*
		Datos [0][9] = "1000";								// CodPostal*
		Datos [0][10] = "225";								// NumPais*
		Datos [0][11] = "3701";								// NumZona*
		Datos [0][12] = "contrasenea";						// Clave*
		 
		Datos [1][0] = "Persona Nombre Dos";				// Nombres*
		Datos [1][1] = "Persona Apellido Dos";				// Apellidos*
		Datos [1][2] = "dospersonamail@yopmail.com";		// Mail*
		Datos [1][3] = "20123456789";						// NumTel*
		Datos [1][4] = "";									// NumFax
		Datos [1][5] = "";									// Empresa
		Datos [1][6] = "Dos Casa 123";						// Direccion1*
		Datos [1][7] = "";									// Direccion2
		Datos [1][8] = "Ciudad Dos";						// Ciudad*
		Datos [1][9] = "1000";								// CodPostal*
		Datos [1][10] = "222";								// NumPais*
		Datos [1][11] = "3581";								// NumZona*
		Datos [1][12] = "contrasenea";						// Clave*
		
		Datos [2][0] = "Persona Nombre Tres";				// Nombres*
		Datos [2][1] = "Persona Apellido Tres";				// Apellidos*
		Datos [2][2] = "trespersonamail@yopmail.com";		// Mail*
		Datos [2][3] = "30123456789";						// NumTel*
		Datos [2][4] = "";									// NumFax
		Datos [2][5] = "";									// Empresa
		Datos [2][6] = "Tres Casa 123";						// Direccion1*
		Datos [2][7] = "";									// Direccion2
		Datos [2][8] = "Ciudad Tres";						// Ciudad*
		Datos [2][9] = "1000";								// CodPostal*
		Datos [2][10] = "176";								// NumPais*
		Datos [2][11] = "2799";								// NumZona*
		Datos [2][12] = "contrasenea";						// Clave*
		
		Datos [3][0] = "Persona Nombre Cuatro";				// Nombres*
		Datos [3][1] = "Persona Apellido Cuatro";			// Apellidos*
		Datos [3][2] = "cuatropersonamail@yopmail.com";		// Mail*
		Datos [3][3] = "40123456789";						// NumTel*
		Datos [3][4] = "";									// NumFax
		Datos [3][5] = "";									// Empresa
		Datos [3][6] = "Cuatro Casa 123";					// Direccion1*
		Datos [3][7] = "";									// Direccion2
		Datos [3][8] = "Ciudad Cuatro";						// Ciudad*
		Datos [3][9] = "1000";								// CodPostal*
		Datos [3][10] = "81";								// NumPais*
		Datos [3][11] = "1256";								// NumZona*
		Datos [3][12] = "contrasenea";						// Clave*
		
		Datos [4][0] = "Persona Nombre Cinco";				// Nombres*
		Datos [4][1] = "Persona Apellido Cinco";			// Apellidos*
		Datos [4][2] = "cincopersonamail@yopmail.com";		// Mail*
		Datos [4][3] = "50123456789";						// NumTel*
		Datos [4][4] = "";									// NumFax
		Datos [4][5] = "";									// Empresa
		Datos [4][6] = "Cinco Casa 123";					// Direccion1*
		Datos [4][7] = "";									// Direccion2
		Datos [4][8] = "Ciudad Cinco";						// Ciudad*
		Datos [4][9] = "1000";								// CodPostal*
		Datos [4][10] = "107";								// NumPais*
		Datos [4][11] = "1697";								// NumZona*
		Datos [4][12] = "contrasenea";						// Clave*
		
		return Datos;
	}
}
