// Класс представляющий точку в трехмерной пространстве
public class Point3d {
	private double xCoord;
	private double yCoord;
	private double zCoord;
	// Конструктор при котором точки задаются при инициализации объекта по переданным параметрам
	public Point3d ( double x,  double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}
	// Конструктор при котором точки задаются при инициализации объекта
	public Point3d() {
		this(0.0, 0.0, 0.0);
	}
	// Возвращает значение координаты x
	public double getX () {
		return xCoord;
	}
	// Возвращает значение координаты y
	public double getY () {
		return yCoord;
	}
	// Возвращает значение координаты z
	public double getZ () {
		return zCoord;
	}
	// Задает значение координаты x
	public void setX( double val) {
		xCoord= val;
	}
	// Задает значение координаты y
	public void  setY ( double val) {
		yCoord = val;
	}
	// Задает значение координаты z
	public void  setZ ( double val) {
		zCoord = val;
	}
	// Функция проверки, являются ли значения переданного и текущего объекта равными
	public boolean equals(Point3d point)
	{
   		if (point == null || this == null)
      		return false;
   		return this.xCoord == point.xCoord && this.yCoord == point.yCoord && this.zCoord == point.zCoord;
	}
	// Функция определяет расстояние между двумя точками в трехмерном пространстве по Евклидовой формуле и возращает результат с точностью до 2 цифр после запятой
	public double distanceTo(Point3d point)
	{
		double x = this.xCoord - point.xCoord;
		double y = this.yCoord - point.yCoord;
		double z = this.zCoord - point.zCoord;
		
		double answer = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

		double scale = Math.pow(10, 2);
		double result = Math.ceil(answer * scale) / scale;

   		return result;
	}
}