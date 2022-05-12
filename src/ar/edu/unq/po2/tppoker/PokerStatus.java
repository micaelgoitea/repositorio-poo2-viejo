package ar.edu.unq.po2.tppoker;

public class PokerStatus {

	public boolean verificar(String string, String string2, String string3, String string4, String string5) {
		
		return string.startsWith(string2) && string2.startsWith(string3) && string3.startsWith(string4) | string4.startsWith(string5);
	}
}
