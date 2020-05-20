package xmlTesting;
//hola
public class Hola extends Hola2{
	public Hola()
	{
		super("hola");
	}
	public Hola(String hola) {
		super(hola);
		System.out.println(getHola());
		
	}
	public String path(Object o)
	{
		return o.getClass().getCanonicalName();
	}

	
}
