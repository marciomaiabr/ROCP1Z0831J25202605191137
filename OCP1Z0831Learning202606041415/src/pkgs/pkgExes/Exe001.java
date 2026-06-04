package pkgs.pkgExes;

class ClassA {
	static StringBuilder sb1 = new StringBuilder("sb1ClassA");
	static StringBuilder sb2 = new StringBuilder("sb2ClassA");
}

class ClassAA extends ClassA {
	static StringBuilder sb2 = new StringBuilder("sb2ClassAA");
	StringBuilder getsupersb2() { return super.sb2; }
	static StringBuilder sb3 = new StringBuilder("sb3ClassAA");
}

public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {
		//System.out.println("[="+()+"]");
		System.out.println("[ClassA.sb1="+(ClassA.sb1)+"]");
		System.out.println("[ClassA.sb2="+(ClassA.sb2)+"]");
		System.out.println("[new ClassA().sb1="+(new ClassA().sb1)+"]");
		System.out.println("[new ClassA().sb2="+(new ClassA().sb2)+"]");
		System.out.println("[ClassAA.sb1="+(ClassAA.sb1)+"]");
		System.out.println("[ClassAA.sb2="+(ClassAA.sb2)+"]");
		System.out.println("[ClassAA.sb3="+(ClassAA.sb3)+"]");
		System.out.println("[new ClassAA().sb1="+(new ClassAA().sb1)+"]");
		System.out.println("[new ClassAA().sb2="+(new ClassAA().sb2)+"]");
		System.out.println("[new ClassAA().getsupersb2()="+(new ClassAA().getsupersb2())+"]");
		System.out.println("[new ClassAA().sb3="+(new ClassAA().sb3)+"]");
		System.out.println("[((ClassA) new ClassAA()).sb1="+(((ClassA) new ClassAA()).sb1)+"]");
		System.out.println("[((ClassA) new ClassAA()).sb2="+(((ClassA) new ClassAA()).sb2)+"]");
	}

}
