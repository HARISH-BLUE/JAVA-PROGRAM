import java.util.Stack;
public class prefixevalution {
    public static void main(String[] args){
        String exp="+9*26";
        Stack<Integer>stack=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }else{
                int a=stack.pop();
                int b=stack.pop();
                switch(ch){
                    case'+':stack.push(a+b);
                    break;
                    case'-':stack.push(a-b);
                    break;
                    case'*':stack.push(a*b);
                    break;
                    case'/':stack.push(a/b);
                    break;
                }
            }
        }System.out.println("result:"+stack.pop());
    }
}
