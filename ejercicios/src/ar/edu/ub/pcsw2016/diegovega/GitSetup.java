package ar.edu.ub.pcsw2016.diegovega;


/**
 * Created by Pulpo on 06/08/2016.
 */
public class GitSetup implements IExersice {
    private String userName = "Dienry";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void run(){
        System.out.println("User name: " + this.userName);
    }
}
