/**
 * This class is for setting the information of my creatures
 */
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Creatures {
    /**
     * These are my variables
     */
    public static String grass_url = "src\\Images\\grassIcon.png";
    public static String water_url = "src\\Images\\waterIcon.png";
    public static String fire_url = "src\\Images\\fireIcon.png";
    
    public static ArrayList<Creatures> creatures_list = new ArrayList<>();
    public static ArrayList<Creatures> owned_creatures_list = new ArrayList<>();
    public String creatureName;
    public String creatureType;
    public String creatureFamily;
    public int creatureEL;
    public boolean activeCreature;
    public ImageIcon creaturePicture;
    public ImageIcon creatureTypePicture;
    public int creatureCount;
    
    /**
     * 
     * @param name
     * @param type
     * @param family
     * @param EL
     * @param count 
     * 
     * This is my constructor for creating creatures
     */
    public Creatures(String name, String type, String family, int EL, int count) {
        this.creatureName = name;
        this.creatureType = type;
        this.creatureFamily = family;
        this.creatureEL = EL;
        this.activeCreature = false;
        this.creatureCount = count;
        
        switch (name) {
            case "Strawander" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\strawander.png");
            case "Straweleon" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\straweleon.png");
            case "Strawizard" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\strawizard.png");
            
            case "Chocowool" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\chocowool.png");
            case "Chocofluff" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\chocofluff.png");
            case "Candaros" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\candaros.png");
            
            case "Parfwit" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\parfwit.png");
            case "Parfure" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\parfure.png");
            case "Parfelure" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\parfelure.png");
            
            case "Brownisaur" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\brownisaur.png");
            case "Chocosaur" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\chocosaur.png");
            case "Fudgasaur" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\fudgasaur.png");
            
            case "Frubat" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\frubat.png");
            case "Golberry" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\golberry.png");
            case "Croberry" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\croberry.png");
            
            case "Malts" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\malts.png");
            case "Kirlicake" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\kirlicake.png");
            case "Velvevoir" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\velvevoir.png");
            
            case "Squirpie" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\squirpie.png");
            case "Tartortle" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\tartortle.png");
            case "Piestoise" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\piestoise.png");
            
            case "Chocolite" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\chocolite.png");
            case "Chocolish" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\chocolish.png");
            case "Icesundae" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\icesundae.png");
            
            case "Oshacone" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\oshacone.png");
            case "Dewice" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\dewice.png");
            case "Samurcone" -> this.creaturePicture = new ImageIcon("src\\Images\\Pokemons\\samurcone.png");
        }
        
        switch (type) {
            case "Fire" -> this.creatureTypePicture = new ImageIcon(fire_url);
            case "Grass" -> this.creatureTypePicture = new ImageIcon(grass_url);
            case "Water" -> this.creatureTypePicture = new ImageIcon(water_url);  
        }
    }

    // setter for activeCreature
    public void setActiveCreature(boolean value) {
        this.activeCreature = value;
    }
    
    // getter and setter for creatureName
    public String getCreatureName() {
        return creatureName;
    }
    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }
}