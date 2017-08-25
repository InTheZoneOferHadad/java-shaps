import java.awt.*;

class Shape{

protected Point location;
protected Color color;

public Shape(Point p, Color c){
location = p;
color = c;
}

public Shape(){}

public void move(int dx,int dy){

location.x = location.x +dx;
}
public void draw(Graphics g){}
}
