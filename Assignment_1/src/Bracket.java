
public class Bracket {
	
	static boolean is_valid(String exp)
	{
		Stack st = new Stack(exp.length());
		char expArr[] = exp.toCharArray();
		for(char x : expArr) {
			if(st.isEmpty())
			{
				st.push(x);
			}
			else if((st.top()=='('&& x==')') || (st.top()=='{'&& x=='}') || (st.top()=='['&& x==']'))
				st.pop();
			else
				st.push(x);
		}
		if(st.isEmpty())
			return true;
		return false;
	}
	public static void main(String[] args) {
		String exp = "{{[()]}}";
		System.out.println(is_valid(exp));
	}

}
