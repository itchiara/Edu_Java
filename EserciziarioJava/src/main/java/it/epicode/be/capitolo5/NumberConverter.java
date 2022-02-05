package it.epicode.be.capitolo5;

public class NumberConverter {

	private Integer cifra;
	//private String stringa;
	
	public NumberConverter(int cifra) {
		this.cifra = cifra;
	}
	
	

//	public String unita() {
//		switch(cifra) {
//		case 1:
//			stringa = "uno";
//			break;
//		case 2:
//			stringa = "due";
//			break;
//		case 3:
//			stringa = "tre";
//			break;
//		case 4:
//			stringa = "quattro";
//			break;
//		case 5: 
//			stringa = "cinque";
//			break;
//		case 6: 
//			stringa = "sei";
//			break;
//		case 7:
//			stringa = "sette";
//			break;
//		case 8:
//			stringa = "otto";
//			break;
//		case 9:
//			stringa = "nove";
//			break;
//		}
//		return stringa;
//	}
//
//	public String daDieciADiciannove() {
//		switch(cifra) {
//		case 10:
//			stringa = "dieci";
//			break;
//		case 11:
//			stringa = "undici";
//			break;
//		case 12:
//			stringa = "dodici";
//			break;
//		case 13:
//			stringa = "tredici";
//			break;
//		case 14:
//			stringa = "quattordici";
//			break;
//		case 15:
//			stringa = "quindici";
//			break;
//		case 16:
//			stringa = "sedici";
//			break;
//		case 17:
//			stringa = "diciassette";
//			break;
//		case 18:
//			stringa = "diciotto";
//			break;
//		case 19:
//			stringa = "diciannove";
//			break;
//		}
//		return stringa;
//	}
//	
//	public String decina() {
//		if(cifra>=20&&cifra <30) {
//			int unita = cifra - 20;
//			stringa = "venti" + unita();
//		}
//		return stringa;
//	}
//	
//	public void arabicToString() {
//		if(cifra < 100 && cifra >10) {
//			System.out.println(decina());
//		}
//		if(cifra < 20 && cifra >= 10) {
//			System.out.println(daDieciADiciannove());
//		}
//		if(cifra < 10) {
//			System.out.println(unita());
//		}
//	}
}
