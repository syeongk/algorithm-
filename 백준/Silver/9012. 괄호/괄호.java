

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++){
            String P = br.readLine();
            System.out.println(checkStack(P));
        }
    }

    private static String checkStack(String P) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<P.length(); i++) {
            if (P.charAt(i) == '(') {
                stack.push(P.charAt(i));
            } else if (P.charAt(i) == ')') {
                if (stack.empty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

