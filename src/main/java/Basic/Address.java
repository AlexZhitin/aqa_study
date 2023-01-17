package Basic;

/*Создать класс с именем Address. В теле класса требуется создать поля: index, country, city, street, house, apartment.
Для каждого поля, создать метод с двумя методами доступа (get, set)
Создать экземпляр класса Address.
В поля экземпляра записать информацию о почтовом адресе.
Выведите на экран значения полей, описывающих адрес.*/

public class Address {

    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Index: " + getIndex() + ", " + "Country: " + getCountry() + ", " + "City: " + getCity() + ", " + "Street: " + getStreet() + ", " + "House: " + getHouse() + ", " + "Apartment: " + getApartment();
    }

    public static void main(String[] args) {

        Address a = new Address();
        a.setIndex(20200);
        a.setCountry("Ukraine");
        a.setCity("Kyiv");
        a.setStreet("Shevchenka");
        a.setHouse(20);
        a.setApartment(5);

        System.out.println(a);

    }
}
