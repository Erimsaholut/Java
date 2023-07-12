public class Product {
    public Product(){
        System.out.println("Constructor block is working!");
    }
    public Product(int id,String name,double price){
        System.out.println("Constructor block with parameter is working!");
        this._id=id;
        this._name=name;
        this._price=price;
        // you can use both ways to value assignment methods or getter and setters
    }
    private int _id;
    private String _name;
    private String _description;
    private Double _price;
    private char _currency;
    private int _stockAmount;
    private String code;

    public int getId() {
        return _id;
    }

    // Getter
    public String getName() {
        return get_name();
    }

    public String getDescription() {
        return _description;
    }

    public String get_name() {
        return _name;
    }

    public String getCode() {
        return this._name.substring(0, 3) + _id;
    }

    public char get_currency() {
        return _currency;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }


    // Setter

    public void setId(int id) {
        //setId(int newId)   id=newId
        // this.id = id;
        _id = id;
    }

    public void setPrice(Double price) {
        _price = price;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public void set_currency(char currency) {
        this._currency = currency;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }


}
