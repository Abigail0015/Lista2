package uaslp.ingenieria.labs.List;

class Node
{
    int Data;
    Node next;
    Node previous;

    Node(int i)
    {
        Data = i;
    }

    public int getData()
    {
        return Data;
    }

    public void setDate(int date)
    {
        Data = date;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getPrevious()
    {
        return previous;
    }

    public void setPrevious(Node previous)
    {
        this.previous = previous;
    }


}
