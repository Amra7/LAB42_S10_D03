package predavanje;

public class StringBuilder100Nums {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= 100; i++) {
			sb.append(i).append(", ");

		}

		System.out.println("String Builder: \n" + sb.toString());

		String str = "";
		for (int i = 0; i <= 100; i++) {
			str = str.concat(Integer.toString(i)).concat(", ");
		}

		System.out.println("Concat: \n" + str);

	}
}
