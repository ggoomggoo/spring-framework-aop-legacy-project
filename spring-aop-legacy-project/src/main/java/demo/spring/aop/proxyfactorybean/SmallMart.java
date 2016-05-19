package demo.spring.aop.proxyfactorybean;

public class SmallMart implements SmallMartInterface {

	@Override
	public void getProjects(String projectName) {
		System.out.println("getProjects");
	}

	@Override
	public void getProjects2(String projectName) {
		System.out.println("getProjects2");
	}

}
