import java.util.ArrayList;
import java.util.Scanner;

public class MainPokemon{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList <Pokemon> PokemonList = new ArrayList<Pokemon>();
        String n;
        boolean contiune = true;
        while(contiune){
            String name;
            boolean bool;
            menu();
            n = scn.nextLine();
            System.out.println(n);
            switch (n) {
                case "1":
                    PokemonList.add(new Pokemon());
                    break;
                case "2":
                    System.out.println("Pokemon name:");
                    name = scn.nextLine();
                    bool = true;
                    for(int i=0;i<PokemonList.size();i++){
                        if(PokemonList.get(i).getName().equals(name)){
                            PokemonList.get(i).showinfo();
                            bool = false;
                        }
                    }
                    if(bool){
                        System.out.println("No Pokemon");
                    }
                    break;
                case "3":
                    System.out.println("Pokemon name:");
                    name = scn.nextLine();
                    bool = true;
                    for(int i=0;i<PokemonList.size();i++){
                        if(PokemonList.get(i).getName().equals(name)){
                            PokemonList.get(i).upLevel();
                            bool = false;
                        }
                    }
                    if(bool){
                        System.out.println("No Pokemon");
                    }
                    break;
                case "4":
                    System.out.println("Pokemon name:");
                    name = scn.nextLine();
                    System.out.println("Rename:");
                    String newname = scn.nextLine();
                    bool = true;
                    for(int i=0;i<PokemonList.size();i++){
                        if(PokemonList.get(i).getName().equals(name)){
                            PokemonList.get(i).rename(newname);
                            bool = false;
                        }
                    }
                    if(bool){
                        System.out.println("No Pokemon");
                    }
                    break;
                case "5":
                    for(int i=0;i<PokemonList.size();i++){
                        PokemonList.get(i).showinfo();
                    }
                    break;
                case "6":
                    contiune = false;
                    break;
                default:
                    System.out.println("ERROR!!!");
                    break;
            }
        }
    }
    public static void menu() {
        System.out.println("menu:");
        System.out.println("1: Add new pokemon");
        System.out.println("2: Search pokemon");
        System.out.println("3: Uplevel pokemon");
        System.out.println("4. Rename");
        System.out.println("5: Show pokemon list");
        System.out.println("6: End");
        System.out.print("operations:");
    }
}