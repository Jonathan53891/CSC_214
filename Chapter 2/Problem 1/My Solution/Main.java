class Main {
  public static void main(String[] args) {
		String river1 = "Mississippi";
		String target1 = "i";
		String replacement1 = "ii";
		river1 = river1.replace(target1, replacement1);
		//System.out.print(river);
		//System.out.println("");
		System.out.println("Length of new string: ");
		System.out.println(river1.length());
		
		//System.out.println("");
		System.out.println("");
		
		String river2 = river1;
		String target2 = "ss";
		String replacement2 = "s";
		river2 = river2.replace(target2, replacement2);
		//System.out.print(river2);
		//System.out.println("");
		System.out.println("Length of new string: ");
		System.out.println(river2.length());
  }
}

