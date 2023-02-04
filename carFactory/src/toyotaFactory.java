public class toyotaFactory implements carFactory{
    private String makerName;
    private String engine;
    private String colour;
    private String manufacturingCountry;
    private String drivetrain;
    toyotaFactory(){
        setColour();
        setMakerName();
        setDrivetrain();
        setEngine();
        setManufacturingCountry();
    }
    @Override
    public void setEngine() {
         engine e = new hydrogenFuelEngine();
         engine = e.getEngine();
    }

    @Override
    public void setColour() {
        colour c = new redColour();
        colour = c.getColour();
    }

    @Override
    public void setManufacturingCountry() {
        country m = new countryJapan();
        manufacturingCountry = m.getCountry();
    }

    @Override
    public void setDrivetrain() {
        drivetrain d = new RWD();
        drivetrain = d.getDrivetrain();
    }
    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    @Override
    public String getDrivetrain() {
        return drivetrain;
    }
    public void setMakerName(){
        makerName = "Toyota";
    }
    public String getMakerName(){
        return makerName;
    }
}
