package creational.prototype;

public class Document implements Cloneable {
	String name;
	String visibility;
	String type;
	String path;
	
	@Override
	protected Document clone() throws CloneNotSupportedException {
		return (Document) super.clone();
	}

	@Override
	public String toString() {
		return "Document [nome=" + name + ", visibilidade=" + visibility + ", tipo=" + type + ", localizacao="
				+ path + "]";
	}
}
