import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s1.length() > s2.length())
				return 1;
		else 
			return -1;
	}

	
}
