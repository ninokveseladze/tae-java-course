/*@author ნინო კვესელაძე*/
package homework5;

public class VowelCounter { public static int countVowels(String Name) {

    int count = 0;

    for (int i = 0; i < Name.length(); i++) {

        char letter = Character.toLowerCase(Name.charAt(i));

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                count++;
                break;
        }
    }

    return count;
}

    public static void main(String[] args) {

        String fullName = "Nino";

        System.out.println(countVowels(fullName));
    }

}
