package vjezbe;

public class GenericLinkedListTest {

	public static void main(String[] args) {
		
		GenericLinkedList<String> gll = new GenericLinkedList<String>();
		gll.add("Maja");
		gll.add("Nikola");
		gll.add("Vedrana");
		gll.add("Mi");
		gll.add("Nasi");
		
		// added
		System.out.println("Add: " + gll.toString());
		
		// remove
		gll.remove(2);
		System.out.println("Remove: " + gll.toString());
		
		// getSize
		System.out.println("Get size: " + gll.getSize());
		
		// contains
		System.out.println("Contains: " + gll.contains("Nikola"));
		System.out.println("Contains: " + gll.contains("Neko"));
		
	}

}
