package credCobGerClasses;

// Generated 06-24-2014 07:46:37 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BitacoraUsu generated by hbm2java
 */
@Entity
@Table(name = "bitacora_usu", catalog = "CredCobGer")
public class BitacoraUsu implements java.io.Serializable {

	private int corBitUsu;
	private String nomUsu;
	private Date fecBitUsu;
	private String eveBitUsu;

	public BitacoraUsu() {
	}

	public BitacoraUsu(int corBitUsu, String nomUsu, Date fecBitUsu,
			String eveBitUsu) {
		this.corBitUsu = corBitUsu;
		this.nomUsu = nomUsu;
		this.fecBitUsu = fecBitUsu;
		this.eveBitUsu = eveBitUsu;
	}

	@Id
	@Column(name = "COR_BIT_USU", unique = true, nullable = false)
	public int getCorBitUsu() {
		return this.corBitUsu;
	}

	public void setCorBitUsu(int corBitUsu) {
		this.corBitUsu = corBitUsu;
	}

	@Column(name = "NOM_USU", nullable = false, length = 16)
	public String getNomUsu() {
		return this.nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FEC_BIT_USU", nullable = false, length = 10)
	public Date getFecBitUsu() {
		return this.fecBitUsu;
	}

	public void setFecBitUsu(Date fecBitUsu) {
		this.fecBitUsu = fecBitUsu;
	}

	@Column(name = "EVE_BIT_USU", nullable = false, length = 30)
	public String getEveBitUsu() {
		return this.eveBitUsu;
	}

	public void setEveBitUsu(String eveBitUsu) {
		this.eveBitUsu = eveBitUsu;
	}

}
