package OpeningWindow_Package;

public class Main {

	public static void main(String[] args) {

		OpeningWindow openingWindow = new OpeningWindow();
		openingWindow.setUndecorated(true);
		openingWindow.setLocationRelativeTo(null);
		openingWindow.show();
		
		openingWindow.stockExchangesControl();
	
	}

}