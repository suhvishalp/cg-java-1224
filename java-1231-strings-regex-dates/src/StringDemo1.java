
public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String mobileNumber = "78508134340100";
			
			
			String pattern = "^[6789][0-9]{9}$";			//"\d"
			
			if(mobileNumber.matches(pattern)) 
				System.out.println("Valid");
			else
				System.out.println("Invalid");
			
			
			
			
			
			
			
			
			//10 digits
			
//			if(mobileNumber.length()==10) {
//				
//				//ensure it starts with 6/7/8/9
//				if(mobileNumber.startsWith("6") || mobileNumber.startsWith("7") || 
//						mobileNumber.startsWith("8") || mobileNumber.startsWith("9")){
//						
//						boolean flag = false;
//						//ensure all digits
//						for(int i=0; i<mobileNumber.length(); i++) {
//						
//							if(!Character.isDigit(mobileNumber.charAt(i))) {
//								flag = true;
//								System.out.println("invalid");
//								break;
//							}
//						}
//						
//						if(flag==false)
//							System.out.println("valid");
//						
//						
//				}else {
//					System.out.println("invalid");
//				}
//				
//			}else {
//				System.out.println("not valid");
//			}
	}

}
