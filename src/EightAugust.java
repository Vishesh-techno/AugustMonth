public class EightAugust {
    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                result.append("[.]");
            } else {
                result.append(ch);
            }
        }
        return result.toString();
        // return address.replace(".","[.]");
    }

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

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                sb.append((char)(ch+32));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
        // return s.toLowerCase();
    }

    public static void main(String[] args) {
        String str = "1.1.1.1";

        String goal = "G()(al)";

        String str1 = "codeleet";

        int[] arr = {4,5,6,7,0,2,1,3};

        System.out.println(defangIPaddr(str));

        System.out.println(interpret(goal));

       restoreString(str1, arr);

       toLowerCase(str1);



    }
}
