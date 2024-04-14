public class Automobile {

    private final String Brand;
    private final String Model;
    private final String year;
    private final String hp;

    Automobile(String Brand, String Model, String year, String hp){
        this.Brand=Brand;
        this.Model=Model;
        this.year=year;
        this.hp=hp;
    }

    public void CarDetails(){
        System.out.println("Car Brand: "+ Brand);
        System.out.println("Car Model: "+ Model);
        System.out.println("Car year of manufacturing:" + year);
        System.out.println("Total Horsepower of Car: " +hp);
        System.out.println();
    }

    static class Main {
        public static void main(String[] args) {
            Automobile Porsche = new Automobile("Porsche","911 GTRS","2003","502");
            Automobile Audi = new Automobile("Audi","RSQ8","2019","600");
            Automobile BMW = new Automobile("BMW","M4","2014","473");


            Porsche.CarDetails();
            Audi.CarDetails();
            BMW.CarDetails();
        }

    }

}
