package application;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
abstract class CheckEmpty implements Serializable
{
	public boolean filled(int x) {return x != -1;}
	public boolean filled(String x) {return  !x.isEmpty();}
	public boolean filled(LocalDate x)
	{
		return x==null; 
	}
	public boolean filled(float x) {return x != -1;}
}