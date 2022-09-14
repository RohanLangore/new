package string1;


	//diff between builder and buffer
	///String buffer is syncronized threads-safe one thread
	// at time another thread needs to wait i.e why it is
	//slow performance


	//String builder is non-syncronized not threads-safe mutiple thread
	//at time another thread needs does not to wait i.e why it is
	//fast in  performance

	public class StringBuilder1 {

		public static void main(String[] args) {
			StringBuilder sb = new StringBuilder("hello");
			System.out.println(sb.capacity());
			sb.append("java programming language");
			System.out.println(sb.length());

			System.out.println(sb.capacity());
			sb.append("string buffer ");
			System.out.println(sb.length());

			System.out.println(sb.capacity());
			// TODO Auto-generated method stub

		}
	}
