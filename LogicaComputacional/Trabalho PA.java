public class Main
{
	public static void main(String[] args) {
	    int a1 = 15;
	    int n = 20;
	    int r= 17;
	    int an = a1+(n-1)*r;
		System.out.println(an);
		
		a1 = an - (n-1)*r;
		System.out.println(a1);
		
		r = (an - a1)/(n - 1);
		System.out.println(r);
		
		n = ((an-r+a1)/r)+1;
		System.out.println(n);
	}
}

Escolhi essa atividade pois estavamos estudando esse mesmo conteúdo em matemática, e foi muito interessante aplica-lo em linguagem java.
