package marco.secchione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Una volta ottenuta una connessione possiamo interagire con il database. Le
 * interfacce JDBC Statement, CallableStatement e PreparedStatement definiscono
 * i metodi e le proprietà che consentono di inviare comandi SQL e ricevere dati
 * dal database.
 */

public class Repository {

	ConnectionHandler c1;

	public Repository(ConnectionHandler c1) {
		this.c1 = c1;
	}

	static final String QUERY_DATABASE = "CREATE DATABASE db";
	static String nome = "nome";
	static final String QUERY_TABELLA = "CREATE TABLE animale (" + nome + "  VARCHAR, razza VARCHAR, sesso CHAR)";
	static final String QUERY_UPDATE_FORNITORE = "UPDATE negozio.fornitore SET nome=?, indirizzo=?, città=? WHERE codice_fornitore=?";
	static final String QUERY_INSERISCI_FORNITORE = "INSERT INTO negozio.fornitore VALUES (?,?,?,?)";
	static final String QUERY_DELETE_CODICE_FORNITORE = "DELETE FROM negozio.fornitore WHERE codice_fornitore=?";
	static final String QUERY_DELETE_PRODOTTO = "DELETE FROM negozio.prodotto WHERE fornitore=?";
	static final String QUERY_FORNITORE_PER_CITTà = "SELECT * FROM negozio.fornitore WHERE città='roma'";
	static final String QUERY_INNERJOIN = "SELECT p.nome, p.marca FROM negozio.prodotto p JOIN negozio.fornitore f ON p.fornitore = f.codice_fornitore";
	

	public void creaDatabase() throws SQLException {

		/**
		 * Da JSE7 in poi viene introdotta l'istruzione try-with-resources. Nel blocco
		 * try vengono inseriti pi� elementi che verranno chiusi automaticamente dopo
		 * l'uso. Gli elementi che vengono dichiarati nel blocco try dovrebbero
		 * estendere la classe java.lang.AutoCloseable. In JDBC possiamo usare
		 * java.sql.CallableStatement, Connection, PreparedStatement, Statement,
		 * ResultSet e RowSet nell'istruzione try-with-resources.
		 */

		try (Connection connessione = c1.getConnessione(); Statement st = connessione.createStatement();) {
			/**
			 * Prima di poter utilizzare un oggetto Statement per eseguire un'istruzione
			 * SQL, è necessario crearne uno utilizzando il metodo createStatement()
			 * dell'oggetto Connection come segue: Statement st =
			 * connessione.createStatement() Una volta creato lo si pu� utilizzare per
			 * eseguuire un'istruzione SQL I metodi dell'interfaccia Statement:
			 * executeUpdate: per specificare aggiornamenti o istruzioni DDL executeQuery:
			 * per specificare interrogazioni e ottenere un risultato execute: per
			 * specificare istruzioni non note a priori executeBatch: per specificare
			 * sequenze di istruzioni
			 */
			st.execute(QUERY_DATABASE);
		}
	}

	public void creaTabella() throws SQLException {
		try (Connection connessione = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/db?currentschema=public&user=postgres&password=epicode");
				Statement st = connessione.createStatement();) {
			st.execute(QUERY_TABELLA);
		}
	}

	public void updateTabella(Fornitore forn) throws SQLException {
		try (Connection conn = c1.getConnessione();
				PreparedStatement ps = conn.prepareStatement(QUERY_UPDATE_FORNITORE);) {
			ps.setString(1, forn.getNome());
			ps.setString(2, forn.getIndirizzo());
			ps.setString(3, forn.getCitta());
			ps.setLong(4, forn.getCodiceFornitore());
			ps.executeUpdate();
		}

	}

	public void inserisciFornitore(Fornitore forn) throws SQLException {
		try (Connection conn = c1.getConnessione();
				PreparedStatement ps = conn.prepareStatement(QUERY_INSERISCI_FORNITORE);) {
			ps.setLong(1, forn.getCodiceFornitore());
			ps.setString(2, forn.getNome());
			ps.setString(3, forn.getIndirizzo());
			ps.setString(4, forn.getCitta());
			ps.executeUpdate();
		}
	}

	public void deleteFornitore(long codiceFornitore) throws SQLException {
		try (Connection conn = c1.getConnessione();
				PreparedStatement ps = conn.prepareStatement(QUERY_DELETE_PRODOTTO);
				PreparedStatement ps2 = conn.prepareStatement(QUERY_DELETE_CODICE_FORNITORE);) {
			ps.setLong(1, codiceFornitore);
			ps2.setLong(1, codiceFornitore);
			try {
				conn.setAutoCommit(false); // serve per annullare l'auto commit che ha la connessione di default
				ps.executeUpdate(); // fa commit se manca linea 98
				ps2.executeUpdate(); // fa commit se manca linea 98
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}
		}
	}

	public List<Fornitore> leggiPerCittà() throws SQLException {
		List<Fornitore> lista = new ArrayList<>();
		try (Connection conn = c1.getConnessione();
				Statement st = conn.createStatement();
				ResultSet rst = st.executeQuery(QUERY_FORNITORE_PER_CITTà);) {
			while (rst.next()) {
				lista.add(new Fornitore(rst.getLong("codice_fornitore"), rst.getString("nome"),
						rst.getString("indirizzo"), rst.getString("città")));
			}
			return lista;
		}
	}
	public List<Prodotto> listaProdottiConFornitore() throws SQLException{
		List<Prodotto> lista = new ArrayList<>();
		try (Connection conn = c1.getConnessione();
				Statement st = conn.createStatement();
				ResultSet rst = st.executeQuery(QUERY_INNERJOIN);
				) {
			while (rst.next()) {
				lista.add(new Prodotto(rst.getString("nome"), rst.getString("marca")));
			}
		}
		return lista;
	}
	
	
	
	
	
	
}