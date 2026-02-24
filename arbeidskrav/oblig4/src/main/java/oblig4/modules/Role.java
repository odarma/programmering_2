package oblig4.modules;

public class Role{
    private String roleFirstName;
    private String roleLastName;
    private Actor actor;

    public Role(String roleFirstName, String roleLastName, Actor actor){
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
    public Actor getActor() {return actor;}
    public void setActor(Actor actor) {this.actor = actor;}
}
