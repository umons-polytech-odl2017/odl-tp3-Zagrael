package exercice1;

public class Circle extends Ellipsis {
	private int m_rayon;

	// Constructeurs
	public Circle(Point p, int r) {
		m_centre = p;
		m_rayon = r;
	}

	// Méthodes
	@Override
	public double perimetre() {
		return 2* Math.PI * m_rayon;
	}

	@Override
	public double aire() {
		return Math.PI * m_rayon * m_rayon;
	}

	@Override
	public String toString() {
		return "Circle{" +
			"m_centre=" + m_centre +
			", m_rayon=" + m_rayon +
			'}';
	}
}
