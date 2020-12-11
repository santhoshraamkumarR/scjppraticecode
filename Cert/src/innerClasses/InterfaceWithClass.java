package innerClasses;
//Class inside the interface
public interface InterfaceWithClass {
	
	public void email(EmailService e) ;
		class EmailService{
		  String body;
		  String toList;
		  String ccList;
	}

}
