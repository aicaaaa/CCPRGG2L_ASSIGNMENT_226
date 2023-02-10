public class App {
    public static void main(String[] args) {

        Person me = new Person();

        //System.out.println(me.name);

        // get method

        me.setName("aica");

        System.out.println(me.getName());
        
        Daughter myself = new Daughter();
        
        System.out.println(myself.surname);
    }
}
