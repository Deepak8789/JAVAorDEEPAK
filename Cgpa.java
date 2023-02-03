import javax.sound.sampled.SourceDataLine;

public class Cgpa {
    public static void main(String[] args) {
        int physics = 60;
        System.out.println("Physics Marks is "+physics);
        int chemistry = 70;
        System.out.println("Chemistry Marks is "+chemistry);
        int math = 60;
        System.out.println("Math Marks is "+math);

        int percent = physics + chemistry + math / 3;

        System.out.println(percent);
    }
}
