package StockExhangesInfo_Package;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class StockExchangesInfoButtonsPanel extends JPanel {

	private JButton btnClose;
	private JButton btnExit;
	
	public JTextField txtTickerSmall;
	
	/**
	 * Create the panel.
	 */
	public StockExchangesInfoButtonsPanel(StockExchangesInfo stockExchangesInfo) {
		setBorder(new LineBorder(Color.WHITE, 2));
		setBackground(Color.BLACK);
		setLayout(null);
		
		
		/**
		 * JTextField with the ticker at the top
		 */
		txtTickerSmall = new JTextField();
		txtTickerSmall.setForeground(Color.WHITE);
		txtTickerSmall.setFont(new Font("DialogInput", Font.BOLD, 16));
		txtTickerSmall.setEditable(false);
		txtTickerSmall.setBackground(Color.BLACK);
		txtTickerSmall.setBounds(12, 6, 100, 25);
		txtTickerSmall.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(txtTickerSmall);
		txtTickerSmall.setColumns(10);

		/**
		 * JSeparator only for design
		 */
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
		separator.setBounds(0, 36, 305, 1);
		add(separator);
	
		/**
		 * JButton exiting the window
		 */
		btnExit = new JButton("X");
		btnExit.setFocusable(false);
		btnExit.setBackground(Color.BLACK);
		btnExit.setFont(new Font("DialogInput", Font.BOLD, 12));
		btnExit.setBounds(244, 1, 55, 36);
		btnExit.setForeground(Color.white);
		btnExit.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stockExchangesInfo.dispose();
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
		btnClose.setBounds(190, 1, 55, 36);
		btnClose.setForeground(Color.white);
		btnClose.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stockExchangesInfo.setExtendedState(JFrame.ICONIFIED);
			}
		});
		add(btnClose);
		
	}

}
