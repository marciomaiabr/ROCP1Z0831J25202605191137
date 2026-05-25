package pkgs.pkgB;

public class ClassBA {
	public static String s = "vClassBA";
	public static void main(String[] args) {
		System.out.println("ClassBA...");
		System.out.println(ClassBB.s);
		//System.out.println(PClassNotPackage.s);
		//System.out.println(PPClassNotPackage.s);
	}

}
