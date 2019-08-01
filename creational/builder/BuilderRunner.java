package creational.builder;

public class BuilderRunner {

	public static void main(String[] args) {
		LunchOrderBean.Builder builder=new LunchOrderBean.Builder();
		builder.bread("wheat").condiments("lettuce").meat("TUrkey");
		LunchOrderBean lunchOrderBean=builder.build();
		System.out.println(lunchOrderBean.getBread());
	}
}
