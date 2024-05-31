import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> familyTree;

    public FamilyTree() {
        this.familyTree = new ArrayList<>();
    }

    public void addHuman(Human human){
        this.familyTree.add(human);
    }

    public String findHumansByName(String name){
        ArrayList<Human> foundHumans = new ArrayList<>();
        for (Human human : familyTree) {
            if (human.getName().equalsIgnoreCase(name)) {
                foundHumans.add(human);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Results:\n");// \n -перенос строки
        for(Human human : foundHumans){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Family Tree:\n");// \n -перенос строки
        for(Human human : familyTree){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}