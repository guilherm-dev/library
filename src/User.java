public class User {
    private String name;
    private String id;
    private String email;

    public User(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getId(){
        return id;
    }

    //Getter to name
    public String getName(){
        return name;
    }
    // Getters and Setters
    @Override
    public String toString(){
        return "User: "+name+" - ID: "+id+" - E-mail: "+email;
    }
}
