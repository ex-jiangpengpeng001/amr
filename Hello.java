public class Hello {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		run.gc();
		System.out.println("Hello GIT");
	}
}