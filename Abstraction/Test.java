class Test{
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Birds and Dogs are both animals,");
        dog.living();
        bird.living();
        System.out.println("But dogs,");
        dog.sound();
        System.out.println("while birds,");
        bird.sound();

        
    }
}
