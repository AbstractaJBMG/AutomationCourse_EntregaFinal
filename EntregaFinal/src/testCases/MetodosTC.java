package testCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MetodosTC
{
	public String GenerarNumero() 
	{
		String NumeroGenerado="";
		Date Fecha = new Date();
		DateFormat FormatoFH = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		NumeroGenerado=FormatoFH.format(Fecha);
		return NumeroGenerado;
	}
}