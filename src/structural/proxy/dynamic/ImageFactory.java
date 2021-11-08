package structural.proxy.dynamic;

import java.lang.reflect.Proxy;

import structural.proxy.Image;

public class ImageFactory {
	public static Image getImage(String name) {
		return (Image)Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class},
				new ImageInvocationHandler(name)); 
	}
}