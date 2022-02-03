package problemsolving;

public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String a="I am Debkalyan";
        char ch ='a';
        int frequency=0;
        for (int i=0;i<a.length();i++){
            if (ch==a.charAt(i)){
                ++frequency;
            }
        }
        System.out.println("THE FREQUENCY OF THE CHARACTER IS " + frequency);
    }
}
