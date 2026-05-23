package pkgs.pkgExes;

import pkgs.pkgA.Chave;
import pkgs.pkgRecords.RecordA;

public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {
		RecordA ra1 = new RecordA(new Chave(), "bananaA", 29.99);
		System.out.println(ra1.x);
		ra1.x = 10;
		System.out.println(ra1.x);
		RecordA ra2 = new RecordA(new Chave(), "bananaB", 29.99);
		ra2.x = 15;
		System.out.println(ra1.x);
		System.out.println(ra2.x);
	}

}
