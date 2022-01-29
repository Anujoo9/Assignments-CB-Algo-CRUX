package Assignment_2;

public class dec_to_oct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 63;
		System.out.println(dec_tooct(dec));

	}
	 public static int dec_tooct(int dec){
	        int oct = 0;
	        int mul = 1;
	        while (dec>0){
	            int rem = dec%8;
	            oct = oct +mul*rem;
	            mul=mul*10;
	            dec/=8;
	            
	        }
	        return oct;

}
}