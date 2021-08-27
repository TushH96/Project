

public class Phone {
	String mob;
	String ll;

	Phone(String mob, String ll) {
		this.mob = mob;
		this.ll = ll;
	}

	@Override
	public String toString() {
		return "Phone [mob=" + mob + ", ll=" + ll + "]";
	}

}
