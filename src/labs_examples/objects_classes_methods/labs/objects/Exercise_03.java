package labs_examples.objects_classes_methods.labs.objects;

import java.util.ArrayList;

class Controller {
    public static void main(String[] args) {
        Mother mom = new Mother("Helen", 51);
        Child child1 = new Child("Peter", 27);
        Child child2 = new Child("Maryam", 22);

        mom.childrenList.add(child1);
        mom.childrenList.add(child2);
    }
}

class Mother {
    private String name;
    private int age;
    ArrayList<Child> childrenList = new ArrayList<Child>();

    public Mother(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(ArrayList<Child> childrenList) {
        this.childrenList = childrenList;
    }
}

class Child {
    private String name;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
