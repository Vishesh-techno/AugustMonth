public class OneAugust {
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < command.length()) {
            if(command.charAt(i) == 'G') {
                sb.append('G');
                i++;
            } else {
                if(command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i += 2;
                } else {
                    sb.append("al");
                    i += 4;
                }
            }
        }
        return sb.toString();
        // return command.replace("()", "o").replace("(al)", "al");
    }

    public static String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i = 0; i<indices.length; i++){
            res[indices[i]] = s.charAt(i);
        }
        String result = String.valueOf(res);
        return result;
    }
    public static void main(String[] args) {

    }
}
