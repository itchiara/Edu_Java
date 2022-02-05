package eserciziTre0203;

import java.time.LocalDate;

public class Decespugliatore extends Apparecchiatura{
	public boolean accensioneElettrica;

	public Decespugliatore(int numeroOrdine, String marca, LocalDate dataIngresso, boolean accensioneElettrica) {
		super(numeroOrdine, marca, dataIngresso);
		this.accensioneElettrica = accensioneElettrica;
	}

	public boolean isAccensioneElettrica() {
		return accensioneElettrica;
	}

	public void setAccensioneElettrica(boolean accensioneElettrica) {
		this.accensioneElettrica = accensioneElettrica;
	}
	
	
}
