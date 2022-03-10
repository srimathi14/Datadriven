package pages;

import Core.Hooks;

public class CommonMethods {
	
	public void launchUrl(String url) {
		Hooks.driver.get(url);
	}

}
