public class ProjectTest {
    public static void main(String[] args){
        System.out.println("is this thing on?");

        Project elevatorPitch = new Project("KittenMittens", "is your cat making TOO MUCH NOISE ALL OF THE TIME?? KITTEN MITTENS");
        Project something = new Project();
        Project onlyName = new Project("Just a name huh?");

        System.out.println(elevatorPitch.getProject());
        System.out.println(something.getProject());
        System.out.println(onlyName.getProject());
    }
}