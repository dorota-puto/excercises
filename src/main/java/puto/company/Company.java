package puto.company;

public class Company {


    //create an object of SingleObject
    private static Company instance = new Company();

    private Manager ceo;

    //make the constructor private so that this class cannot be
    //instantiated
    private Company() {
    }

    //Get the only object available
    public static Company getInstance() {
        return instance;
    }

    public void hireCeo(Manager ceo) {
        this.ceo = ceo;
    }

    public Manager getCeo() {
        return ceo;
    }

}
