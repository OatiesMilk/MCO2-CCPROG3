public class MainApplication {
    public static void main(String[] args) throws Exception {
        // creating the starter creatures
        Creatures.owned_creatures_list.add(new Creatures("Strawander", "Fire", "A", 1, 2));
        Creatures.owned_creatures_list.add(new Creatures("Squirpie", "Water", "G", 1, 2));
        Creatures.owned_creatures_list.add(new Creatures("Brownisaur", "Grass", "D", 1, 2));
        Creatures.owned_creatures_list.add(new Creatures("Candaros", "Fire", "B", 3, 2));
        
        // adding creatures to my creatures_list
        Creatures.creatures_list.add(new Creatures("Strawander", "Fire", "A", 1, 1));
        Creatures.creatures_list.add(new Creatures("Straweleon", "Fire", "A", 2, 1));
        Creatures.creatures_list.add(new Creatures("Strawizard", "Fire", "A", 3, 1));
        
        Creatures.creatures_list.add(new Creatures("Chocowool", "Fire", "B", 1, 1));
        Creatures.creatures_list.add(new Creatures("Chocofluff", "Fire", "B", 2, 1));
        Creatures.creatures_list.add(new Creatures("Candaros", "Fire", "B", 3, 1));
        
        Creatures.creatures_list.add(new Creatures("Parfwit", "Fire", "C", 1, 1));
        Creatures.creatures_list.add(new Creatures("Parfure", "Fire", "C", 2, 1));
        Creatures.creatures_list.add(new Creatures("Parfelure", "Fire", "C", 3, 1));
        
        Creatures.creatures_list.add(new Creatures("Brownisaur", "Grass", "D", 1, 1));
        Creatures.creatures_list.add(new Creatures("Chocosaur", "Grass", "D", 2, 1));
        Creatures.creatures_list.add(new Creatures("Fudgasaur", "Grass", "D", 3, 1));
        
        Creatures.creatures_list.add(new Creatures("Frubat", "Grass", "E", 1, 1));
        Creatures.creatures_list.add(new Creatures("Golberry", "Grass", "E", 2, 1));
        Creatures.creatures_list.add(new Creatures("Croberry", "Grass", "E", 3, 1));
        
        Creatures.creatures_list.add(new Creatures("Malts", "Grass", "F", 1, 1));
        Creatures.creatures_list.add(new Creatures("Kirlicake", "Grass", "F", 2, 1));
        Creatures.creatures_list.add(new Creatures("Velvevoir", "Grass", "F", 3, 1));
        
        Creatures.creatures_list.add(new Creatures("Squirpie", "Water", "G", 1, 1));
        Creatures.creatures_list.add(new Creatures("Tartortle", "Water", "G", 2, 1));
        Creatures.creatures_list.add(new Creatures("Piestoise", "Water", "G", 3, 1));
        
        Creatures.creatures_list.add(new Creatures("Chocolite", "Water", "H", 1, 1));
        Creatures.creatures_list.add(new Creatures("Chocolish", "Water", "H", 2, 1));
        Creatures.creatures_list.add(new Creatures("Icesundae", "Water", "H", 3, 1));
        
        Creatures.creatures_list.add(new Creatures("Oshacone", "Water", "I", 1, 1));
        Creatures.creatures_list.add(new Creatures("Dewice", "Water", "I", 2, 1));
        Creatures.creatures_list.add(new Creatures("Samurcone", "Water", "I", 3, 1));
        
        // setting the a default active creature
        Creatures.owned_creatures_list.get(0).activeCreature = true;
        new MainMenu();
    }
}