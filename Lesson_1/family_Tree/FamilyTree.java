package family_tree;

import java.util.ArrayList;
import java.util.List;





public class FamilyTree {
    private long countPeople;
    private List<Human> humanList;
    
    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }
    
    public FamilyTree() {
        this(new ArrayList<>());
    }

    public boolean add(Human human){
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);
            human.setId(countPeople++);

            addToParents(human);
            addToChildren(human);

            return true;
        }
        return false;
    }

    private void addToParents(Human human) {
        for (Human parent: human.getParents()) {
            parent.addChild(human);
        }
    }
   
    private void addToChildren(Human human) {
        for (Human child: human.getChildren()) {
            child.addParent(human);
        }
    }

    public List<Human> getSiblings(intid) {
        Human human = getById(id);
        if (human == null) {
            return null;
        }
        List<Human> res = new ArrayList();
        for (Human parent: human.getParents()) {
            for (Human child: parent.getChildren()){
                if (!child.equals(human)) {
                    res.add(child);
                }
            }
        }
        return res;
    }

    public List<Human> getByName(String name) {
        List<Human> res = new ArrayList();
        for (Human human: humanList) {
            if (human.getName().equals(name)) {
                res.add(human);
            }
        }
        return res;
    }

    // TODO написать метод создания родственных связей

    


}
