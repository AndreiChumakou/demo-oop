package by.itacademy.andreichumakou.javabasics.oop;

public class DemoOOP {
    public static void main(String[] args) {
        Customer customer001 = new Customer();
        customer001.setId(123456);
        customer001.setSurname("Ivanoff");
        customer001.setName("Ivan");
        customer001.setAddress("Minsk, Park street, 177");
        customer001.setNumerAccount(345682);
        customer001.setNumberCreditCard(456274123694581L);
        System.out.println(customer001);
        System.out.println("ID: " + customer001.getId());


        Book book001 = new Book();
        book001.setTitle("Метро 2033");
        book001.setAuthors("Дмитрий Глуховский");
        book001.setPublishingHouse("АСТ");
        book001.setQuantityOfPages(384);
        book001.setPrice(35.36);
        book001.setId(10796109);
        book001.setYearOfPublishing(2019);
        System.out.println(book001);

        Book book002 = new Book();
        book002.setTitle("Дюна");
        book002.setAuthors("Фрэнк Герберт");
        book002.setPublishingHouse("АСТ");
        book002.setQuantityOfPages(704);
        book002.setPrice(29.27);
        book002.setId(10916281);
        book002.setYearOfPublishing(2020);
        System.out.println(book002);

        Book book003 = new Book();
        book003.setTitle("Позже");
        book003.setAuthors("Стивен Кинг");
        book003.setPublishingHouse("");
        book003.setQuantityOfPages(-500);
        book003.setPrice(19.77);
        book003.setId(101040785);
        book003.setYearOfPublishing(2021);
        System.out.println(book003);

        Car car001 = new Car();
        car001.setId(103703106);
        car001.setCarBrand("Opel");
        car001.setCarModel("Astra K");
        car001.setYearOfManufacture(2018);
        car001.setColor("white");
        car001.setPrice(31838.00);
        car001.setRegistrationNumber("103703106001");
        System.out.println(car001);

        Car car002 = new Car();
        car002.setId(103636245);
        car002.setCarBrand("Opel");
        car002.setCarModel("Insignia II");
        car002.setYearOfManufacture(2019);
        car002.setColor("grey");
        car002.setPrice(67830.00);
        car002.setRegistrationNumber("103636245002");
        System.out.println(car002);
        System.out.println(car002.getCarBrand());

        Car car003 = new Car();
        car003.setId(103174403);
        car003.setCarBrand("Skoda");
        car003.setCarModel("Kodiaq ");
        car003.setYearOfManufacture(-2019);
        car003.setColor("red");
        car003.setPrice(83860.00);
        car003.setRegistrationNumber("103174403003");
        System.out.println(car003);

        System.out.println("-----------");
        CarShowroom carShowroomMinsk = new CarShowroom();
        carShowroomMinsk.newCarArrival(car001);
        carShowroomMinsk.newCarArrival(car002);
        carShowroomMinsk.newCarArrival(car003);
        System.out.println(carShowroomMinsk.getListOfCarCurrent());

        carShowroomMinsk.saleCar(car002);
        System.out.println(carShowroomMinsk.getListOfCarCurrent());


    }

}
