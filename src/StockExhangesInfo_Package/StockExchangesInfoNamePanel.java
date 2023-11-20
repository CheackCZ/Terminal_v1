package StockExhangesInfo_Package;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StockExchangesInfoNamePanel extends JPanel {

	public JTextField txtTicker;
	public JTextField txtExchangeName;
	
	/**
	 * Create the panel.
	 */
	public StockExchangesInfoNamePanel() {
		setLayout(null);

		/**
		 * JTextField with the exchange full name
		 */
		txtExchangeName = new JTextField();
		txtExchangeName.setEditable(false);
		txtExchangeName.setHorizontalAlignment(SwingConstants.CENTER);
		txtExchangeName.setBackground(Color.BLACK);
		txtExchangeName.setForeground(Color.gray);
		txtExchangeName.setFont(new Font("DialogInput", Font.BOLD, 16));
		txtExchangeName.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtExchangeName.setBounds(0, 25, 278, 30);
		add(txtExchangeName);
		txtExchangeName.setColumns(10);
		
		
		/**
		 * JTextField with the exchange ticker (big)
		 */
		txtTicker = new JTextField();
		txtTicker.setEditable(false);
		txtTicker.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicker.setBackground(Color.BLACK);
		txtTicker.setForeground(new Color(255, 153, 0));
		txtTicker.setFont(new Font("DialogInput", Font.BOLD, 28));
		txtTicker.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtTicker.setBounds(0, 0, 278, 25);
		add(txtTicker);
		txtTicker.setColumns(10);
		
	}

}
