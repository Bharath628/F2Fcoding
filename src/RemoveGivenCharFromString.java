import java.util.Arrays;

public class RemoveGivenCharFromString {

    public static void main(String[] args) {
        String str = "Bharbbath";

        String charToRemove = "b";
        removeGivenChar(str,charToRemove);
        removeFirstChar(str,charToRemove);
        removeThirdOccurenceofChar(str,charToRemove);


    }

    private static void removeThirdOccurenceofChar(String str, String charToRemove) {
        String[] strArr = str.split("");
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(strArr[i].equalsIgnoreCase(charToRemove)) {
                count++;
                if(count == 3)
                    continue;
            }
            sb.append(strArr[i]);
        }

        System.out.println(sb.toString());
    }

    private static void removeFirstChar(String str, String charToRemove) {
        String[] strArr = str.split("");
        StringBuilder sb = new StringBuilder();
        boolean removedAlready = false;
        for(int i=0;i<str.length();i++){
            if(strArr[i].equalsIgnoreCase(charToRemove) && !removedAlready) {
                removedAlready = true;
                continue;
            }
            sb.append(strArr[i]);
        }

        System.out.println(sb.toString());
    }

    private static void removeGivenChar(String str,String charToRemove) {
        String[] strArr = str.split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(strArr[i].equalsIgnoreCase(charToRemove))
                continue;

            sb.append(strArr[i]);
        }

        System.out.println(sb.toString());
    }


}
