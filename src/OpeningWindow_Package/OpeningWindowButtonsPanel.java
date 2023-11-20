package OpeningWindow_Package;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class OpeningWindowButtonsPanel extends JPanel {

	private JButton btnClose;
	private JButton btnExit;
	
	private JLabel lblIcon;
	
	private JTextField txtTerminal;
	
	/**
	 * Create the panel.
	 */
	public OpeningWindowButtonsPanel(OpeningWindow openingWindow) {
		setBorder(new LineBorder(Color.WHITE, 2));
		setBackground(Color.BLACK);
		setLayout(null);

		/**
		 * JButton exiting the window
		 */
		btnExit = new JButton("X");
		btnExit.setFocusable(false);
		btnExit.setBackground(Color.BLACK);
		btnExit.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnExit.setBounds(294, 1, 55, 36);
		btnExit.setForeground(Color.white);
		btnExit.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openingWindow.dispose();
			}
		});
		add(btnExit);
		
		/**
		 * JButton closing the window
		 */
		btnClose = new JButton("_");
		btnClose.setFocusable(false);
		btnClose.setBackground(Color.BLACK);
		btnClose.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnClose.setBounds(240, 1, 55, 36);
		btnClose.setForeground(Color.white);
		btnClose.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openingWindow.setExtendedState(JFrame.ICONIFIED);
			}
		});
		add(btnClose);
	
		
		/**
		 * JSeparator only for design
		 */
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		separator.setBounds(0, 36, 305, 1);
		add(separator);
		
		
		/**
		 * JLabel for icon
		 */
		lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("resources/terminal-logo.png"));
		lblIcon.setBounds(6, 2, 35, 35);
		add(lblIcon);
		
		/**
		 * JTextField next to the icon
		 */
		txtTerminal = new JTextField();
		txtTerminal.setFont(new Font("DialogInput", Font.BOLD, 16));
		txtTerminal.setText("TERMINAL");
		txtTerminal.setEditable(false);
		txtTerminal.setBackground(Color.BLACK);
		txtTerminal.setForeground(Color.WHITE);
		txtTerminal.setBounds(40, 6, 100, 25);
		add(txtTerminal);
		txtTerminal.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtTerminal.setColumns(10);
		
	}

}
