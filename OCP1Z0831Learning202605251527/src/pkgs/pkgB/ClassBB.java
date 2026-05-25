package pkgs.pkgB;

public class ClassBB {
	public static String s = "vClassBB";
	public static void main(String[] args) {
		System.out.println("ClassBB...");
		System.out.println(ClassBA.s);
		//System.out.println(PClassNotPackage.s);
		//System.out.println(PPClassNotPackage.s);
	}

}
