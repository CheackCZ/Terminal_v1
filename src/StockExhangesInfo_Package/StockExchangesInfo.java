package StockExhangesInfo_Package;

import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.SwingConstants;

public class StockExchangesInfo extends JFrame {

	private JPanel contentPane;
	
	private StockExchangesInfoButtonsPanel stockExchangesInfoButtonsPanel;
	private StockExchangesInfoNamePanel stockExchangeNamePanel;
	private StockExchangesInfoPropertiesPanel stockExchangePropertiesPanel;
	
	public String exchangeTicker;
	public String exchangeName; 
	
	public String location;
	public String currency;
	public long marketCap;
	
	public String openingHours;
	public String closingHours;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockExchangesInfo frame = new StockExchangesInfo("", "", "", "", "", "", 0l);
					frame.setUndecorated(true);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StockExchangesInfo(String exchangeTicker, String exchangeName, String location, String currency, String openingHours, String closingHours, long marketCap) {
		
		this.exchangeTicker = exchangeTicker;
		this.exchangeName = exchangeName;
		
		this.location = location;
		this.currency = currency;
		this.marketCap = marketCap;
		
		this.openingHours = openingHours;
		this.closingHours = closingHours;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Upper part ------------------------------------------------>
		
		/**
		 * JPanel with the top buttons/functions
		 */
		stockExchangesInfoButtonsPanel = new StockExchangesInfoButtonsPanel(this);
		stockExchangesInfoButtonsPanel.setBounds(0, 0, 300, 38);
		contentPane.add(stockExchangesInfoButtonsPanel);
		
		
		
		//Middle Part ------------------------------------------------>
		
		/**
		 * JPanel with the stock exchange name and ticker
		 */
		stockExchangeNamePanel = new StockExchangesInfoNamePanel();
		stockExchangeNamePanel.setBounds(12, 55, 278, 55);
		contentPane.add(stockExchangeNamePanel);
		
		
		//Bottom Part ------------------------------------------------>

		/**
		 * JPanel with the stock exchange properties
		 */
		stockExchangePropertiesPanel = new StockExchangesInfoPropertiesPanel();
		stockExchangePropertiesPanel.setBounds(12, 110, 278, 160);
		contentPane.add(stockExchangePropertiesPanel);
		
		
	}
	
	/**
	 * Method setting the given properties
	 */
	public void InfoSetUp() {
		stockExchangesInfoButtonsPanel.txtTickerSmall.setText(exchangeTicker);
		
		stockExchangeNamePanel.txtExchangeName.setText(exchangeName);
		stockExchangeNamePanel.txtTicker.setText(exchangeTicker);
		
		stockExchangePropertiesPanel.txtGivenLocation.setText(location);
		stockExchangePropertiesPanel.txtGivenCurrency.setText(currency);
		
		String marketCapString = numFormat(marketCap);
		
		stockExchangePropertiesPanel.txtGivenMarketCap.setText(marketCapString + "$");
		
		stockExchangePropertiesPanel.txtWeekHours.setText(openingHours + " - " + closingHours);
	}
	
	/**
	 * Method adding gaps in the market cap number
	 */
	public String numFormat(long number) {
        String formattedNumber = String.format("%,d", number);
        return formattedNumber;
	}
	
	
}
