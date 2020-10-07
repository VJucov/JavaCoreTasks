public class SecondTask {
    public static String reverseString(String str){
        char[] strArray = str.toCharArray();
        int i = 0;
        int j = strArray.length - 1;
        while (j > i) {
            char temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
            i++;
            j--;
        }
        return new String(strArray);
    }
    public static void main(String[] args) {
        String s = "The quick brown fox";
        System.out.println(reverseString(s));
    }
}
