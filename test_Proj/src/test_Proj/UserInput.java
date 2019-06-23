package test_Proj;

public class UserInput {
	
	public static class TextInput{
		
		public String currentValue, digitNums;
		
		public void add(char c) {
			currentValue+=c;
		}
		
		public String getValue() {
			for (int i = 0; i < currentValue.length(); i++) {
	            // Determines if the specified character is a digit
	            if (Character.isDigit(currentValue.charAt(i))) {
	            	digitNums+=String.valueOf(currentValue.charAt(i));
	            } 
	        }
			return digitNums;
		}
	}
	
	public static class NumericInput extends TextInput{
		public NumericInput() {
			// TODO Auto-generated constructor stub
			currentValue="";
			digitNums="";
		}
		
		@Override
		public void add(char c) {
			currentValue+=c;	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextInput input=new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
	}
}