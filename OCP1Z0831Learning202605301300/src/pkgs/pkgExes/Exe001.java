package pkgs.pkgExes;

class ClassA {
	{ System.out.println("[ClassA][{}][1]"); }
	public ClassA() { System.out.println("[ClassA][ClassA()][AS]"); super(); System.out.println("[ClassA][ClassA()][DS]"); }
	{ System.out.println("[ClassA][{}][2]"); }
}
class ClassAA extends ClassA {
	{ System.out.println("[ClassAA][{}][1]"); }
	private int i = m1();
	public int getI() {
		return i;
	}
	public ClassAA() { System.out.println("[ClassAA][ClassAA()][AS]"); super(); System.out.println("[ClassAA][ClassAA()][DS]"); }
	{ System.out.println("[ClassAA][{}][2]"); }
	private int m1() {
		System.out.println("[ClassAA][mi()]");
		return 9;
	}
}
class ClassAAA extends ClassAA {
	{ System.out.println("[ClassAAA][{}][1]"); }
	public ClassAAA() { System.out.println("[ClassAAA][ClassAAA()][AS]"); super(); System.out.println("[ClassAAA][ClassAAA()][DS]"); }
	{ System.out.println("[ClassAAA][{}][2]"); }
}

public class Exe001 {

	public static void main(String[] args) { new Exe001().go(args); }

	private void go(String[] args) {
		System.out.println(new ClassAAA());
	}

}
