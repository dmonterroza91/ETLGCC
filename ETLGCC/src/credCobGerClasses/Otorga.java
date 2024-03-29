package credCobGerClasses;

// Generated 06-24-2014 07:46:37 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Otorga generated by hbm2java
 */
@Entity
@Table(name = "otorga", catalog = "CredCobGer")
public class Otorga implements java.io.Serializable {

	private OtorgaId id;

	public Otorga() {
	}

	public Otorga(OtorgaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "numLinCred", column = @Column(name = "NUM_LIN_CRED", nullable = false)),
			@AttributeOverride(name = "numCorrSuc", column = @Column(name = "NUM_CORR_SUC", nullable = false)) })
	public OtorgaId getId() {
		return this.id;
	}

	public void setId(OtorgaId id) {
		this.id = id;
	}

}
