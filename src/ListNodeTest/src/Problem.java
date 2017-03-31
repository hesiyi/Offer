import java.util.Stack;

/**
 * Created by 49005 on 2017/3/3.
 * 两个栈实现一个队列
 */
public class Problem<T> {
    private Stack<T> stack1=new Stack<T>();
    private Stack<T> stack2=new Stack<T>();

    public void appendTail(T t){
        stack1.push(t);
    }
    public T delectHead() throws Exception{
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("队列为空，不能删除");
        }
        return stack2.pop();
    }
    public static void main(String[] args) throws Exception{
        Problem<String> p=new Problem<>();
        p.appendTail("1");
        p.appendTail("2");
        p.appendTail("3");
        p.delectHead();
    }
}
