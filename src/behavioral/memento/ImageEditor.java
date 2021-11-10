package behavioral.memento;

import java.time.LocalDate;

public class ImageEditor {

	private String filePath;
	private String fileFormat;
	
	public ImageEditor(String filePath, String fileFormat) {
		this.filePath = filePath;
		this.fileFormat = fileFormat;
	}
	
	public void convertFormatTo(String format) {
		filePath = filePath.replace(this.fileFormat, format);
		this.fileFormat = format;
	}
	
	public Memento salvar() {
		LocalDate date = LocalDate.now();
		return new ConcreteMemento(date.toString(), date, filePath, fileFormat);
		
	}
	
	public void restaurar(Memento memento) {
		ConcreteMemento concreteMemento = (ConcreteMemento) memento;
		this.filePath = concreteMemento.getFilePath();
		this.fileFormat = concreteMemento.getFileFormat();
	}

	@Override
	public String toString() {
		return "ImageEditor [filePath=" + filePath + ", fileFormat=" + fileFormat + "]";
	}
}
