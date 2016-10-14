package is.ru.stringcalculator;

public class Calculator {
	public static int add(String text){
		if(text.equals(""))
			return 0;
		else if(text.contains(",")){
			String [] numbers = text.split("[,\n]");
			int result = 0;
			for(int i = 0; i < numbers.length; i++){
				if(Integer.parseInt(numbers[i]) < 0)
					throw new IllegalArgumentException("number cannot be negative");
				else if(Integer.parseInt(numbers[i]) > 1000){}
					//do nothing
				else
					result = result + Integer.parseInt(numbers[i]);
			}
			return result;
 		}
		else
			return 1;
	}
}