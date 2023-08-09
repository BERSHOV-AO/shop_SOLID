public class Product {
    private String name;
    private String description;
    private double prise;

    public Product(String name, String description, double prise){
        this.name = name;
        this.description = description;
        this.prise = prise;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public double getPrise(){
        return prise;
    }
    public void setPrise(double prise){
        this.prise = prise;
    }
}
