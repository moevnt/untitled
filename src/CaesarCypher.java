public class CaesarCypher {

	public static void main(String[] args){
		char[] encoded =new char[]{'V','S','P','O','S','C','L','O','K','E','D','S','P','E','V'};
		char[] key = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] decoded = new char[15];

		for(int i=0;i<26;i++){

			for(int k =0;k<encoded.length;k++){

				char out = (char)(encoded[k]+i);


				if(out > 90){
					char temp = 65;
					System.out.print(temp);

				}

				else
					System.out.print(out);
			}
			System.out.println();
		}
	}
}
