public class teslaFactory implements carFactory{
    private String makerName;
    private String engine;
    private String colour;
    private String manufacturingCountry;
    private String drivetrain;
    teslaFactory(){
        setColour();
        setMakerName();
        setDrivetrain();
        setEngine();
        setManufacturingCountry();
    }
    @Override
    public void setEngine() {
        engine e = new electricEngine();
        engine = e.getEngine();
    }

    @Override
    public void setColour() {
        colour c = new whiteColour();
        colour = c.getColour();
    }

    @Override
    public void setManufacturingCountry() {
        country m = new countryUSA();
        manufacturingCountry = m.getCountry();
    }

    @Override
    public void setDrivetrain() {
        drivetrain d = new AWD();
        drivetrain = d.getDrivetrain();
    }
    public void setMakerName(){
        makerName = "Tesla";
    }
    public String getMakerName(){
        return makerName;
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
}