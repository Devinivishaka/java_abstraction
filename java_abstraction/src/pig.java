public class pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The pid says wee wee");
    }

    public static void main (String[] args){
        pig mypig = new pig();
        mypig.animalSound();
        mypig.sleep();
    }
}
