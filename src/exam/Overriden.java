package exam;

public class Overriden {

}

class WrapperPadre {
	
}

class WrapperHijo extends WrapperPadre{
	
}

class PadreO {
	public WrapperHijo getP(){
		return new WrapperHijo();
	}
}

class HijoO extends Padre{
	public WrapperPadre getP() {
		return new WrapperPadre();
	}
}
