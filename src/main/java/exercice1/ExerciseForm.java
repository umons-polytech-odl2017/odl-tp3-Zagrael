package exercice1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciseForm {

	private JPanel mainPanel;
	private JRadioButton rectangleButton;
	private JRadioButton squareButton;
	private JRadioButton circleButton;
	private JRadioButton ellipsisButton;
	private JTextArea messageArea;
	private JPanel drawingPanel;
	private ButtonGroup formGroup;
	private SubPanel panel;

	public ExerciseForm() {
		rectangleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageArea.setText("Affichage d'un rectangle");
			}
		});

		squareButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageArea.setText("Affichage d'un carré");
			}
		});

		circleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageArea.setText("Affichage d'un cercle");
			}
		});

		ellipsisButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				messageArea.setText("Affichage d'une ellipse");
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("ExerciseForm");
		frame.setContentPane(new ExerciseForm().mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
