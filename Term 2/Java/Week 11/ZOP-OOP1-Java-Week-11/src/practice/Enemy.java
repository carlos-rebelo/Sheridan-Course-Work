package practice;

public abstract class Enemy {
    protected String name;
    protected int goldDrop;
    protected int health;

    public Enemy(String name) {
        this.name = name;
    }

    public void attack(Player player, int damage){
        System.out.println(name+" has attacked "+player.getName()+" for "+damage+" damage!");
    }

}
