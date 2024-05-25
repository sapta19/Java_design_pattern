package singleton_design_pattern;
public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
		// private constructor
	}

	public static Singleton getInstance() {
		if (instance == null) {
     // synchronized(Singleton.class){
          instance = new Singleton();
      //}
			
		}
		return instance;
	}
}
