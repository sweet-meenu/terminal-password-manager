package model;

public class Entry{
    private String site;
    private String username;
    private String password;
  
    public Entry(String site, String username, String password) {
        this.site = site;
        this.username = username;
        this.password = password;
    }  

    public String getSite() { return site;}
    public String getUsername() { return username;}
    public String getPassword() { return password;}
    
}