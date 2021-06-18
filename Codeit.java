class Codeit{
	public static void main(String[] args){
		int a=25;
		int b=6;
		int c;
		char ch='X';
		float d;
		c=a>>>b;
		System.out.println("1 \t "+c);
		c=a>>>(-b);
		System.out.println("2 \t "+c);
		c=c+1;
		System.out.println("3 \t "+c);
		c=c<<b;
		System.out.println("4 \t "+c);
		c=(++b)>>c;
		System.out.println("5 \t "+c);
		d=(ch+b)/c;
		System.out.println("the final values:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}