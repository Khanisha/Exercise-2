package Exercise2;

public class Main {

	public static void main(String[] args) {
		Laptop a = new Laptop();
		System.out.println(a.brand);
		System.out.println(a.model);
		System.out.println(a.price);
		a.gaming();
		a.work();
		a.production();
		
		Watch b = new Watch();
		System.out.println(b.brand);
		System.out.println(b.colour);
		System.out.println(b.strap);
		b.Analogue();
		b.Digital();
		b.Smart();
	}

}
