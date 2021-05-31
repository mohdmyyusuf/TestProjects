package SP;

public class BuilderTest {

	private int x;
	String s;

	BuilderTest(int a, String b) {

		x = a;
		s = b;
	}

	public static class Builder {
		private int x;
		private String s;

		public Builder x(int x) {
			this.x = x;
			return this;
		}

		public Builder s(String s) {
			this.s = s; 
			return this;
		}

		public BuilderTest build() {
			return new BuilderTest(this);
		}
	}

	private BuilderTest(Builder builder) {
		this.x = builder.x;
		this.s = builder.s;
	}
}
