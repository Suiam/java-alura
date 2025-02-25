import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		//Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		
		//no java 8:
//		palavras.sort((s1, s2) -> { interface funcional
//				if(s1.length() < s2.length())
//					return -1;
//				
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//		});
		
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length())); //lambda
		
//		palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.sort(Comparator.comparing(String :: length)); //method reference
		
		
		System.out.println(palavras);
		
//		for (String p : palavras) {
//			System.out.println(p);
//		}
//		
		//no java 8:
//		palavras.forEach(s -> System.out.println(s)); //lambda
		
		Consumer<String> impressor = System.out :: println;
		palavras.forEach(impressor);
		
		palavras.forEach(System.out :: println);
	}
}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}	
}
