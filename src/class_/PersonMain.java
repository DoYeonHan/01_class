package class_;

class Person {
	private String name;
	private int age;
	
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public void setData(String n, int a) {
		name =n;
		age = a;
	}
	public void setData() {
		
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
//----------
public class PersonMain {

	public static void main(String[] args) {
		Person aa =new Person();
		aa.setName("홍길동");/* aa.name = "홍길동"; */
		aa.setAge(25); /* aa.age = 25; */
		System.out.println("객체 aa = " + aa);
		System.out.println(aa.getName() +"\t"+aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		bb.setName("라이언");
		bb.setAge(30);
		System.out.println("객체 bb = " + bb);
		System.out.println(bb.getName() +"\t"+bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("코난",35);
		System.out.println("객체 cc = " + cc);
		System.out.println(cc.getName() +"\t"+cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		dd.setData();
		System.out.println("객체 dd = " + dd);
		System.out.println(dd.getName() +"\t"+dd.getAge());
		System.out.println();

	}

}
