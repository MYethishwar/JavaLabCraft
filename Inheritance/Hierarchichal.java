class SuperHero {
	String name;
	String power;
	public SuperHero(String name, String power) {
		this.name = name;
		this.power = power;
	}
	public void usePower() {
		System.out.println(name + " users " + power);
	}
}

class IronMan extends SuperHero {
	public IronMan(String name) {
		super(name, " advanced technoloogy ");
	}
}

class SpiderMan extends SuperHero {
	public SpiderMan(String name) {
		super(name, "Web-slinging ans spuider-like abilities");

	}
}

public class Hierarchichal {
	public static void main(String[] args) {
		IronMan ironMan = new IronMan(" Iron man ");
		SpiderMan spiderMan = new SpiderMan("Spider man");

		ironMan.usePower();
		spiderMan.usePower();
	}
}