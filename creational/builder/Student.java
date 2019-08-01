package creational.builder;

public class Student {
	private final int id;
	private final String address;
	private final String name;

	public Student(Builder builder) {
		this.id = builder.id;
		this.address = builder.address;
		this.name = builder.name;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public static class Builder {
		private int id;
		private String address;
		private String name;

		public Builder() {
		}

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

}
