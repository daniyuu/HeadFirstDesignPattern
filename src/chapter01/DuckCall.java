package chapter01;

public class DuckCall {
	QuackBehavior quackBehavior;
	
	public DuckCall(){
		quackBehavior = new Quack();
	}
	
	public void display(){
		quackBehavior.quack();
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
}
