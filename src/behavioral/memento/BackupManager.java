package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class BackupManager {

	private List<Memento> mementos = new ArrayList<>();
	private ImageEditor imageEditor;
	
	public BackupManager(ImageEditor imageEditor) {
		this.imageEditor = imageEditor;
	}

	public void backup() {
		mementos.add(this.imageEditor.salvar());
		System.out.println("Backup realizado com sucesso.");
	}
	
	public void undo() {
		if (mementos.isEmpty()) {
			System.out.println("Memento vazio!");
			return;
		}
		Memento memento = mementos.remove(mementos.size() - 1);
		imageEditor.restaurar(memento);
		System.out.println("Backup restaurado com sucesso.");
	}
}
