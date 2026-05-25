
class PPClassNotPackage {
	public static String s = "vPPClassNotPackage";
	public static void main(String[] args) {
		System.out.println("PPClassNotPackage...");
		System.out.println(pkgs.pkgB.ClassBA.s);
		System.out.println(pkgs.pkgB.ClassBB.s);
		System.out.println(PClassNotPackage.s);
	}
}
