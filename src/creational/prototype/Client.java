package creational.prototype;


public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        Document d1 = new Document();
        d1.name = "Name 1";
        d1.visibility = "PRIVATE";
        d1.type = "PDF";
        d1.path = "C:/";
        
        System.out.println(d1);
        
        System.out.println("--------------");
        
        Document d2 = d1.clone();
        d2.name = "Name 2";
        
        System.out.println(d2);
        System.out.println(d1);
        
	}

}
