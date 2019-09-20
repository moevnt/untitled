public class Decide {

	public static void decide(){
		int choice = (int) (Math.random()*10);

		if(choice >5)
			System.out.print("SEND IT");
		else
			System.out.print("IDIOT");
	}

	public static void main(String[] args){
		decide();
	}

}
