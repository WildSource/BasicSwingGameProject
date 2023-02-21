package gameEngine;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 6068976602670240397L;

	public MyFrame(MyGraphics graphics) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Game");
		add(graphics);
		addKeyListener(graphics);
		this.pack();
		setLocationRelativeTo(null);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setResizable(false);
		setVisible(true);

	}

}
