public class List {
    Node first = null;
    public List()
    {
        Node first = null;
    }
    public void add(Node node)
    {
        int key = node.getKey();
        Node prev = null;
        Node temp = first;
        while (temp != null && temp.data < key)
        {
            prev = temp;
            temp = temp.next;
        }
        if (prev == null)
            first = node;
        else
            prev.next = node;
        node.next = temp;
    }
    public void delete(int key)
    {
        Node prev = null;
        Node temp = first;
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }
        if (prev == null)
            first = first.next;
        else
            prev = prev.next.next;
    }
    public Node find(int key)
    {
        Node temp = first;
        while (temp != null && temp.data <= key)
        {
            if (temp.data == key)
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public void print()
    {
        Node temp = first;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
}
