package practicinginheritance;

public class Employee extends Person{
	int income;
		//here super() calls the parent class constructor and super() is the first statement in constructor
		@Override
	public void display() {
		//System.out.println("nameis:"+name);//here name and age is inherited from parent class person
		//System.out.println("age is:"+age);
			super.display();
		System.out.println("income is:"+income);
	}

}
