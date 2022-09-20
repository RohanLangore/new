package wrapper;

public class ByteWrap {
	public static void main(String[] args) {
		byte b = 20;

		Byte b1 = new Byte(b);// boxing
		Byte b2 = b;// autoxoxing

		// byte b11=10;
		Byte b3 = new Byte((byte) 10);

	}

}
