package week1.day3;

public class Browser {
	
	
	public String launchBrowser(String browserName) {
		return browserName;
	}
  public void loadUrl() {
	System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {

		Browser status = new Browser();
		System.out.println(status.launchBrowser("Browser Launched successfully ")) ;
		status.loadUrl();
	}

}
