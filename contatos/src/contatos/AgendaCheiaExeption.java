package contatos;


public class AgendaCheiaExeption extends Exception {

   
	private static final long serialVersionUID = 1L;

@Override
   public String getMessage() {
      return "Agenda cheia";
   }

}