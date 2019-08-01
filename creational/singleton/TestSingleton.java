package creational.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime);
		Runtime runtime2 = Runtime.getRuntime();
		System.out.println(runtime2);

		System.out.println(runtime == runtime2);

	}
}
