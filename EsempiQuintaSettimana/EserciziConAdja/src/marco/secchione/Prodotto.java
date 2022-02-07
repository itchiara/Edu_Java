package marco.secchione;

public class Prodotto {
	private long codiceProdotto;
    private String nome;
    private String descrizione;
    private String marca;
    private Fornitore forn;
    private double prezzo;
   public Prodotto(long codiceProdotto, String nome, String descrizione, String marca, Fornitore forn, double prezzo) {

       this.codiceProdotto = codiceProdotto;
       this.nome = nome;
       this.descrizione = descrizione;
       this.marca = marca;
       this.forn = forn;
       this.prezzo = prezzo;
   }
   public Prodotto(String nome, String marca) {
	this.nome = nome;
	this.marca = marca;
}
public long getCodiceProdotto() {
       return codiceProdotto;
   }
   public void setCodiceProdotto(long codiceProdotto) {
       this.codiceProdotto = codiceProdotto;
   }
   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public String getDescrizione() {
       return descrizione;
   }
   public void setDescrizione(String descrizione) {
       this.descrizione = descrizione;
   }
   public String getMarca() {
       return marca;
   }
   public void setMarca(String marca) {
       this.marca = marca;
   }
   public Fornitore getForn() {
       return forn;
   }
   public void setForn(Fornitore forn) {
       this.forn = forn;
   }
    public double getPrezzo() {
        return prezzo;
    }
   public void setPrezzo(double prezzo) {
       this.prezzo = prezzo;
   }
@Override
public String toString() {
	return "Prodotto codiceProdotto=" + codiceProdotto + ", nome=" + nome + ", descrizione=" + descrizione + ", marca="
			+ marca + ", forn=" + forn + ", prezzo=" + prezzo + "\n";
}
   
}
