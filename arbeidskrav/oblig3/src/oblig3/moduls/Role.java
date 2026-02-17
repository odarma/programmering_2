package oblig3.moduls;

public class Role{
    private String roleFirstName;
    private String roleLastName;
    private Person actor;

    public Role(String roleFirstName, String roleLastName, Person actor){
        setRoleFirstName(roleFirstName);
        setRoleLastName(roleLastName);
        setActor(actor);

    }

    @Override public String toString() {
        return String.format("%s %s (%s)",getRoleFirstName(), getRoleLastName(), getActor().getFullName());}

    public String getRoleFirstName() {return roleFirstName;}
    public void setRoleFirstName(String roleFirstName) {this.roleFirstName = roleFirstName;}
    public String getRoleLastName() {return roleLastName;}
    public void setRoleLastName(String roleLastName) {this.roleLastName = roleLastName;}
    public Person getActor() {return actor;}
    public void setActor(Person actor) {this.actor = actor;}
}
