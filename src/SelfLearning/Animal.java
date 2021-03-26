package SelfLearning;
 public class Animal {
        //methods and keywords
        public void eat() {
            System.out.println("I can eat");
        }
        public void sound() {
            System.out.println("Animal sound");
        }
        public void movement() {
            System.out.println("Animal movement");
        }
        private String name;
        public void setName(String name) {
            this.name = name;
        }
        public void getName() {
            System.out.println("My name is " + name);
        }
    }
    class Dog extends Animal {
        //methods and keywords of Animal
        //methods and keywords of Dog
        @Override
        public void sound() {
            System.out.println("Bark!! Bark!!!");
        }
        public void run() {
            System.out.println("I run fast");
        }
    }
    class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Meow! Meow...");
        }
    }
    class Fish extends Animal {
        @Override
        public void movement() {
            System.out.println("Just keep swimming :P");
        }
        @Override
        public void sound() {
            super.sound();
            System.out.println("nemo nemo");
        }
    }
    class main {
        public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.setName("anni");
//        animal.getName();
            Dog labrador = new Dog();
            //inheriting parent class method
            labrador.eat();
            labrador.setName("Chocolate");
            labrador.getName();
            labrador.sound();
            Fish nemo = new Fish();
            nemo.sound();
//        Cat fluffyCat = new Cat();
//        fluffyCat.sound();
            Animal pug = new Dog();
            pug.sound();
            Animal mew = new Cat();
            mew.sound();
            mew.eat();mew.getName();mew.setName("pluffy");mew.movement();mew.getName();
        }
    }

