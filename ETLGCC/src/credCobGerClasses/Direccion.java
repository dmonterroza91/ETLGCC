package credCobGerClasses;

// Generated 06-24-2014 07:46:37 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Direccion generated by hbm2java
 */
@Entity
@Table(name = "direccion", catalog = "CredCobGer")
public class Direccion implements java.io.Serializable {

	private DireccionId id;
	private String direDir;

	public Direccion() {
	}

	public Direccion(DireccionId id, String direDir) {
		this.id = id;
		this.direDir = direDir;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codigoAs", column = @Column(name = "CODIGO_AS", nullable = false, length = 7)),
			@AttributeOverride(name = "numCorDir", column = @Column(name = "NUM_COR_DIR", nullable = false)) })
	public DireccionId getId() {
		return this.id;
	}

	public void setId(DireccionId id) {
		this.id = id;
	}

	@Column(name = "DIRE_DIR", nullable = false, length = 50)
	public String getDireDir() {
		return this.direDir;
	}

	public void setDireDir(String direDir) {
		this.direDir = direDir;
	}

}
