package com.sVit;
// STACKS SETUP FOR PERSON OBJECT
public class PersonStack
{
    private Person [] stack;
    private int top;
    private int size;                   // this one over here

    public  PersonStack ()
    {
        top = -1;
        size = 50;
        stack = new Person [50];
    }

    public PersonStack(int size)
    {
        top = -1;
        this.size = size; // 'this.size refers to ^^^
        stack = new Person [this.size];
    }

    public boolean push(Person item)
    {
        if (!isFull())
        {
            top++;
            stack[top] = item;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFull()
    {
        return (top == stack.length -1);
    }

    public Person pop()
    {
        return stack[top--];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }
}



