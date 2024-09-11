
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

class CheckValueChange{
    public static void main(String[] args) {
        Person p = new Person("dhruv");
        String s = p.getName();
        System.out.println(s);
        s = "Singh";
        System.out.println(p.getName());
    }
}