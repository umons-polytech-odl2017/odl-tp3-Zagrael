package exercice1;

import java.util.Arrays;

public class ConvexPolygon {
	protected Point[] sommets;

	// Constructeurs
	public ConvexPolygon() {

	}
	public ConvexPolygon(Point p[]) {
		sommets = new Point[p.length];
		for (int i = 0; i < p.length; i++)
			sommets[i] = new Point(p[i]);
	}

	// Méthodes
	public double perimetre() {
		double v = 0.0;
		for (int i = 0; i < sommets.length - 1; i++)
		{
			v += Math.sqrt((sommets[i].getX() - sommets[i + 1].getX()) * (sommets[i].getX() - sommets[i + 1].getX()) + (sommets[i].getY() - sommets[i + 1].getY()) * (sommets[i].getY() - sommets[i + 1].getY()));
		}
		v += Math.sqrt((sommets[sommets.length - 1].getX() - sommets[0].getX()) * (sommets[sommets.length - 1].getX() - sommets[0].getX()) + (sommets[sommets.length - 1].getY() - sommets[0].getY()) * (sommets[sommets.length - 1].getY() - sommets[0].getY()));
		return v;
	}

	public double aire() {
		double v = 150;
		/* ? Subdiviser le polygone en triangles ? */
		return v;
	}

	// Méthodes réécrites
	@Override
	public String toString() {
		return "ConvexPolygon{" +
			"sommets=" + Arrays.toString(sommets) +
			'}';
	}
}
