package protectedex.pack2;

import protectedex.pack1.A;

public class D extends A{
	//상속 관계에서는 제한이 허용됨
	public D() {
		super();
		this.filed = "good";
		this.method();
	}
}
