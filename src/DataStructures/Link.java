package DataStructures;

public class Link {


    public int value;
    public Link next;
    public Link Previous;

    public Link(int value, Link next) {
        // Initialize class attributes

        this.value = value;
        this.next = next;
    }

    public Link(int value) {
        // Shortcut to create a new Link with next set to null.
        // Remember to reuse code whenever possible (rather than copy pasting)!

        this(value, null);
    }
}
