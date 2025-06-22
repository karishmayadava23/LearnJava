package SingletonPattern;

public class Browser {
	// 1. Private static instance of the Browser class
	private volatile static Browser browser;

	// 2. Private constructor to prevent instantiation /object
	private Browser() {
	};

	// 3. Public static getInstance method(getter method) to provide access to then
	// instance/object
	public static Browser getInstance() {
// Optimization of code with double check synchronization or double check instantiation.
// remove synchronized keyword from getInstance()
		if (browser == null) { // first check outer check
			synchronized (Browser.class) { // checking synchronization for Browser singleton class
				if (browser == null) { // inner check
					browser = new Browser();
					System.out.println("First Thread copy created the browser reference");
				}
			}

		}

		return browser;
	}

	// Individual public method of the Browser class
	public void browserInfoMethod() {
		System.out.println("Browser Info");
	}

}
