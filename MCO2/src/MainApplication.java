public class MainApplication {
    public static void main(String[] args) throws Exception {
        // creating the starter creatures
        Creatures.owned_creatures_list.add(new Creatures("Strawander", "Fire", "Alpha", 1));
        Creatures.owned_creatures_list.add(new Creatures("Squirpie", "Water", "Golf", 1));
        Creatures.owned_creatures_list.add(new Creatures("Brownisaur", "Grass", "Delta", 1));
        
        // adding creatures to my creatures_list
        Creatures.creatures_list.add(new Creatures("Strawander", "Fire", "Alpha", 1));
        Creatures.creatures_list.add(new Creatures("Straweleon", "Fire", "Alpha", 2));
        Creatures.creatures_list.add(new Creatures("Strawizard", "Fire", "Alpha", 3));
        
        Creatures.creatures_list.add(new Creatures("Chocowool", "Fire", "Bravo", 1));
        Creatures.creatures_list.add(new Creatures("Chocofluff", "Fire", "Bravo", 2));
        Creatures.creatures_list.add(new Creatures("Candaros", "Fire", "Bravo", 3));
        
        Creatures.creatures_list.add(new Creatures("Parfwit", "Fire", "Charlie", 1));
        Creatures.creatures_list.add(new Creatures("Parfure", "Fire", "Charlie", 2));
        Creatures.creatures_list.add(new Creatures("Parfelure", "Fire", "Charlie", 3));
        
        Creatures.creatures_list.add(new Creatures("Brownisaur", "Grass", "Delta", 1));
        Creatures.creatures_list.add(new Creatures("Chocosaur", "Grass", "Delta", 2));
        Creatures.creatures_list.add(new Creatures("Fudgasaur", "Grass", "Delta", 3));
        
        Creatures.creatures_list.add(new Creatures("Frubat", "Grass", "Echo", 1));
        Creatures.creatures_list.add(new Creatures("Golberry", "Grass", "Echo", 2));
        Creatures.creatures_list.add(new Creatures("Croberry", "Grass", "Echo", 3));
        
        Creatures.creatures_list.add(new Creatures("Malts", "Grass", "Foxtrot", 1));
        Creatures.creatures_list.add(new Creatures("Kirlicake", "Grass", "Foxtrot", 2));
        Creatures.creatures_list.add(new Creatures("Velvevoir", "Grass", "Foxtrot", 3));
        
        Creatures.creatures_list.add(new Creatures("Squirpie", "Water", "Golf", 1));
        Creatures.creatures_list.add(new Creatures("Tartortle", "Water", "Golf", 2));
        Creatures.creatures_list.add(new Creatures("Piestoise", "Water", "Golf", 3));
        
        Creatures.creatures_list.add(new Creatures("Chocolite", "Water", "Hotel", 1));
        Creatures.creatures_list.add(new Creatures("Chocolish", "Water", "Hotel", 2));
        Creatures.creatures_list.add(new Creatures("Icesundae", "Water", "Hotel", 3));
        
        Creatures.creatures_list.add(new Creatures("Oshacone", "Water", "India", 1));
        Creatures.creatures_list.add(new Creatures("Dewice", "Water", "India", 2));
        Creatures.creatures_list.add(new Creatures("Samurcone", "Water", "India", 3));
        
        // setting the a default active creature
        Creatures.owned_creatures_list.get(0).activeCreature = true;
        new MainMenu();
    }
}