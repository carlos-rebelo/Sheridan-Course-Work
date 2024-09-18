package arraylists;

public class Person {
    public String name;
    private int govtIDNumber;

    public Person(String name, int govtIDNumber) {
        this.name = name;
        this.govtIDNumber = govtIDNumber;

    }

    @Override
    public String toString()
    {
        return "Person [name=" + name + ", govtIDNumber = " + govtIDNumber + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + govtIDNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (govtIDNumber != other.govtIDNumber)
            return false;
        return true;
    }

    ///hmmmm....why didn't the contains work with our ArrayList - something doesn't seem EQUAL to the challenge?

}
