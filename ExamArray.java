public class ExamArray{
	
	public static void main (String []args){


		int arr[]  = {10,20,30,40,50,60,70,80,90,100};

		//left to right

		System.out.println("letf to right: ");

		for (int i=0; i<arr.length;i++){

			System.out.println("letf to right is "+arr[i]);


		}
		//right to left
		System.out.println(" right to left: ");
		for (int i=arr.length-1; i>=0;i--){

			System.out.println(" right to left is "+arr[i]);


		}

		System.out.println(" middle to left: ");
		for (int i=arr.length/2; i>=0;i--){

			System.out.println(" middle to left is "+arr[i]);


		}

		System.out.println(" skipping 1 elements: ");

		for (int i=0; i<arr.length;i=i+2){

			System.out.println("skipping 1 value "+arr[i]);


		}

	}


}