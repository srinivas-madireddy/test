package Animal;

public class ZooKeeper {

	public static void main(String[] args) {
		VetDoc v=new VetDoc();
		Wolf w=new Wolf();
		Canine c=new Canine();
		Dog d=new Dog();
		v.checkUpAnimal(d);
		v.checkUpAnimal(w);
		v.checkUpAnimal(c);
		
		}

}
