package marco.secchione;

public class Fornitore {
	private long codiceFornitore;
    private String nome;
    private String indirizzo;
    private String citta;
 public Fornitore(long codiceFornitore, String nome, String indirizzo, String citta) {
     super();
     this.codiceFornitore = codiceFornitore;
     this.nome = nome;
     this.indirizzo = indirizzo;
     this.citta = citta;
 }
 public long getCodiceFornitore() {
     return codiceFornitore;
 }
 public void setCodiceFornitore(long codiceFornitore) {
     this.codiceFornitore = codiceFornitore;
 }
 public String getNome() {
     return nome;
 }
 public void setNome(String nome) {
     this.nome = nome;
 }
 public String getIndirizzo() {
     return indirizzo;
 }
 public void setIndirizzo(String indirizzo) {
     this.indirizzo = indirizzo;
 }
 public String getCitta() {
     return citta;
 }
 public void setCitta(String citta) {
     this.citta = citta;
 }
@Override
public String toString() {
	return "Fornitore codiceFornitore = " + codiceFornitore + ", nome=" + nome + ", indirizzo=" + indirizzo + ", citta="
			+ citta + "\n";
}

}
