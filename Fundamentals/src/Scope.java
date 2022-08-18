
public class Scope {

	public static void main(String[] args) {
		int outer = 1;
		{
		int inner = 2;
	    System.out.println(outer);
	    System.out.println(inner);
		}
		int inner =3;
		System.out.println(outer);
		System.out.println(inner);
       
	}

}
