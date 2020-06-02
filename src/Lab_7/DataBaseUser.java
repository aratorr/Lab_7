package Lab_7;

public class DataBaseUser {
	
	private String name;
	private String addres;
	
	public DataBaseUser (String name, String addres) {
		this.name = name;
		this.addres = addres;
	}
	
	public void show(){
		System.out.println(name + " " + addres);
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddres() {
		return addres;
	}
}
