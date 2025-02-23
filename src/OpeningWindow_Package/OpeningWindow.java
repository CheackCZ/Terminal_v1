package OpeningWindow_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;

public class OpeningWindow extends JFrame {

	private JPanel contentPane;
	
	private JTextField txtInsertStock;
	
	
	public OpeningWindowTimesPanel exchangesPanel;
	
	private OpeningWindowButtonsPanel openingWindowButtonsPanel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpeningWindow frame = new OpeningWindow();
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
	public OpeningWindow() {
		
		/**
		 * Setting the properties of the JFrame
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 250);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/**
		 * JTextField with the field to enter the stock ticker/company name
		 */
		txtInsertStock = new JTextField();
		txtInsertStock.setHorizontalAlignment(SwingConstants.CENTER);
		txtInsertStock.setForeground(new Color(255, 153, 0));
		txtInsertStock.setText("Insert stock ticker/name");
		txtInsertStock.setFont(new Font("DialogInput", Font.BOLD, 18));
		txtInsertStock.setBackground(Color.BLACK);
		txtInsertStock.setBounds(17, 65, 316, 30);
		contentPane.add(txtInsertStock);
		txtInsertStock.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				textEmpty();
			}
			@Override
			public void focusGained(FocusEvent e) {
				clickedOnTheText();
			}
		});
		txtInsertStock.setColumns(10);
		
		
		
		/**
		 * JPanel with the top of the screen and the buttons
		 */
		openingWindowButtonsPanel = new OpeningWindowButtonsPanel(this);
		openingWindowButtonsPanel.setBounds(0, 0, 350, 38);
		contentPane.add(openingWindowButtonsPanel);
		
		/**
		 * JPanel with the times of the stock exchanges
		 */
		exchangesPanel = new OpeningWindowTimesPanel(); 
		exchangesPanel.setBounds(17, 100, 316, 110);
		contentPane.add(exchangesPanel);
		
	}
	
	
	 /**
     * Method recognizes if user wants to search for something and empties the field
     */
    public void clickedOnTheText() {
        if(txtInsertStock.getText().equals("Insert stock ticker/name")) {
            txtInsertStock.setText("");
    		txtInsertStock.setHorizontalAlignment(SwingConstants.LEADING);
            txtInsertStock.setForeground(Color.white);
        }
    }

    /**
     * Method recognizes that user no longer wants to search for anything and set the text back
     */
    public void textEmpty() {
        if (txtInsertStock.getText().isEmpty()) {
            txtInsertStock.setText("Insert stock ticker/name");
    		txtInsertStock.setHorizontalAlignment(SwingConstants.CENTER);
    		txtInsertStock.setForeground(new Color(255, 153, 0));
        }
    }
    
    
    
    /**
     * Method that checks all the stock exchanges if they are opened or close
     */
    public void stockExchangesControl() {
    	exchangesPanel.stockExchangesOpenedPanelNYSE.Reload(exchangesPanel.stockExchangesOpenedPanelNYSE.location, 
    			exchangesPanel.stockExchangesOpenedPanelNYSE.openingHours, exchangesPanel.stockExchangesOpenedPanelNYSE.closingHours);
    	exchangesPanel.stockExchangesOpenedPanelASX.Reload(exchangesPanel.stockExchangesOpenedPanelASX.location, 
    			exchangesPanel.stockExchangesOpenedPanelASX.openingHours, exchangesPanel.stockExchangesOpenedPanelASX.closingHours);
    	exchangesPanel.stockExchangesOpenedPanelSSE.Reload(exchangesPanel.stockExchangesOpenedPanelSSE.location, 
    			exchangesPanel.stockExchangesOpenedPanelSSE.openingHours, exchangesPanel.stockExchangesOpenedPanelSSE.closingHours);
    	exchangesPanel.stockExchangesOpenedPanelLSE.Reload(exchangesPanel.stockExchangesOpenedPanelLSE.location, 
    			exchangesPanel.stockExchangesOpenedPanelLSE.openingHours, exchangesPanel.stockExchangesOpenedPanelLSE.closingHours);
    	exchangesPanel.stockExchangesOpenedPanelXETRA.Reload(exchangesPanel.stockExchangesOpenedPanelXETRA.location, 
    			exchangesPanel.stockExchangesOpenedPanelXETRA.openingHours, exchangesPanel.stockExchangesOpenedPanelXETRA.closingHours);
    	exchangesPanel.stockExchangesOpenedPanelPX.Reload(exchangesPanel.stockExchangesOpenedPanelPX.location, 
    			exchangesPanel.stockExchangesOpenedPanelPX.openingHours, exchangesPanel.stockExchangesOpenedPanelPX.closingHours);

    }
    
}
