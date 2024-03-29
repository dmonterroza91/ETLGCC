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
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "CredCobGer")
public class Usuario implements java.io.Serializable {

	private String nomUsu;
	private int codUsu;
	private String codigoAs;
	private String pasUsu;
	private Date ultAccUsu;

	public Usuario() {
	}

	public Usuario(String nomUsu, int codUsu, String codigoAs, String pasUsu,
			Date ultAccUsu) {
		this.nomUsu = nomUsu;
		this.codUsu = codUsu;
		this.codigoAs = codigoAs;
		this.pasUsu = pasUsu;
		this.ultAccUsu = ultAccUsu;
	}

	@Id
	@Column(name = "NOM_USU", unique = true, nullable = false, length = 16)
	public String getNomUsu() {
		return this.nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	@Column(name = "COD_USU", nullable = false)
	public int getCodUsu() {
		return this.codUsu;
	}

	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
	}

	@Column(name = "CODIGO_AS", nullable = false, length = 7)
	public String getCodigoAs() {
		return this.codigoAs;
	}

	public void setCodigoAs(String codigoAs) {
		this.codigoAs = codigoAs;
	}

	@Column(name = "PAS_USU", nullable = false, length = 16)
	public String getPasUsu() {
		return this.pasUsu;
	}

	public void setPasUsu(String pasUsu) {
		this.pasUsu = pasUsu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ULT_ACC_USU", nullable = false, length = 10)
	public Date getUltAccUsu() {
		return this.ultAccUsu;
	}

	public void setUltAccUsu(Date ultAccUsu) {
		this.ultAccUsu = ultAccUsu;
	}

}
