package creational.abstract_factory.aws;

import creational.abstract_factory.Instance;
import creational.abstract_factory.Instance.Capacity;
import creational.abstract_factory.ResourceFactory;
import creational.abstract_factory.Storage;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
