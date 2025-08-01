public class AutomobileShowroom extends Showroom{
    private String carBrand;
    private String[] carModels= new String[10];
    private int modelCount=0;

    private static final String[][] authorizedModels= {
            {"Toyota", "2024 Camry", "2024 Corolla", "2024 GR Supra", "2023 Prius", "2023 GR86", "2023 Mirai"},
            {"Ford", "2023 Bronco", "2023 Bronco Sport", "2024 Expedition", "2024 Escape"},
            {"Mercedes-Benz", "E-Class Coupe", "EQS Sedan", "GLE Coupe", "C-Class Cabriolet"}

    };
    public AutomobileShowroom (){

    }
    public AutomobileShowroom (String name, String location , double rent, String carBrand){
        super(name,location, rent);
        this.carBrand=carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void addModel(String model) throws UnauthorizedModelException{
        boolean brandFound= false;
       boolean modelValid=false;
       for(String[] brandGroup: authorizedModels){
           if(brandGroup[0].equals(carBrand)){
               brandFound=true;
               for (int i=0;i<brandGroup.length;i++){
                   if(brandGroup[i].equals(model)){
                       modelValid=true;
                       break;
                   }
               }
           }
       }
       if(!brandFound||!modelValid){
           throw new UnauthorizedModelException(model + " is not an authorized model for " + carBrand);
       }
        for (int i = 0; i < modelCount; i++) {
            if (carModels[i].equals(model)) return;
        }
        if (modelCount < carModels.length) {
            carModels[modelCount++] = model;
        }
    }

    public double calculateYearlyRent(){
        return  super.calculateYearlyRent()+500*modelCount;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Car Brand: " + carBrand);
        System.out.print("Car Models: ");
        for (int i = 0; i < modelCount; i++) {
            System.out.print(carModels[i]);
            if (i != modelCount - 1) System.out.print(", ");
        }
        System.out.println();

    }
}
