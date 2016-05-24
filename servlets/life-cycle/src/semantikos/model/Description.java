package semantikos.model;

/**
 * Descripci�n contiene todos los T�rminos que dan nombre al Concepto. Son frases
 * le�bles por humanos.
 * 
 * T�rminos que nombran un Concepto:
 * 
 * - Id de Concepto: 22298006
 * 
 * - Descripci�n completa: Infarto de miocardio (trastorno)
 * 
 * - T�rmino preferido: Infarto de miocardio
 * 
 * � Sin�nimo: Infarto card�aco
 * 
 * � Sin�nimo: Ataque card�aco
 * 
 * � Sin�nimo: Infarto de coraz�n
 * @version 1.0
 * @created 18-may-2016 10:49:39
 */
public class Description {

	private String termino;
	/**
	 * Identificador
	 */
	private int id;
	private boolean caseSensitive;
	private String descriptionType;
	/**
	 * Una descripci�n puede estar vigente o no.
	 */
	private boolean isActive;

	public Description(){

	}

	public void finalize() throws Throwable {

	}

}