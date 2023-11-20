package OpeningWindow_Package;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;

import StockExhangesInfo_Package.StockExchangesInfo;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.SwingConstants;

public class OpeningWindowOpeningHoursPanel extends JPanel {
	
	public JTextField txtOpened;
	
	public String exchangeName; 
	
	public String location;
	
	public String openingHours;
	public String closingHours;
	
	/**
	 * Create the panel.
	 */
	public OpeningWindowOpeningHoursPanel(String exchangeName, String location, String openingHours, String closingHours) {
		
		this.exchangeName = exchangeName;
		
		this.location = location;
		
		this.openingHours = openingHours;
		this.closingHours = closingHours;
		
		setBorder(new LineBorder(Color.BLACK));
		setSize(100, 25);
		setBackground(Color.BLACK);
		setLayout(null);
		
		/**
		 * JTextField showing if the stock exchange is currently opened
		 */
		txtOpened = new JTextField();
		txtOpened.setForeground(Color.GREEN);
		txtOpened.setBackground(Color.BLACK);
		txtOpened.setHorizontalAlignment(SwingConstants.CENTER);
		txtOpened.setFont(new Font("DialogInput", Font.PLAIN, 14));
		txtOpened.setEditable(false);
		txtOpened.setBorder(new LineBorder(Color.BLACK));
		txtOpened.setBounds(0, 0, 100, 25);
		add(txtOpened);
		txtOpened.setColumns(10);
		
	}
	
	
	/**
	 * Method to check every second if the stock exchange is "opened"/"closed"
	 */
	public void Reload(String location, String startTime, String endTime) {
		Thread updateThread = new Thread(() -> {
			
			boolean isBold = true;
			
			while (true) {
		
				Font currentFont = txtOpened.getFont();
                Font newFont;

                
				if (isOpened(location, startTime, endTime).equals("CLOSING") || 
						(isOpened(location, startTime, endTime).equals("OPENING"))) {
					if (isBold) {
	                    newFont = currentFont.deriveFont(Font.PLAIN);
	                } else {
	                    newFont = currentFont.deriveFont(Font.BOLD);
	                }

	                txtOpened.setFont(newFont);
	                isBold = !isBold;
				}
				
				
                String status = isOpened(location, startTime, endTime);
                System.out.printf("\n | %28s | %s", exchangeName, status);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        updateThread.start();
	}

	
	/**
	 * Method recognizing if the stock exchange is opened or not and return "opened"/"closed"
	 */
	public String isOpened(String location, String startTime, String endTime) {
		TimeZone timeZone = TimeZone.getDefault();
        Calendar calendar = Calendar.getInstance(timeZone);
        
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        
        int openingHour = Integer.parseInt(startTime.split(":")[0]);
        int openingMinute = Integer.parseInt(startTime.split(":")[1]);
        
        int closingHour = Integer.parseInt(endTime.split(":")[0]);
        int closingMinute = Integer.parseInt(endTime.split(":")[1]);

        if (dayOfWeek >= Calendar.MONDAY && dayOfWeek <= Calendar.FRIDAY) {
            if (hour > openingHour || (hour == openingHour && minute > openingMinute)) {
                if (hour < closingHour || (hour == closingHour && minute < closingMinute)) {
                	 txtOpened.setForeground(Color.green);
                     txtOpened.setText("OPENED");
                	 txtOpened.setFont(new Font("DialogInput", Font.BOLD, 14));
                     return "OPENED";
             	} else  if (hour == closingHour && minute == closingMinute) {
             		txtOpened.setForeground(Color.white);
                    txtOpened.setText("CLOSING");
                    return "CLOSING";
             	} else {
             		txtOpened.setForeground(Color.red);
                    txtOpened.setText("CLOSED");
               	 	txtOpened.setFont(new Font("DialogInput", Font.PLAIN, 14));
                    return "CLOSED";
             	}
            } else if (hour == openingHour && minute == openingMinute) {
            	txtOpened.setForeground(Color.white);
                txtOpened.setText("OPENING");
                return "OPENING";
            } else {
            	txtOpened.setForeground(Color.red);
                txtOpened.setText("CLOSED");
                txtOpened.setFont(new Font("DialogInput", Font.PLAIN, 14));
                return "CLOSED";
            }
        } else {
        	 txtOpened.setForeground(Color.red);
             txtOpened.setText("CLOSED");
        	 txtOpened.setFont(new Font("DialogInput", Font.PLAIN, 14));
             return "CLOSED";
        }
	}

}
