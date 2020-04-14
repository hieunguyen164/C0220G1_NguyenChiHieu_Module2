package b5_advancedobjectorienteddesign.thuchanh.interfaceedible;
public class TestAnimalAndFruit {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        System.out.println();
        Fruit []fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }


    }
}