public class ExamBike{
	
	String brandName;
    int modelNo;
    String bikeName;
    int manufatureYear;
    String fuelType; 

    public ExamBike(){
		
		System.out.println("****************************");

    	System.out.println("No parameterized Constructor");

    	System.out.println("****************************");
    }


    public ExamBike( String brandName,int modelNo,String bikeName,int manufatureYear,String fuelType){

    	this.brandName=brandName;
    	this.modelNo=modelNo;
    	this.bikeName=bikeName;
    	this.manufatureYear=manufatureYear;
    	this.fuelType=fuelType;

    }

//behaviors

    public static void startingEngine(){

    }
    public static void stopingEngine(){

    }
    public static void fuelRefill(){

    }


    public void bikeInfo(){


    	System.out.println("Brand name "+ brandName);
    	System.out.println("model No "+ modelNo);
    	System.out.println("Bike name "+ bikeName);
    	System.out.println("manufaturing year "+ manufatureYear);
    	System.out.println("Fuel type "+ fuelType);


    }


}


