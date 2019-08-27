public class StringTrim {
    public static void main (String[] args) {
        String str;
        String str2;

        str = ( "     Helloo   World   !" );
        str2 = str.trim();

        System.out.println("Original: " + str);
        System.out.println("Trimmed: " + str2);
    }
}