public class FourthTask {
    public static void count(String str) {
        char[] c = str.toCharArray();
        int letters=0, spaces=0, numbers=0, other=0;
        for (int i=0; i<=c.length-1; i++) {
            if (Character.isLetter(c[i])) {
                letters++;
            } else if (Character.isSpaceChar(c[i])) {
                spaces++;
            } else if (Character.isDigit(c[i])) {
                numbers++;
            } else {
                other++;
            }
        }
        System.out.println("letters: " + letters + "\nspaces: " + spaces + "\nnumbers: " + numbers + "\nother: " + other);
    }
    public static void main(String[] args) {
    String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
    count(s);
    }
}
