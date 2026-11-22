package com.pattern.creational.createStack;

public class StackAlgo {

    public static void main(){

        Stack<String> st = new Stack<>();
        st.push("ab");
        st.push("bc");
        st.push("cd");
        IO.println(st.toString());
    }
}
