package behavioral.memento;

public class Client {
	public static void main(String[] args) {
		ImageEditor image = new ImageEditor("C:foto.jpg", "jpg");
		BackupManager backupManager = new BackupManager(image);
		System.out.println("Inicial: " + image);
		
		backupManager.backup();
		image.convertFormatTo("png");
		System.out.println(image);
		
		backupManager.backup();
		image.convertFormatTo("gif");
		System.out.println(image);
		
		System.out.println("**************");
		
		backupManager.undo();
		System.out.println(image);
		
		backupManager.undo();
		System.out.println(image);
		
		backupManager.undo();
	}
}