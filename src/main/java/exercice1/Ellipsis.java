package exercice1;

public class Ellipsis {
	protected Point m_centre;
	private int m_grandAxe = 0;
	private int m_petitAxe = 0;

	// Constructeurs
	public Ellipsis() {}
	public Ellipsis(Point c, int xAxis, int yAxis) {
		m_centre = c;
		m_grandAxe = (xAxis >= yAxis) ? xAxis : yAxis;
		m_petitAxe = (xAxis <= yAxis) ? xAxis : yAxis;
	}

	// Méthodes
	public double perimetre() {
		return 2 * Math.PI * Math.sqrt((m_grandAxe * m_grandAxe + m_petitAxe * m_petitAxe) / 2);
	}

	public double aire() {
		return Math.PI * m_grandAxe * m_petitAxe;
	}

	@Override
	public String toString() {
		return "Ellipsis{" +
			"m_grandAxe=" + m_grandAxe +
			", m_petitAxe=" + m_petitAxe +
			", m_centre=" + m_centre +
			'}';
	}
}
