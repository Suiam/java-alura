
public class Fluxo {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try { //com esse try catch nao precisa colocar throws no metodo main pois a excecao esta sendo tratada
        	metodo1(); 
		} catch (Exception ex) { // colocando exception pegara qualquer excecao pois todas herdam de exception; catch polimorfico
			String msg = ex.getMessage(); 
			System.out.println("Exception " + msg); 
			ex.printStackTrace(); 
		} 
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Deu errado");
        //MinhaExcecao extend classe Exception para compliar tem q colocar na assinatura do metodo throws MinhaExcecao ou coloca um try catch para resolver a excecao
        //System.out.println("Fim do metodo2"); //com o throw essa linha nao sera executada
    }
}


//categoria Arithmetic Exception, NullPOinterException->RuntimeException = unchecked(excecao nao sao verificados pelo compilador)
//categoria Exception->Throwable = checked(excecao verificadas pelo compilador)