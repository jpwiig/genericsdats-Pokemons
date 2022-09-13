public class Pokemon implements Comparable<Pokemon>{
    String name;
    Integer level;
    int hp;

    Pokemon(String name, int level, int hp) {
        this.hp = hp;
        this.name = name;
        this.level = level;
    }

    public int compareTo(Pokemon lommemonster1){
        //level
        int max = this.level.compareTo(lommemonster1.level);
       /* if (lommemonster1.level < level) return 1;
        if (lommemonster1.level > level) return -1;
       return 0;*/
        return max;
    }
    @Override
    public String toString() {
        return this.name + " level " + this.level + " HP " + this.hp;
    }
}
