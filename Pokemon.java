import java.util.Scanner;
class Pokemon{
    private String name;
    public int level;
    public int hp;
    public int attack;
    public static int counts = 0;
    
    Scanner scn  = new Scanner(System.in);


    public Pokemon(){
        setPokemon();
        counts++;
    }

    public void setPokemon(){
        System.out.println("Pokemon name:");
        String newname = scn.nextLine();
        this.name = newname;

        System.out.println("Pokemon level:");
        int newlevel = scn.nextInt();
        this.level = newlevel;

        System.out.println("Pokemon hp:");
        int newhp = scn.nextInt();
        this.hp = newhp;

        System.out.println("Pokemon attack:");
        int newattack = scn.nextInt();
        this.attack = newattack;
    }

    public String getName(){
        return name;

    }

    public void upLevel(){
        this.level++;
    }
    public void rename(String newname){
        this.name = newname;
    }


    public void showinfo(){
        System.out.println("name:" + name);
        System.out.println("level:" + level);
        System.out.println("hp:" + hp);
        System.out.println("attack:" + attack);
        System.out.println();
    }

}