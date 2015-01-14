package predavanje;

public class Student {

	private int id;
	private String name;
	private Address  adress; 
	
	public Student(int id, String name,Address adress ){
		this.id =id;
		this.name = name;
		this.adress = adress;
	}
	
	public String toCsv(){
		CSVBuilder csv = new CSVBuilder();
//		csv.append(Integer.toString(id)).append(name).append(adress);
		return csv.toString();
	}
	
}
