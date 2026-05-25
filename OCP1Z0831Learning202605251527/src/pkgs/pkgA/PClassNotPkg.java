
public class PClassNotPkg {
	public static String s = "vPClassNotPkg";
	public static void main(String[] args) {
		System.out.println("PClassNotPkg...");
		System.out.println(pkgs.pkgB.ClassBA.s);
		System.out.println(pkgs.pkgB.ClassBB.s);
		System.out.println(PClassNotPackage.s);
	}
}
