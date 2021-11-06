package stack;

public class Stack
{
    private int counter;
    private int[] array;
    /*
    * private --> nur innerhalb der Klasse
    * public --> von überall  aufrufbar
    * nichts -->  package protected. Nur innerhalb des packages*/

    public Stack(int[] array)
    {
        this.array = array;
        counter = 0;

    }

    public void push (int value)
    {
        if(counter >= array.length)
            System.out.println("Stack is full. It already has " + array.length + " elements!") ;

        array[counter] = value;
        counter++;
    }

    public int pop ()
    {
        if(counter <= 0)
            return -1;

        counter--;
        return array[counter];
    }
}
