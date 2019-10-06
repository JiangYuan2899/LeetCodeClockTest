package week06;

import java.util.*;
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class LeetCode155 {
	 // ����ջ
    private Stack<Integer> data;
    // ����ջ
    private Stack<Integer> helper;

    /**
     * initialize your data structure here.
     */
    public void MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    // ˼· 2������ջ������ջ��ͬ��
    // �ؼ� 1������ջ��Ԫ�ؿյ�ʱ�򣬱�������½�������
    // �ؼ� 2����������С�ڻ��ߵ��ڸ���ջջ��Ԫ�ص�ʱ�򣬲ŷ��루�ر�ע���������Ҫ���ǽ�ȥ��
    // �ؼ� 3����ջ��ʱ�򣬸���ջ��ջ��Ԫ�ص�������ջ��ջ��Ԫ�أ��ų�ջ����"��ջ����ͬ��"�Ϳ�����

    public void push(int x) {
        // ����ջ�ڱ�Ҫ��ʱ�������
        data.add(x);
        // �ؼ� 1 �� �ؼ� 2
        if (helper.isEmpty() || helper.peek() >= x) {
            helper.add(x);
        }
    }

    public void pop() {
        // �ؼ� 3��data һ���� pop()
        if (!data.isEmpty()) {
            // ע�⣺������ int ���ͣ�����������Զ����䣬�� Integer ת���� int���������ıȽϿ���ʹ�� "==" �����
            // �ο����ϣ�https://www.cnblogs.com/GuoYaxiang/p/6931264.html
            // ����� top ���������� Integer ���ͣ�����ıȽϾ͵�ʹ�� equals ����
            int top = data.pop();
            if(top == helper.peek()){
                helper.pop();
            }
        }
    }

    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }
        throw new RuntimeException("ջ��Ԫ��Ϊ�գ��˲����Ƿ�");
    }

    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException("ջ��Ԫ��Ϊ�գ��˲����Ƿ�");
    }
}



