package creational.abstract_factory.gcp;

import creational.abstract_factory.Instance;
import creational.abstract_factory.Instance.Capacity;
import creational.abstract_factory.ResourceFactory;
import creational.abstract_factory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
