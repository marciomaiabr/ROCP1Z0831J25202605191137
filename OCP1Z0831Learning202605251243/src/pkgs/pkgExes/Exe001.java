package pkgs.pkgExes;

import java.time.LocalDate;

import pkgs.pkgA.ClassA;
import pkgs.pkgA.ClassAA;
import pkgs.pkgA.ClassAAA;
import pkgs.pkgA.ClassAB;
import pkgs.pkgA.ClassAC;
import pkgs.pkgA.ClassAD;

public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {

		var var = 7;
		System.out.println(var);
		var o = (LocalDate.now().getYear()==2027) ? new Exe001() : new Exception();
		System.out.println(o);
		//var numeros = {1,2,3};
		//int [] numeros = new int[]{1,2,3};
		//var numeros = {1,2,3};
		/*int [] numeros = {1,2,3};
		System.out.println(numeros);*/
		System.out.println(new int[]{1,2,3});
		//var numeros = new int[]{1,2,3};

	}

	private void go5(String[] args) {

		int day = 1;

		String result = switch (day) {
		case 1 -> {
			System.out.println("Processing...");
			yield "Mon";
		}
		//case 2 -> { System.out.println("Processing..."); }//A switch labeled block in a switch expression must yield a value or throw an an exception
		/*case 3 -> {
			System.out.println("Processing...");
			//yield;//yield cannot be resolved
			yield//yield cannot be resolved
		}*/
		//case 4 -> yield "Mon";//Syntax error, insert ":" to complete SwitchLabel
		//case 5 : yield "Mon";//Mixing of '->' and ':' case statement styles is not allowed within a switch
		default -> "Other";
		};

		//switch antigo
		//nao pode ter um retorno local, pode ter o return do metodo no maximo
		/*result = switch (day) {
			default : "Other";
		};*/

		System.out.println(result);

		enum Status {
		    OPEN, CLOSED
		}

		Status status = Status.CLOSED;

		switch (status) {
			case OPEN : System.out.println("O");
	    	case Status.CLOSED : System.out.println("C");
		};

		String result3 = switch (status) {
		    case Status.OPEN -> "O";
		    case Status.CLOSED -> "C";
		};

		System.out.println(result3);

	}

	private void go4(String[] args) {

		ClassA ca = null;
		//ca = new ClassAA();
		int i = 1;
		Object integer = 1;

		/*//if novo
		if (integer instanceof int i2) {
		    System.out.println("aki1...");
		}*/

		//switch antigo
		/*switch(i) {
			default : System.out.println("d...");
			case 0: System.out.println("0...");
			case 1: System.out.println("1...");
			case 2: System.out.println("2...");
		}*/

		/*//switch antigo
		switch(i) {
			default : System.out.println("d...");
			case 0: System.out.println("0...");
			case 1: System.out.println("1...");
			case 2: System.out.println("2...");
		}*/

		/*//switch antigo
		switch(i) {
			default : System.out.println("d...");
			case int tpi: System.out.println("0...");//Unexpected type int, expected class or array type
		}*/

		/*//switch antigo
		switch(i) {
			default : System.out.println("d...");
			case int tpi: System.out.println("0...");
		}*/

		/*//switch antigo tbm permite case com Classe
		switch(ca) {
			case ClassAB cab : System.out.println("AB...");
			default : System.out.println("d...");
		}*/

		/*//switch novo
		switch(ca) {
			//default -> System.out.println("d...");//ocorre na linha debaixo por causa desta linha//This case label is dominated by one of the preceding case labels
			//case ClassAB cab : System.out.println("AB...");//Mixing of '->' and ':' case statement styles is not allowed within a switch
			case ClassAB cab -> System.out.println("AB...");
			case null -> System.out.println("N...");//sem este case dispara NullPointerException qdo nulo
			case ClassAC cac -> System.out.println("AC...");
			default -> System.out.println("d...");
		}*/

		//switch novo
		/*switch(integer) {
			case int tpi -> System.out.println("tpi...");
			case Integer tci -> System.out.println("tci...");
			case String tcs -> System.out.println("tcs...");
			default -> System.out.println("d...");
		}

		//switch novo
		switch(integer) {
		case Integer tci -> System.out.println("tci...");
			case int tpi -> System.out.println("tpi...");
			default -> System.out.println("d...");
		}*/

		/*//switch novo
		switch(i) {
			case int tpi -> System.out.println("tpi...");
			//case String tcs -> System.out.println("tcs...");//Type mismatch: cannot convert from int to String
			case Integer tci -> System.out.println("tci...");
			//default -> System.out.println("d...");//Switch case cannot have both unconditional pattern and default label
		}

		//switch novo
		switch(i) {
			case Integer tci -> System.out.println("tci...");
			//case String tcs -> System.out.println("tcs...");//Type mismatch: cannot convert from int to String
			case short tps -> System.out.println("tps...");
			case int tpi -> System.out.println("tpi...");
			//case short tps -> System.out.println("tps...");//This case label is dominated by one of the preceding case labels
			//default -> System.out.println("d...");//Switch case cannot have both unconditional pattern and default label
		}*/

		//switch novo
		switch(i) {
			case short tps -> System.out.println("tps...");
			case int tpi -> System.out.println("tpi...");
		}

		i = 100000;
		//switch novo
		switch(i) {
			case short tps -> System.out.println("tps...");
			case int tpi -> System.out.println("tpi...");
		}

		//switch novo
		switch(i) {
			//case 5 -> System.out.println("5...");break;//Syntax error on token "->", : expected
			default -> System.out.println("d...");
		}

	}

	private void go3(String[] args) {

		int i = 5;

		switch (i) {
			case 2: System.out.println("2...");
			//case 1: return "1...";//Void methods cannot return a value
		}

		switch (i) {
			case 2 -> System.out.println("2...");
			//case 1: System.out.println("1...");//Mixing of '->' and ':' case statement styles is not allowed within a switch
		}

		String s = switch (i) {
			case 1 -> {yield "1...";}
			//case 2 -> {return "2...";}//Void methods cannot return a value
			case 3 -> {yield "3...";}
			case 4 -> {yield "4...";}
		    default -> "d";
		};

		System.out.println(s);

		class ClassA {

			public String m() {
				int j = 5;

				switch (j) {
					case 2: System.out.println("2...");
					case 1: return "1...";
				}

				switch (j) {
					case 2 -> System.out.println("2...");
					//case 1: System.out.println("1...");//Mixing of '->' and ':' case statement styles is not allowed within a switch
				}

				String s = switch (j) {
					case 1 -> {yield "1...";}
					//case 2 -> {return "2...";}//Return within switch expressions not permitted
					case 3 -> {yield "3...";}
					case 4 -> {yield "4...";}
				    default -> "d";
				};

				switch (j) {
					case 1 -> {System.out.println("1...");}
					case 2 -> {return "2...";}
					case 3 -> System.out.println("3...");
				};

				System.out.println(s);
				return "";
			}

		}

	}

	private void go2(String[] args) {
		String s = "qqc";
		if(s instanceof String s2)
			System.out.println("[s2="+(s2)+"]");

		record RecordA(int x, int y) {}
		//record RecordA(int x, int y, int z) {}//Duplicate nested type RecordA
		//record RecordA(int x) {}//Duplicate nested type RecordA
		Object o = new RecordA(5,10);
		var ra = new RecordA(5,10);
		//if(ra instanceof RecordA(int x, int y) r2) System.out.println("[x="+(x)+"]"+"[y="+(y)+"]"+"[r2="+(r2)+"]");//Syntax error on token "r2", delete this token
		//if(ra instanceof RecordA r2) System.out.println("[x="+(x)+"]"+"[y="+(y)+"]"+"[r2="+(r2)+"]");//x cannot be resolved to a variable	//y cannot be resolved to a variable
		if(ra instanceof RecordA r2) System.out.println("[r2.x="+(r2.x)+"]"+"[r2.y="+(r2.y)+"]"+"[r2="+(r2)+"]");
		if(o instanceof RecordA) {
			//RecordA r2 = o;//Type mismatch: cannot convert from Object to RecordA
			RecordA r2 = (RecordA) o;
			System.out.println("[r2.x="+(r2.x)+"]"+"[r2.y="+(r2.y)+"]"+"[r2="+(r2)+"]");
		}
		if(ra instanceof RecordA) {
			RecordA r2 = ra;
			System.out.println("[r2.x="+(r2.x)+"]"+"[r2.y="+(r2.y)+"]"+"[r2="+(r2)+"]");
		}
	}

	private void go1(String[] args) {
		ClassA ca = null;
		int i = switch (ca) {
		case ClassAAA aaa -> 11;
		case ClassAA aa -> 1;
		case ClassAB ab -> 2;
		case ClassAD ad -> 33;
		case ClassAC ac -> 3;
		// case Object o -> 3;
		// case ClassA a -> 9;
		default -> 10;
		};

		System.out.println(i);

	}

}
