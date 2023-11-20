package OpeningWindow_Package;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.border.LineBorder;

import StockExhangesInfo_Package.StockExchangesInfo;

import javax.swing.JLabel;

public class OpeningWindowTimesPanel extends JPanel {
	
	private JTextField txtStockExch;
	
	private JTextField txtNYSE;
	private JTextField txtASX;
	private JTextField txtSSE;
	
	private JTextField txtLSE;
	private JTextField txtXETR;
	private JTextField txtPX;
	
	private JLabel lblInfoIcon;
	private JLabel lblInfoIcon1;
	private JLabel lblInfoIcon2;
	
	private JLabel lblInfoIcon3;
	private JLabel lblInfoIcon4;
	private JLabel lblInfoIcon5;
	
	private StockExchangesInfo stockExchangesInfo;
	
	public OpeningWindowOpeningHoursPanel stockExchangesOpenedPanelNYSE;
	public OpeningWindowOpeningHoursPanel stockExchangesOpenedPanelASX;
	public OpeningWindowOpeningHoursPanel stockExchangesOpenedPanelSSE;
	
	public OpeningWindowOpeningHoursPanel stockExchangesOpenedPanelLSE;
	public OpeningWindowOpeningHoursPanel stockExchangesOpenedPanelXETRA;
	public OpeningWindowOpeningHoursPanel stockExchangesOpenedPanelPX;

	
	/**
	 * Create the panel.
	 */
	public OpeningWindowTimesPanel() {
		
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.BLACK);
		setLayout(null);
		
		/**
		 * JTextField with the stock exchanges times sign
		 */
		txtStockExch = new JTextField();
		txtStockExch.setBackground(new Color(0, 0, 0));
		txtStockExch.setForeground(Color.gray);
		txtStockExch.setHorizontalAlignment(SwingConstants.CENTER);
		txtStockExch.setText("Stock Exhchanges Trading Hours");
		txtStockExch.setEditable(false);
		txtStockExch.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtStockExch.setBounds(10, 10, 296, 25);
		txtStockExch.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(txtStockExch);
		txtStockExch.setColumns(10);
		
		/**
		 * JTextField with the NYSE - New York
		 */
		txtNYSE = new JTextField("NYSE");
		txtNYSE.setForeground(Color.DARK_GRAY);
		txtNYSE.setBackground(Color.BLACK);
		txtNYSE.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtNYSE.setEditable(false);
		txtNYSE.setBounds(10, 40, 40, 20);
		txtNYSE.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(txtNYSE);
		txtNYSE.setColumns(10);
		
		/**
		 * JTextField with the ASX - Australia
		 */
		txtASX = new JTextField("ASX");
		txtASX.setForeground(Color.DARK_GRAY);
		txtASX.setBackground(Color.BLACK);
		txtASX.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtASX.setEditable(false);
		txtASX.setColumns(10);
		txtASX.setBounds(10, 60, 40, 20);
		txtASX.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(txtASX);
		
		/**
		 * JTextField with the SSE - China
		 */
		txtSSE = new JTextField("SSE");
		txtSSE.setForeground(Color.DARK_GRAY);
		txtSSE.setBackground(Color.BLACK);
		txtSSE.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtSSE.setEditable(false);
		txtSSE.setColumns(10);
		txtSSE.setBounds(10, 80, 40, 20);
		txtSSE.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(txtSSE);
		
		/**
		 * JTextField with the LSE - London
		 */
		txtLSE = new JTextField("LSE");
		txtLSE.setForeground(Color.DARK_GRAY);
		txtLSE.setBackground(Color.BLACK);
		txtLSE.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtLSE.setEditable(false);
		txtLSE.setColumns(10);
		txtLSE.setBounds(166, 40, 40, 20);
		txtLSE.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(txtLSE);
		
		/**
		 * JTextField with the XETRA - GERMANY
		 */
		txtXETR = new JTextField("XETRA");
		txtXETR.setForeground(Color.DARK_GRAY);
		txtXETR.setBackground(Color.BLACK);
		txtXETR.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtXETR.setEditable(false);
		txtXETR.setColumns(10);
		txtXETR.setBounds(166, 60, 50, 20);
		txtXETR.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(txtXETR);
		
		/**
		 * JTextField with the PX - Czechia
		 */
		txtPX = new JTextField("PX");
		txtPX.setForeground(Color.DARK_GRAY);
		txtPX.setBackground(Color.BLACK);
		txtPX.setFont(new Font("DialogInput", Font.BOLD, 14));
		txtPX.setEditable(false);
		txtPX.setColumns(10);
		txtPX.setBounds(166, 80, 40, 20);
		txtPX.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		add(txtPX);
		
		
		
		/**
		 * JLabel with the information icon
		 */
		lblInfoIcon = new JLabel("");
		lblInfoIcon.setBounds(55, 44, 15, 14);
		lblInfoIcon.setIcon(new ImageIcon("resources/Icon-information_stock_exchanges_times.jpg"));
		lblInfoIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInfoIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stockExchangeSetUp("NYSE", "New York Stock Exchange", "New York/USA", "USD ($)", "15:30", "22:00", 22649000000000l);
			}
		});
		add(lblInfoIcon);
		
		/**
		 * JLabel with the information icon
		 */
		lblInfoIcon1 = new JLabel("");
		lblInfoIcon1.setBounds(55, 64, 15, 14);
		lblInfoIcon1.setIcon(new ImageIcon("resources/Icon-information_stock_exchanges_times.jpg"));
		lblInfoIcon1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInfoIcon1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stockExchangeSetUp("ASX", "Australian Security Exchange",  "Sydney/Australia", "AUD ($)", "00:00", "06:00", 2300000000000l);
			}
		});
		add(lblInfoIcon1);
		
		/**
		 * JLabel with the information icon
		 */
		lblInfoIcon2 = new JLabel("");
		lblInfoIcon2.setBounds(55, 84, 15, 14);
		lblInfoIcon2.setIcon(new ImageIcon("resources/Icon-information_stock_exchanges_times.jpg"));
		lblInfoIcon2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInfoIcon2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stockExchangeSetUp("SSE", "Shanghai Stock Exchange",  "Shanghai/China", "CNY (¥)", "04:30", "11:30", 7260000000000l);
			}
		});
		add(lblInfoIcon2);
		
		/**
		 * JLabel with the information icon
		 */
		lblInfoIcon3 = new JLabel("");
		lblInfoIcon3.setBounds(225, 44, 15, 14);
		lblInfoIcon3.setIcon(new ImageIcon("resources/Icon-information_stock_exchanges_times.jpg"));
		lblInfoIcon3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInfoIcon3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stockExchangeSetUp("LSE", "London Stock Exchange", "London/UK", "GBP (£)", "09:00", "17:30", 3180000000000l);
			}
		});
		add(lblInfoIcon3);
		
		/**
		 * JLabel with the information icon
		 */
		lblInfoIcon4 = new JLabel("");
		lblInfoIcon4.setBounds(225, 64, 15, 14);
		lblInfoIcon4.setIcon(new ImageIcon("resources/Icon-information_stock_exchanges_times.jpg"));
		lblInfoIcon4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInfoIcon4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stockExchangeSetUp("XETRA", "Frankfurt Stock Exchange",  "Frankfurt/Germany", "EUR (€)", "09:00", "17:30", 2370000000000l);
			}
		});
		add(lblInfoIcon4);
		
		/**
		 * JLabel with the information icon
		 */
		lblInfoIcon5 = new JLabel("");
		lblInfoIcon5.setBounds(225, 84, 15, 14);
		lblInfoIcon5.setIcon(new ImageIcon("resources/Icon-information_stock_exchanges_times.jpg"));
		lblInfoIcon5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblInfoIcon5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stockExchangeSetUp("PX", "Prague Stock Exchange", "Prague/Czechia", "CZK", "09:00", "17:00", 37670440);
			}
		});
		add(lblInfoIcon5);
		
		
		
		/**
		 * JPanel with the opened/closed words for NYSE
		 */
		stockExchangesOpenedPanelNYSE = new OpeningWindowOpeningHoursPanel("New York Stock Exchange", "America/New_York", "15:30", "22:00");
		stockExchangesOpenedPanelNYSE.txtOpened.setSize(80, 25);
		stockExchangesOpenedPanelNYSE.setBounds(70, 38, 80, 25);
		add(stockExchangesOpenedPanelNYSE);
		
		/**
		 * JPanel with the opened/closed words for ASX
		 */
		stockExchangesOpenedPanelASX = new OpeningWindowOpeningHoursPanel("Australian Security Exchange", "Australia/Sydney", "00:00", "06:00");
		stockExchangesOpenedPanelASX.txtOpened.setSize(80, 25);
		stockExchangesOpenedPanelASX.setBounds(70, 58, 80, 25);
		add(stockExchangesOpenedPanelASX);
		
		/**
		 * JPanel with the opened/closed words for SSE
		 */
		stockExchangesOpenedPanelSSE = new OpeningWindowOpeningHoursPanel("Shanghai Stock Exchange", "Asia/Shanghai", "04:30", "11:30");
		stockExchangesOpenedPanelSSE.txtOpened.setSize(80, 25);
		stockExchangesOpenedPanelSSE.setBounds(70, 78, 80, 25);
		add(stockExchangesOpenedPanelSSE);
		
		/**
		 * JPanel with the opened/closed words for SSE
		 */
		stockExchangesOpenedPanelLSE = new OpeningWindowOpeningHoursPanel("London Stock Exchange", "Europe/London", "09:00", "17:30");
		stockExchangesOpenedPanelLSE.txtOpened.setSize(80, 25);
		stockExchangesOpenedPanelLSE.setBounds(240, 38, 80, 25);
		add(stockExchangesOpenedPanelLSE);
		
		/**
		 * JPanel with the opened/closed words for ASX
		 */
		stockExchangesOpenedPanelXETRA = new OpeningWindowOpeningHoursPanel("Frankfurt Stock Exchange", "Europe/Berlin", "09:00", "17:30");
		stockExchangesOpenedPanelXETRA.txtOpened.setSize(80, 25);
		stockExchangesOpenedPanelXETRA.setBounds(240, 58, 80, 25);
		add(stockExchangesOpenedPanelXETRA);
		
		/**
		 * JPanel with the opened/closed words for SSE
		 */
		stockExchangesOpenedPanelPX = new OpeningWindowOpeningHoursPanel("Prague Stock Exchange", "Europe/Prague", "09:00", "17:00");
		stockExchangesOpenedPanelPX.txtOpened.setSize(80, 25);
		stockExchangesOpenedPanelPX.setBounds(240, 78, 80, 25);
		add(stockExchangesOpenedPanelPX);
		

	}
	
	/**
	 * Method setting up the info of given stock exchange 
	 */
	public void stockExchangeSetUp(String exchangeTicker, String exchangeName, String location, String Currency, String openingHours, String closingHours, long marketCap) {
		stockExchangesInfo = new StockExchangesInfo(exchangeTicker, exchangeName, location, Currency, openingHours, closingHours, marketCap);
		
		stockExchangesInfo.InfoSetUp();
		
		stockExchangesInfo.setUndecorated(true);
		stockExchangesInfo.setLocationRelativeTo(null);
		stockExchangesInfo.show();
	}
	
}
