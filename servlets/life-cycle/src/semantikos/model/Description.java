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
	private int id;
	private boolean caseSensitive;
	private String descriptionType;
	private boolean isActive;

	public Description(int id, String termino){
		this.id=id;
		this.termino=termino;
	}
	public String getTermino() {
		return termino;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString(){
		return "ID: "+getId()+" Termino: "+getTermino();
	}


	public void finalize() throws Throwable {

	}

}