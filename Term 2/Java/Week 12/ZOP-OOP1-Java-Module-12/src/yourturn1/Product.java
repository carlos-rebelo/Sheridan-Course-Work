package yourturn1;

public class Product {
    private int id;
    private String name;
    private int requiredPoints;

    public Product(int id, String name, int requiredPoints) {
        this.id = id;
        this.name = name;
        this.requiredPoints = requiredPoints;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getRequiredPoints()
    {
        return requiredPoints;
    }

    @Override
    public String toString()
    {
        return "Product [id=" + id + ", name=" + name + ", requiredPoints=" + requiredPoints + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + requiredPoints;
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
        Product other = (Product) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (requiredPoints != other.requiredPoints)
            return false;
        return true;
    }

}