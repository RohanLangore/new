package excep;
import java.io.IOException;
public class ExceptionPropagation2 {
	
	void method3() throws IOException {
		
		throw new IOException();
	}

	void method2() throws IOException {
		System.out.println("method2");
		//// try
		//// {
		method3();
		/*
		 * } catch(IOException e) { System.out.println("HandledException"); }
		 */
	}

	void method1() throws IOException {
		System.out.println("method1");
		method2();
	}

	public static void main(String[] args) throws IOException {
		ExceptionPropagation2 e = new ExceptionPropagation2();

		e.method1();
		System.out.println("Rest of the code");
	}
}
