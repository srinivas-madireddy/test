package Animal;

public class TestAnimal {

	public static void main(String[] args)  {
		
		Animal a[]=new Animal[4];
		a[0]=new Animal();
		a[1]=new Canine();
		a[2]=new Wolf();
		a[3]=new Dog();
		for(int i=0;i<a.length;i++) {
			a[i].sleep();
			a[i].roam();
			a[i].eat();
		}
		

	}

}
