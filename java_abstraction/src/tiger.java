public class tiger implements Animal1 {
    public void animalsound(){
        System.out.println("The tiger sound is bruu bruu");

    }
    public void run(){
        System.out.println("Tiger run fast");
    }

    public static void main(String[] args){
        tiger mytiger = new tiger();
        mytiger.animalsound();
        mytiger.run();
        
    }

}
