package sec08.exam04_overloding;

public class Calculator {
	//���簢��, ���簢�� ���� ���ϱ�(�޼ҵ� �����ε�)
	//���簢�� ����
	double areaRectangle(double width){
		return width * width;
	}
	//���簢�� ����
	double areaRectangle(double width, double height){
		return width * height;
	}
}
