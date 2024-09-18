package javatopiacomplete;

public class Mouse implements BreadEventListener {

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void handleBreadEvent(EventObject breadEventObject)
    {
        System.out.println("    - " + name + ", the mouse, has received a Bread Event runs to the baker to eat the crumbs");
    }
}
