package HomeTasks;

/*Создать класс с именем Address. В теле класса требуется создать поля: index, country, city, street, house, apartment.
Для каждого поля, создать метод с двумя методами доступа (get, set)
Создать экземпляр класса Address.
В поля экземпляра записать информацию о почтовом адресе.
Выведите на экран значения полей, описывающих адрес.*/

import static java.lang.Math.PI;
import static java.lang.Math.cos;

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


    public static void main(String[] args) {
        Address a = new Address();
        a.setIndex(20200);
        System.out.println("Index: " + a.getIndex());

        a.setCountry("Ukraine");
        System.out.println("Country: " + a.getCountry());

        a.setCity("Kyiv");
        System.out.println("City: " + a.getCity());

        a.setStreet("Shevchenka");
        System.out.println("Street: " + a.getStreet());

        a.setHouse(20);
        System.out.println("House: " + a.getHouse());

        a.setApartment(5);
        System.out.println("Apartment: " + a.getApartment());
    }
}
