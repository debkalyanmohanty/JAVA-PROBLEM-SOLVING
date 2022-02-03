package problemsolving;

public class VowelsConsonantsAndWhiteSpacesInAString {
    public static void main(String[] args) {
        String str="I AM CR 7";

str=str.toLowerCase();
        int vowel=0;
        int consonant=0;
        int whitespace=0;
        int digit=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
                ++vowel;
            }
            else if (ch>='a'&&ch<='z'){
                ++consonant;
            }
            else if (ch==' '){
                ++whitespace;
            }
            else if (ch >= '0' && ch <= '9') {
                ++digit;
            }
        }
        System.out.println("THE NUMBERS VOWELS ARE "+vowel);
        System.out.println("THE NUMBERS CONSONANTS ARE "+consonant);
        System.out.println("THE NUMBERS WHITESPACES ARE "+whitespace);
        System.out.println("THE NUMBERS DIGITS  ARE "+digit);

    }
}
