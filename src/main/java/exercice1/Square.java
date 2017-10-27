package exercice1;

import java.util.Arrays;

public class Square extends Rectangle {
	private int m_cote;

	// Constructeurs
	public Square(Point A, int c) {
		sommets = new Point[4];
		sommets[0] = A;
		sommets[1] = new Point(A.getX(), A.getY() - c);
		sommets[2] = new Point(A.getX() + c, A.getY());
		sommets[3] = new Point(A.getX() + c, A.getY() - c);
		m_cote = c;
	}

	// Méthodes
	@Override
	public double perimetre() {
		return 4 * m_cote;
	}

	@Override
	public double aire() {
		return m_cote * m_cote;
	}

	@Override
	public String toString() {
		return "Square{" +
			"m_cote=" + m_cote +
			", sommets=" + Arrays.toString(sommets) +
			'}';
	}
}
