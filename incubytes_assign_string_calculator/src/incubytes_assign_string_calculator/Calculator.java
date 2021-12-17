package incubytes_assign_string_calculator;

public class Calculator {

	public  int add(String text){
		if(text.equals("")){
			return 0;
		}
		else{
			String my_delimiter = ",";
			if(text.matches("//(.*)\n(.*)")){
				my_delimiter = Character.toString(text.charAt(2));
				text = text.substring(4);
			}
			
			String numberList[] = splitingNumbers(text, my_delimiter + "|\n");
			return sum(numberList);
		}
	}

	private  int tooInt(String number){
		return Integer.parseInt(number);
	}

	private  String[] splitingNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}

	private  int sum(String[] numbers){
 	    int my_total = 0;
 	    String negtiveString = "";

        for(String number : numbers){
        	if(tooInt(number) < 0){
        		if(negtiveString.equals(""))
        			negtiveString = number;
        		else
        			negtiveString += ("," + number);
        	}
        	if(tooInt(number) < 1000)
        		my_total += tooInt(number);
		}

		if(!negtiveString.equals("")){
			throw new IllegalArgumentException("Negatives are not allowed: " + negtiveString);
		}

		return my_total;
    }

}
