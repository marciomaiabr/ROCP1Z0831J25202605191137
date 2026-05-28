
module mnModulo1m {
	//exports pkg1.pkg11.*;//error: <identifier> expected
	exports pkg1.pkg11.pkg111;
	exports pkg1.pkg11.pkg111.pkg1111;
}

/*

srcs\modulo1\module-info.java:2: warning: [module] module name component mnModulo1 should avoid terminal digits
module mnModulo1 {
       ^
1 warning

*/
