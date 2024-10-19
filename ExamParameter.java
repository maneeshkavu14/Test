public class Exam1{
	public static void main(String[] args) {

		

		/// without parametr
		emailWithoutParam();


		/// with parametr 

		emailWithParam("maneeshkavu@gmail.com", "mock test happening");

		
	}
	


	public static void emailWithoutParam() {
		String emailId= "maneeshkavu@gmail.com";
		String subject="test exam happening";
		System.out.println(" emailWithoutParam" );
        System.out.println("Email sent to " + emailId + " with subject: " + subject );
    }
	//with parameter
	public static void emailWithParam(String emailId, String subject) {
		System.out.println(" emailWithParam" );
        System.out.println("Email sent to " + emailId + " with subject: " + subject );
    }

}