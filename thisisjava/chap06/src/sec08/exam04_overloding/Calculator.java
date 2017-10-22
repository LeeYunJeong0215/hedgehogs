package sec08.exam04_overloding;

public class Calculator {
	//정사각형, 직사각형 넓이 구하기(메소드 오버로딩)
	//정사각형 넓이
	double areaRectangle(double width){
		return width * width;
	}
	//직사각형 넓이
	double areaRectangle(double width, double height){
		return width * height;
	}
}
