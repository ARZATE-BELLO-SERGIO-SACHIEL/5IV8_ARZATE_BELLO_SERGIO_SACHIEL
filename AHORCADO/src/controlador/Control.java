package controlador;

/**
 *
 * @author ARZATE BELLO SERGIO SACHIEL 
 * MARTINEZ GAMBOA NATALIA
 */
public class Control {
	private String palabreja = new String();
	private int longitud, fallos = 0;
	private boolean aciertos[];

	
	public String getAciertos(){
		StringBuilder palabra=new StringBuilder(palabreja);
		for (int i = 0; i < palabra.length(); i++) {
			if(!aciertos[i])
				palabra.setCharAt(i, '_');
		}
		return palabra.toString(); //palabra?
	}
	
		
	public void iniciaAciertos() {
		int contador;
		longitud = palabreja.length();
		aciertos = new boolean[longitud];

		for (contador = 0; contador < longitud; contador++)
			aciertos[contador] = false;
	}

	
	public void anotarAciertos(char letra) {
		int contador;
		boolean bandera = false;
		for (contador = 0; contador < longitud; contador++)
			if (aciertos[contador] == false && palabreja.charAt(contador) == letra) {
				aciertos[contador] = true;
				bandera = true;
			}
		if (bandera == false)
			sumarFallos();
	}

	
	public boolean palabraAcertada() {
		for (int indice = 0; indice < longitud; indice++)
			if (aciertos[indice] == false)
				return false;
		return true;
	}

	public void sumarFallos() {
		fallos++;

	}

	public int getFallos() {
		return fallos;
	}
	public String getPalabreja() {
		return palabreja;
	}

	public void setPalabreja(String palabreja) {
		this.palabreja = palabreja;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	
	public void setAciertos(boolean[] aciertos) {
		this.aciertos = aciertos;
	}

}