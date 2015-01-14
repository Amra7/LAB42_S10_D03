package predavanje;

public class CSVBuilder {
	String res="";

	public CSVBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public  CSVBuilder append(String str){
		if(res != null){
			res += str +", ";
		} else {
			res += str;
		}
		return this;
	}
	
	public  CSVBuilder append(int num){
		if(res != null){
			res += Integer.toString(num) +", ";
		} else {
			res += Integer.toString(num);
		}
		return this;
	}
	
	public  CSVBuilder append(double num){		
		return append(String.valueOf(num));
	}
	
	public  CSVBuilder append(Address address){		
		return append(address.toString());
	}
	
	public String toString(){
		if( res!= null){
			return  res;
		}else{
			return " ";
		}
	}

}
