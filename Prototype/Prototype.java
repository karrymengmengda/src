package Prototype;

public abstract class Prototype {
	private String id;
	public Prototype() {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public abstract Prototype Clone();
}
