package pkgs.pkgExes;



public class Exe001 {



	public static void main(String[] args) {
		new Exe001().go(args);
	}

	private void go(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println("[m][1]");

		var tp2 = Thread.ofPlatform().name("tp2").start(
				()->{
					System.out.println("[tp2][1]");
					synchronized (o2) {
						System.out.println("[tp2][2]");
						try {
							Thread.sleep(1*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("[tp2][3]");
						synchronized (o1) {
							System.out.println("[tp1][4]");
							try {
								Thread.sleep(1*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("[tp2][5]");
						}
						System.out.println("[tp2][6]");
					}
					System.out.println("[tp2][7]");
				}
		);

		System.out.println("[m][2]");

		var vt1 = Thread.ofVirtual().name("vt1").start(
				()->{
					System.out.println("[vt1][1]");
					synchronized (o1) {
						System.out.println("[vt1][2]");
						try {
							Thread.sleep(1*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("[vt1][3]");
						synchronized (o2) {
							System.out.println("[vt1][4]");
							try {
								Thread.sleep(1*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("[vt1][5]");
						}
						System.out.println("[vt1][6]");
					}
					System.out.println("[vt1][7]");
				}
		);

		System.out.println("[m][3]");

		try {
			vt1.join();
			tp2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("[m][4]");

	}

	private void go4(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println("[m][1]");

		var vt1 = Thread.ofVirtual().name("vt1").start(
				()->{
					System.out.println("[vt1][1]");
					synchronized (o1) {
						System.out.println("[vt1][2]");
						try {
							Thread.sleep(1*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("[vt1][3]");
						synchronized (o2) {
							System.out.println("[vt1][4]");
							try {
								Thread.sleep(1*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("[vt1][5]");
						}
						System.out.println("[vt1][6]");
					}
					System.out.println("[vt1][7]");
				}
		);

		System.out.println("[m][2]");

		var tp2 = Thread.ofPlatform().name("tp2").start(
				()->{
					System.out.println("[tp2][1]");
					synchronized (o2) {
						System.out.println("[tp2][2]");
						try {
							Thread.sleep(1*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("[tp2][3]");
						synchronized (o1) {
							System.out.println("[tp1][4]");
							try {
								Thread.sleep(1*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("[tp2][5]");
						}
						System.out.println("[tp2][6]");
					}
					System.out.println("[tp2][7]");
				}
		);

		System.out.println("[m][3]");

		try {
			vt1.join();
			tp2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("[m][4]");

	}

	private void go3(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println("[m][1]");

		var vt1 = Thread.ofVirtual().name("vt1").start(
				()->{
					System.out.println("[vt1][1]");
					synchronized (o1) {
						System.out.println("[vt1][2]");
						try {
							Thread.sleep(1*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("[vt1][3]");
						synchronized (o2) {
							System.out.println("[vt1][4]");
							try {
								Thread.sleep(1*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("[vt1][5]");
						}
						System.out.println("[vt1][6]");
					}
					System.out.println("[vt1][7]");
				}
		);

		System.out.println("[m][2]");

		var vt2 = Thread.ofVirtual().name("vt2").start(
				()->{
					System.out.println("[vt2][1]");
					synchronized (o2) {
						System.out.println("[vt2][2]");
						try {
							Thread.sleep(1*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("[vt2][3]");
						synchronized (o1) {
							System.out.println("[vt1][4]");
							try {
								Thread.sleep(1*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("[vt2][5]");
						}
						System.out.println("[vt2][6]");
					}
					System.out.println("[vt2][7]");
				}
		);

		System.out.println("[m][3]");

		try {
			vt1.join();
			vt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("[m][4]");

	}

	private void go2(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println("[m][1]");

		var tp1 = Thread.ofPlatform().name("tp1").start(
				()->{
					System.out.println("[tp1][1]");
					synchronized (o1) {
						System.out.println("[tp1][2]");
						try {
							Thread.sleep(1*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("[tp1][3]");
						synchronized (o2) {
							System.out.println("[tp1][4]");
							try {
								Thread.sleep(1*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("[tp1][5]");
						}
						System.out.println("[tp1][6]");
					}
					System.out.println("[tp1][7]");
				}
		);

		System.out.println("[m][2]");

		var tp2 = Thread.ofPlatform().name("tp2").start(
				()->{
					System.out.println("[tp2][1]");
					synchronized (o2) {
						System.out.println("[tp2][2]");
						try {
							Thread.sleep(1*1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("[tp2][3]");
						synchronized (o1) {
							System.out.println("[tp1][4]");
							try {
								Thread.sleep(1*1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println("[tp2][5]");
						}
						System.out.println("[tp2][6]");
					}
					System.out.println("[tp2][7]");
				}
		);

		System.out.println("[m][3]");

		try {
			tp1.join();
			tp2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("[m][4]");

	}

	private void go1(String[] args) {
		System.out.println("[m][1]");
		var t1 = Thread.ofPlatform().name("tp1").start(
				()->{
					System.out.println("[="+("1")+"]");
					try {
						Thread.sleep(5*30*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("[="+("2")+"]");
				}
		);
		var t2 = Thread.ofPlatform().name("tp2").start(
				()->{
					System.out.println("[="+("3")+"]");
					try {
						Thread.sleep(5*30*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("[="+("4")+"]");
				}
		);
		var t3 = Thread.ofPlatform().name("tp3").start(
				()->{
					System.out.println("[="+("5")+"]");
					try {
						Thread.sleep(5*30*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("[="+("6")+"]");
				}
		);
		var t4 = Thread.ofVirtual().name("vt1").start(
				()->{
					System.out.println("[="+("7")+"]");
					try {
						Thread.sleep(5*30*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("[="+("8")+"]");
				}
		);
		var t5 = Thread.ofVirtual().name("vt2").start(
				()->{
					System.out.println("[="+("9")+"]");
					try {
						Thread.sleep(5*30*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("[="+("10")+"]");
				}
		);
		var t6 = Thread.ofVirtual().name("vt3").start(
				()->{
					System.out.println("[="+("11")+"]");
					try {
						Thread.sleep(5*30*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("[="+("12")+"]");
				}
		);
		System.out.println("[m][2]");
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("[m][3]");
	}

}
