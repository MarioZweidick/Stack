package stack;

public class Stack<T>
{
    private int counter;
    private T[] array;
    /*
    * private --> nur innerhalb der Klasse
    * public --> von überall  aufrufbar
    * nichts -->  package protected. Nur innerhalb des packages*/

    public Stack(T[] array)
    {
        this.array = array;
        counter = 0;

    }

    public void push(T value)
    {
        if(counter >= array.length)
            System.out.println("Stack is full. It already has " + array.length + " elements!") ;

        array[counter] = value;
        counter++;
    }

    public T pop ()
    {
        if(counter <= 0)
            return null;

        counter--;
        return array[counter];
    }
}
