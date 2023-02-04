public class bmwFactory implements carFactory{
    private String makerName;
    private String engine;
    private String colour;
    private String manufacturingCountry;
    private String drivetrain;
    bmwFactory(){
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
        colour c = new blackColour();
        colour = c.getColour();
    }

    @Override
    public void setManufacturingCountry() {
        country m = new countryGermany();
        manufacturingCountry = m.getCountry();
    }

    @Override
    public void setDrivetrain() {
        drivetrain d = new AWD();
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
        makerName = "BMW";
    }
    public String getMakerName(){
        return makerName;
    }
}
