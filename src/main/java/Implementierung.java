
public class Implementierung implements IMdpJunitDemo{

	public String capitalize(String s) {
		return (s.substring(0, 1).toUpperCase() + s.substring(1, s.length()).toLowerCase());
	}

	public boolean isEmpty(String s) {
		if(s.length() == 0 || s == null){
			return true;
		}
		return false;
	}

	public String join(String... strings) {
		
		String ret = "";
		
		for (String string : strings) {
			ret += string + " ";
		} 
		
		return ret;
	}

	public String reverse(String s) throws NullPointerException {
		String ret = "";

		for (int j = s.length(); j > 0; j--) {
			ret += s.substring(j-1, j);
		}
		return ret;
	}

}
