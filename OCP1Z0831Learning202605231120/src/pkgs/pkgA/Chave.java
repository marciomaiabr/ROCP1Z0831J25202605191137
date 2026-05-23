package pkgs.pkgA;

import java.util.UUID;

public final class Chave implements Comparable<Chave> {

	private UUID uuid = null;

	public Chave() {
		this.uuid = UUID.randomUUID();
	}

	@Override
	public String toString() {
		return "Chave=[uuid=" + (uuid) + "]";
	}

	@Override
	public int hashCode() {
		return uuid.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Chave) System.out.println("[Chave][equals(Object obj)]");
		return super.equals(obj);
	}

	@Override
	public int compareTo(Chave o) {
		System.out.println("[Chave][compareTo(Chave o)]");
		return this.uuid.compareTo(o.uuid);
	}

}
