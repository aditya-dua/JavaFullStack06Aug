package inheritance.single;


public class SingleInheritanceMain {

	public static void main(String[] args) {
		
		Dog d = new Dog("BLACK", "HUNTING", false);
		d.display();
		
		try{
		d.wagTail();
		}catch(Exception e){
			e.printStackTrace();
		}
		d.move();
		
		Fish f = new Fish();
		f.wagTail();
		f.move();
		
		
		Animal a = new Dog();

		//a.wagTail();
		//a.move();
		
		Animal [] ani = new Animal[5];
		
		ani[0] = new Animal();
		
		ani[0] = d;
		
		ani[0].display();
		
		
		
	}
}
