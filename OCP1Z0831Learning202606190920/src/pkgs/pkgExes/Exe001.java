package pkgs.pkgExes;

class ClassA {
	static String ss = "ClassAStaticString";
	String is = "ClassAInstanceString";
	void isetSs(String p) { ss = p; }
	String igetSs() { return ss; }
	void isetIs(String p) { is = p; }
	String igetIs() { return is; }
	static void ssetSs(String p) { ss = p; }
	static String sgetSs() { return ss; }
}

class ClassAA extends ClassA {
	static String ss = "ClassAAStaticString";
	String is = "ClassAAInstanceString";
	void isetSs(String p) { ss = p; }
	String igetSs() { return ss; }
	void isetIs(String p) { is = p; }
	String igetIs() { return is; }
	static void ssetSs(String p) { ss = p; }
	static String sgetSs() { return ss; }
}

public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {
		final ClassAA caa_caa = new ClassAA();
		final ClassA ca_caa = caa_caa;
		final ClassA ca_ca = new ClassA();

		System.out.println();
		System.out.println("[caa_caa.ss="+(caa_caa.ss)+"]");
		System.out.println("[ca_caa.ss="+(ca_caa.ss)+"]");
		System.out.println("[ca_ca.ss="+(ca_ca.ss)+"]");
		System.out.println("[caa_caa.is="+(caa_caa.is)+"]");
		System.out.println("[ca_caa.is="+(ca_caa.is)+"]");
		System.out.println("[ca_ca.is="+(ca_ca.is)+"]");
		System.out.println("[caa_caa.igetSs()="+(caa_caa.igetSs())+"]");
		System.out.println("[ca_caa.igetSs()="+(ca_caa.igetSs())+"]");
		System.out.println("[ca_ca.igetSs()="+(ca_ca.igetSs())+"]");
		System.out.println("[caa_caa.igetIs()="+(caa_caa.igetIs())+"]");
		System.out.println("[ca_caa.igetIs()="+(ca_caa.igetIs())+"]");
		System.out.println("[ca_ca.igetIs()="+(ca_ca.igetIs())+"]");
		System.out.println("[caa_caa.sgetSs()="+(caa_caa.sgetSs())+"]");
		System.out.println("[ca_caa.sgetSs()="+(ca_caa.sgetSs())+"]");
		System.out.println("[ca_ca.sgetSs()="+(ca_ca.sgetSs())+"]");

		System.out.println();
		caa_caa.ss = "v1";
		ca_caa.ss = "v2";
		ca_ca.ss = "v3";
		caa_caa.is = "v4";
		ca_caa.is = "v5";
		ca_ca.is = "v6";
		System.out.println("[caa_caa.ss="+(caa_caa.ss)+"]");
		System.out.println("[ca_caa.ss="+(ca_caa.ss)+"]");
		System.out.println("[ca_ca.ss="+(ca_ca.ss)+"]");
		System.out.println("[caa_caa.is="+(caa_caa.is)+"]");
		System.out.println("[ca_caa.is="+(ca_caa.is)+"]");
		System.out.println("[ca_ca.is="+(ca_ca.is)+"]");
		System.out.println("[caa_caa.igetSs()="+(caa_caa.igetSs())+"]");
		System.out.println("[ca_caa.igetSs()="+(ca_caa.igetSs())+"]");
		System.out.println("[ca_ca.igetSs()="+(ca_ca.igetSs())+"]");
		System.out.println("[caa_caa.igetIs()="+(caa_caa.igetIs())+"]");
		System.out.println("[ca_caa.igetIs()="+(ca_caa.igetIs())+"]");
		System.out.println("[ca_ca.igetIs()="+(ca_ca.igetIs())+"]");
		System.out.println("[caa_caa.sgetSs()="+(caa_caa.sgetSs())+"]");
		System.out.println("[ca_caa.sgetSs()="+(ca_caa.sgetSs())+"]");
		System.out.println("[ca_ca.sgetSs()="+(ca_ca.sgetSs())+"]");

		System.out.println();
		caa_caa.isetSs("v7");
		ca_caa.isetSs("v8");
		ca_ca.isetSs("v9");
		caa_caa.isetIs("v10");
		ca_caa.isetIs("v11");
		ca_ca.isetIs("v12");
		System.out.println("[caa_caa.ss="+(caa_caa.ss)+"]");
		System.out.println("[ca_caa.ss="+(ca_caa.ss)+"]");
		System.out.println("[ca_ca.ss="+(ca_ca.ss)+"]");
		System.out.println("[caa_caa.is="+(caa_caa.is)+"]");
		System.out.println("[ca_caa.is="+(ca_caa.is)+"]");
		System.out.println("[ca_ca.is="+(ca_ca.is)+"]");
		System.out.println("[caa_caa.igetSs()="+(caa_caa.igetSs())+"]");
		System.out.println("[ca_caa.igetSs()="+(ca_caa.igetSs())+"]");
		System.out.println("[ca_ca.igetSs()="+(ca_ca.igetSs())+"]");
		System.out.println("[caa_caa.igetIs()="+(caa_caa.igetIs())+"]");
		System.out.println("[ca_caa.igetIs()="+(ca_caa.igetIs())+"]");
		System.out.println("[ca_ca.igetIs()="+(ca_ca.igetIs())+"]");
		System.out.println("[caa_caa.sgetSs()="+(caa_caa.sgetSs())+"]");
		System.out.println("[ca_caa.sgetSs()="+(ca_caa.sgetSs())+"]");
		System.out.println("[ca_ca.sgetSs()="+(ca_ca.sgetSs())+"]");

		System.out.println();
		caa_caa.ssetSs("v13");
		ca_caa.ssetSs("v14");
		ca_ca.ssetSs("v15");
		System.out.println("[caa_caa.ss="+(caa_caa.ss)+"]");
		System.out.println("[ca_caa.ss="+(ca_caa.ss)+"]");
		System.out.println("[ca_ca.ss="+(ca_ca.ss)+"]");
		System.out.println("[caa_caa.is="+(caa_caa.is)+"]");
		System.out.println("[ca_caa.is="+(ca_caa.is)+"]");
		System.out.println("[ca_ca.is="+(ca_ca.is)+"]");
		System.out.println("[caa_caa.igetSs()="+(caa_caa.igetSs())+"]");
		System.out.println("[ca_caa.igetSs()="+(ca_caa.igetSs())+"]");
		System.out.println("[ca_ca.igetSs()="+(ca_ca.igetSs())+"]");
		System.out.println("[caa_caa.igetIs()="+(caa_caa.igetIs())+"]");
		System.out.println("[ca_caa.igetIs()="+(ca_caa.igetIs())+"]");
		System.out.println("[ca_ca.igetIs()="+(ca_ca.igetIs())+"]");
		System.out.println("[caa_caa.sgetSs()="+(caa_caa.sgetSs())+"]");
		System.out.println("[ca_caa.sgetSs()="+(ca_caa.sgetSs())+"]");
		System.out.println("[ca_ca.sgetSs()="+(ca_ca.sgetSs())+"]");
	}

}
