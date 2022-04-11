package restservices.helloworld.test;

public class Danger {
Message message = new Message();
public void test() {
	message.setName(null);
}
public String test2() {
	return "hello danger";
}
}
