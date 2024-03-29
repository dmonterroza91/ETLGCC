package credCobGerClasses;

// Generated 06-24-2014 07:46:37 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CreditoId generated by hbm2java
 */
@Embeddable
public class CreditoId implements java.io.Serializable {

	private String codCre;
	private String codigoAs;

	public CreditoId() {
	}

	public CreditoId(String codCre, String codigoAs) {
		this.codCre = codCre;
		this.codigoAs = codigoAs;
	}

	@Column(name = "COD_CRE", nullable = false, length = 11)
	public String getCodCre() {
		return this.codCre;
	}

	public void setCodCre(String codCre) {
		this.codCre = codCre;
	}

	@Column(name = "CODIGO_AS", nullable = false, length = 7)
	public String getCodigoAs() {
		return this.codigoAs;
	}

	public void setCodigoAs(String codigoAs) {
		this.codigoAs = codigoAs;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CreditoId))
			return false;
		CreditoId castOther = (CreditoId) other;

		return ((this.getCodCre() == castOther.getCodCre()) || (this
				.getCodCre() != null && castOther.getCodCre() != null && this
				.getCodCre().equals(castOther.getCodCre())))
				&& ((this.getCodigoAs() == castOther.getCodigoAs()) || (this
						.getCodigoAs() != null
						&& castOther.getCodigoAs() != null && this
						.getCodigoAs().equals(castOther.getCodigoAs())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodCre() == null ? 0 : this.getCodCre().hashCode());
		result = 37 * result
				+ (getCodigoAs() == null ? 0 : this.getCodigoAs().hashCode());
		return result;
	}

}
