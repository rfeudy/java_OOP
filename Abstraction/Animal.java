//The abstract Class is a parent class that cannot be instantiated
//To create a new object instantiated a child that inherites the methods


abstract class Animal{

    // Abstract Methods
    // Contains only the methods signature
    abstract void sound();
    abstract void eat();

    // Concrete Method
    // Contains method body and may be called by childern
    void living() {
        System.out.println("All animals are living things");
    }

}
