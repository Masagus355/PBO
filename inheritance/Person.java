package inheritance;

public class Person {
	public String nama;
	public String address;
	public String hobby;
	//Constructor dengan parameter
	public Person(String nama, String address,String hobby) {
		this.nama = nama;
		this.address = address;
		this.hobby = hobby;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public String getHobby(){
		return hobby;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setHobby(String hobby){
		this.hobby = hobby;
	}

	public void identity() {
		System.out.println("Nama: " + nama);
		System.out.println("Alamat: " + address);
		
	}
	public void hobi() {
	System.out.println("Hobi"+ Hobby);
 }
}