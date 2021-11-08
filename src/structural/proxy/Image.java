package structural.proxy;

import creational.objectpool.Point2D;

public interface Image {

	void setLocation(Point2D point2d);
	
	Point2D getLocation();
	
	void render();
	
}
