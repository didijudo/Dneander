package machine;


public class Ula extends Machine{

	private static Ula single;
	
	private Ula(){
		
	}
	
	public static Ula getInstance(){
		if(single != null)
			return single;
		
		single = new Ula();
		return single;
	}
	
	
	public void nop() {
		
	}

	public void d_add(short op) {
		D_AC += op;
	}
	
	public void d_subtraction(short op) {
		D_AC -= op;
	}

	public void d_or(short op) {
		D_AC |= op;
	}
	
	public void d_exclusive_or(short op) {
		D_AC ^= op;
	}

	public void d_and(short op) {
		D_AC &= op;
	}

	public void d_not() {
		D_AC = ~D_AC;
	}
	
}
