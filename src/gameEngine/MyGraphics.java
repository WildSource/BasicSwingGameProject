package gameEngine;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MyGraphics extends JPanel implements ActionListener, KeyListener {

	private static final long serialVersionUID = 3075120564182138988L;

	Timer timer;

	public MyGraphics() {
		windowConfig();
		addKeyListener(this);

		timer = new Timer(1, this);
		timer.start();
	}

	// render
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graphics2d = (Graphics2D) g;
	}

	// Main loop
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	// Keys
	@Override
	public void keyTyped(KeyEvent e) {
		int key = e.getKeyCode();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
	}

	private void windowConfig() {
		setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
	}
}
