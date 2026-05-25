
public class PClassNotPackage {
	public static String s = "vPClassNotPackage";
	public static void main(String[] args) {
		System.out.println("PClassNotPackage...");
		System.out.println(pkgs.pkgB.ClassBA.s);
		System.out.println(pkgs.pkgB.ClassBB.s);
		System.out.println(PPClassNotPackage.s);
	}
}
