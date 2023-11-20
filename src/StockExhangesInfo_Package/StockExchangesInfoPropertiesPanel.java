package StockExhangesInfo_Package;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class StockExchangesInfoPropertiesPanel extends JPanel {

	private JTextField txtLocation;
	private JTextField txtCurrency;
	private JTextField txtOpeningHours;
	
	public JTextField txtGivenLocation;
	public JTextField txtGivenCurrency;
	
	private JTextField txtWeekDays;
	private JTextField txtWeekend;
	
	public JTextField txtWeekHours;
	public JTextField txtWeekendHours;
	
	private JTextField txtMarketCap;
	public JTextField txtGivenMarketCap;
	
	/**
	 * Create the panel.
	 */
	public StockExchangesInfoPropertiesPanel() {
		setBackground(Color.BLACK);
		
		setLayout(null);
		
		/**
		 * JTextField with the location sign
		 */
		txtLocation = new JTextField("Location:");
		txtLocation.setEditable(false);
		txtLocation.setHorizontalAlignment(SwingConstants.LEADING);
		txtLocation.setBackground(Color.BLACK);
		txtLocation.setForeground(Color.LIGHT_GRAY);
		txtLocation.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtLocation.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtLocation.setBounds(5, 0, 120, 25);
		add(txtLocation);
		txtLocation.setColumns(10);
		
		/**
		 * JTextField with the currency sign
		 */
		txtCurrency = new JTextField("Currency:");
		txtCurrency.setEditable(false);
		txtCurrency.setHorizontalAlignment(SwingConstants.LEADING);
		txtCurrency.setBackground(Color.BLACK);
		txtCurrency.setForeground(Color.LIGHT_GRAY);
		txtCurrency.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtCurrency.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtCurrency.setColumns(10);
		txtCurrency.setBounds(5, 25, 120, 25);
		add(txtCurrency);
		
		/**
		 * JTextField with the opening hours sign
		 */
		txtOpeningHours = new JTextField("Trading hours");
		txtOpeningHours.setEditable(false);
		txtOpeningHours.setHorizontalAlignment(SwingConstants.CENTER);
		txtOpeningHours.setBackground(Color.BLACK);
		txtOpeningHours.setForeground(new Color(255, 153, 0));
		txtOpeningHours.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtOpeningHours.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtOpeningHours.setColumns(10);
		txtOpeningHours.setBounds(5, 85, 275, 25);
		add(txtOpeningHours);
		
		/**
		 * JTextField with the given location
		 */
		txtGivenLocation = new JTextField("");
		txtGivenLocation.setEditable(false);
		txtGivenLocation.setHorizontalAlignment(SwingConstants.CENTER);
		txtGivenLocation.setBackground(Color.BLACK);
		txtGivenLocation.setForeground(Color.white);
		txtGivenLocation.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtGivenLocation.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtGivenLocation.setBounds(125, 0, 155, 25);
		add(txtGivenLocation);
		txtGivenLocation.setColumns(10);
		
		/**
		 * JTextField with the given currency
		 */
		txtGivenCurrency = new JTextField("");
		txtGivenCurrency.setHorizontalAlignment(SwingConstants.CENTER);
		txtGivenCurrency.setForeground(Color.WHITE);
		txtGivenCurrency.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtGivenCurrency.setEditable(false);
		txtGivenCurrency.setColumns(10);
		txtGivenCurrency.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtGivenCurrency.setBackground(Color.BLACK);
		txtGivenCurrency.setBounds(125, 25, 155, 25);
		add(txtGivenCurrency);
		
		/**
		 * JTextField with the "Monday to Friday" times sign
		 */
		txtWeekDays = new JTextField("Monday to Friday");
		txtWeekDays.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeekDays.setForeground(Color.LIGHT_GRAY);
		txtWeekDays.setFont(new Font("DialogInput", Font.BOLD, 12));
		txtWeekDays.setEditable(false);
		txtWeekDays.setColumns(10);
		txtWeekDays.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtWeekDays.setBackground(Color.BLACK);
		txtWeekDays.setBounds(0, 110, 150, 25);
		add(txtWeekDays);
		
		/**
		 * JTextField with the "Saturday/Sunday" times sign
		 */
		txtWeekend = new JTextField("Saturday/Sunday ");
		txtWeekend.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeekend.setForeground(Color.LIGHT_GRAY);
		txtWeekend.setFont(new Font("DialogInput", Font.BOLD, 12));
		txtWeekend.setEditable(false);
		txtWeekend.setColumns(10);
		txtWeekend.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtWeekend.setBackground(Color.BLACK);
		txtWeekend.setBounds(0, 135, 150, 25);
		add(txtWeekend);
		
		/**
		 * JTextField with the week opening hours
		 */
		txtWeekHours = new JTextField();
		txtWeekHours.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeekHours.setForeground(Color.WHITE);
		txtWeekHours.setFont(new Font("DialogInput", Font.BOLD, 12));
		txtWeekHours.setEditable(false);
		txtWeekHours.setColumns(10);
		txtWeekHours.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtWeekHours.setBackground(Color.BLACK);
		txtWeekHours.setBounds(130, 110, 150, 25);
		add(txtWeekHours);
		
		/**
		 * JTextField with the weekend opening hours
		 */
		txtWeekendHours = new JTextField("N/A");
		txtWeekendHours.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeekendHours.setForeground(Color.WHITE);
		txtWeekendHours.setFont(new Font("DialogInput", Font.BOLD, 12));
		txtWeekendHours.setEditable(false);
		txtWeekendHours.setColumns(10);
		txtWeekendHours.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtWeekendHours.setBackground(Color.BLACK);
		txtWeekendHours.setBounds(130, 135, 150, 25);
		add(txtWeekendHours);
		
		/**
		 * JTextField with the market cap of given stock exchange
		 */
		txtMarketCap = new JTextField("Market Cap:");
		txtMarketCap.setHorizontalAlignment(SwingConstants.LEADING);
		txtMarketCap.setForeground(Color.LIGHT_GRAY);
		txtMarketCap.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtMarketCap.setEditable(false);
		txtMarketCap.setColumns(10);
		txtMarketCap.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtMarketCap.setBackground(Color.BLACK);
		txtMarketCap.setBounds(5, 50, 120, 25);
		add(txtMarketCap);
		
		/**
		 * JTextField with the given market cap
		 */
		txtGivenMarketCap = new JTextField("");
		txtGivenMarketCap.setHorizontalAlignment(SwingConstants.CENTER);
		txtGivenMarketCap.setForeground(Color.WHITE);
		txtGivenMarketCap.setFont(new Font("DialogInput", Font.BOLD, 12));
		txtGivenMarketCap.setEditable(false);
		txtGivenMarketCap.setColumns(10);
		txtGivenMarketCap.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		txtGivenMarketCap.setBackground(Color.BLACK);
		txtGivenMarketCap.setBounds(120, 50, 155, 25);
		add(txtGivenMarketCap);
		
		
	}

}
