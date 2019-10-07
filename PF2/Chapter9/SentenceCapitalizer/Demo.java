package SentenceCapitalizer;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ("nguyen phi thuyen... tran minh tri. are you kidding me.");
		String []tokens= str.split("\\. ");
		StringBuilder sb= new StringBuilder();
		for (int i=0; i<tokens.length;i++) {
			//System.out.println(tokens[i].trim());
			StringBuilder centences= new StringBuilder (tokens[i].trim());
			//System.out.println(centences.charAt(0));
			centences.setCharAt(0, Character.toUpperCase(centences.charAt(0)));
			sb.append(centences);
			if (i!=tokens.length-1)
			{
				sb.append(". ");
			}
		}
		System.out.println(sb);
		
	}

}
