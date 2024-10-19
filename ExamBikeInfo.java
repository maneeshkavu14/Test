public class ExamBikeInfo{
	public static void main(String[] args) {
		
// No parameterized
		ExamBike bikeNoparam1=new ExamBike();
		



// Parameterized
		ExamBike bike1= new ExamBike( "Duccati", 280, "panigala 800", 2024, "EV");
		ExamBike bike2= new ExamBike( "Suzuki", 178, "Gixxer 250", 2011, "Petrol");
		ExamBike bike3= new ExamBike( "Bajaj", 020, "pulsur 200", 2010, "Petrol");
		ExamBike bike4= new ExamBike( "TVS", 1340, "apache 200", 2000, "Petrol");
		
		bike1.bikeInfo();
		System.out.println("****************************");

		bike2.bikeInfo();
		System.out.println("****************************");

		bike3.bikeInfo();
		System.out.println("****************************");

		bike4.bikeInfo();
		System.out.println("****************************");

	}
}