package sec11.exam02_static_final;

public class Earth {
	//Static Final(상수)
	//static이므로 객체마다 저장되지 않고, 클래스에만 포함된다
	//final필드 이므로 초기값이 한 번 저장되면 변경할 수 없다.
	//상수이름은 모두 대문자로 해주는게 관례
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static{
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
