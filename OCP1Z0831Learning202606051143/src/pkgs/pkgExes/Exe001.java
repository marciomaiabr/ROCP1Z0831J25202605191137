package pkgs.pkgExes;

class ClassA {
	static StringBuilder sb1 = new StringBuilder("sb1ClassA");
	static StringBuilder sb2 = new StringBuilder("sb2ClassA");
	static void m1() { System.out.println("[ClassA][m1()]"); }
	static void m2() { System.out.println("[ClassA][m2()]"); }
}

class ClassAA extends ClassA {
	static StringBuilder sb2 = new StringBuilder("sb2ClassAA");
	static StringBuilder sb3 = new StringBuilder("sb3ClassAA");
	static void m2() { System.out.println("[ClassAA][m2()]"); }
	static void m3() { System.out.println("[ClassAA][m3()]"); }
}

class ClassAAA extends ClassAA { }

interface InterfaceB { public static void m1() { System.out.println("[InterfaceB][m1()][1]"); } }

class ClassB implements InterfaceB {}

public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {
		System.out.println("[ClassA.sb1="+(ClassA.sb1)+"]");
		System.out.println("[ClassA.sb2="+(ClassA.sb2)+"]");
		System.out.println("[new ClassA().sb1="+(new ClassA().sb1)+"]");
		System.out.println("[new ClassA().sb2="+(new ClassA().sb2)+"]");
		System.out.println("[ClassAA.sb1="+(ClassAA.sb1)+"]");
		System.out.println("[ClassAA.sb2="+(ClassAA.sb2)+"]");
		System.out.println("[ClassAA.sb3="+(ClassAA.sb3)+"]");
		System.out.println("[new ClassAA().sb1="+(new ClassAA().sb1)+"]");
		System.out.println("[new ClassAA().sb2="+(new ClassAA().sb2)+"]");
		System.out.println("[new ClassAA().sb3="+(new ClassAA().sb3)+"]");
		System.out.println("[((ClassA) new ClassAA()).sb1="+(((ClassA) new ClassAA()).sb1)+"]");
		System.out.println("[((ClassA) new ClassAA()).sb2="+(((ClassA) new ClassAA()).sb2)+"]");

		System.out.println();
		System.out.println("ClassA");
		ClassA.m1();
		ClassA.m2();

		System.out.println("ClassAA");
		ClassAA.m1();
		ClassAA.m2();
		ClassAA.m3();

		System.out.println("ClassAAA");
		ClassAAA.m1();
		ClassAAA.m2();
		ClassAAA.m3();

		System.out.println("InterfaceB");
		InterfaceB.m1();
		InterfaceB i1 = null;
		//i1.m1();//This static method of interface InterfaceB can only be accessed as InterfaceB.m1
		InterfaceB i2 = new InterfaceB() {
			public static void m1() { System.out.println("[InterfaceB][m1()][2]"); }
			public static void m2() { System.out.println("[InterfaceB][m2()][3]"); }
		};
		//i2.m1();//This static method of interface InterfaceB can only be accessed as InterfaceB.m1
		//i2.m2();//The method m2() is undefined for the type InterfaceB
		var v2 = new InterfaceB() {
			public static void m2() { System.out.println("[InterfaceB][m2()][4]"); }
		};
		//v2.m1();//The method m1() is undefined for the type new InterfaceB(){}
		v2.m2();
		var v3 = new InterfaceB() {
			public static void m1() { System.out.println("[InterfaceB][m1()][5]"); }
			public static void m2() { System.out.println("[InterfaceB][m2()][6]"); }
		};
		v3.m1();
		v3.m2();

		System.out.println("ClassB");
		//ClassB.m1();//The method m1() is undefined for the type ClassB

	}

}
