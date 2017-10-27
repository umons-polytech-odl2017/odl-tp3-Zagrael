package exercice1;

import java.util.Arrays;

public class Rectangle extends ConvexPolygon {
	private int m_largeur = 0;
	private int m_longueur = 0;

	// Constructeur
	public Rectangle() {}
	public Rectangle(Point A, Point B) {
		sommets = new Point[4];
		sommets[0] = A;
		sommets[1] = new Point(A.getX(), B.getY());
		sommets[2] = B;
		sommets[3] = new Point(B.getX(), A.getY());

		m_largeur = (Math.abs(B.getX() - A.getX()) <= Math.abs(B.getY() - A.getY())) ? Math.abs(B.getX() - A.getX()) : Math.abs(B.getY() - A.getY());
		m_longueur = (Math.abs(B.getX() - A.getX()) >= Math.abs(B.getY() - A.getY())) ? Math.abs(B.getX() - A.getX()) : Math.abs(B.getY() - A.getY());
	}

	// Méthodes
	@Override
	public double perimetre() {
		return 2 * (m_largeur + m_longueur);
	}

	@Override
	public double aire() {
		return m_largeur * m_longueur;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
			"m_largeur=" + m_largeur +
			", m_longueur=" + m_longueur +
			", sommets=" + Arrays.toString(sommets) +
			'}';
	}
}
