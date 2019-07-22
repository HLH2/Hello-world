public class Test_Animal {
	public static void main(String[] args) {
		Cat c = new Cat("blue",4);
        System.out.println(c.getColor() + "..." + c.getLeg());
        c.eat();
        c.catchMouse();
        System.out.println("-----");
        Dog d = new Dog("red",4);
        System.out.println(d.getColor() + "..." + d.getLeg());
        d.eat();
        d.lookhome();
	}
}

class Animal {
    private String color;
    private int leg;
    
    public Animal() {};
    
    public Animal(String color,int leg) {
        this.color = color;
        this.leg = leg;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    public int getLeg() {
        return leg;
    }
    
    public void eat() {
        System.out.println("≥‘∑π");
    }
}

class Cat extends Animal {
    public Cat() {}
    
    public Cat(String color,int leg) {
        super(color,leg);
    }
    
    public void eat() {
        System.out.println("√®≥‘”„");
    }
    
    public void catchMouse() {
        System.out.println("◊•¿œ Û");
    }
}

class Dog extends Animal {
    public Dog() {}
    
    public Dog(String color,int leg) {
        super(color,leg);
    }
    
    public void eat() {
        System.out.println("π∑≥‘»‚");
    }
    
    public void lookhome() {
        System.out.println("ø¥º“");
    }
}