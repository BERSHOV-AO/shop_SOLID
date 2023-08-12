public class Product {
    private String name;
    private String description;
    private double prise;

    public Product(String name, String description, double prise){
        this.name = name;
        this.description = description;
        this.prise = prise;
    }


    // Пример применения принципа DRY: вынесение повторяющейся логики в отдельные методы
    // Пример применения принципа SOLID: принцип единственной ответственности,
    // каждый класс отвечает только за свою задачу
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
