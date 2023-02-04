public class PCBuilder {
    private PC pc;
    public PC makeGamingPC(){
        pc = new PC();
        pc.addItem(new Ryzen5700x());
        pc.addItem(new oneTB());
        return pc;
    }

    public PC makePC1(){
        pc = new PC();
        pc.addItem(new corei5());
        pc.addItem(new oneTB());
        pc.addItem(new cpuCooler());
        return pc;
    }

    public PC makePC2(){
        pc = new PC();
        pc.addItem(new corei7());
        pc.addItem(new oneTB());
        pc.addItem(new liquidCooler());
        return pc;
    }

    public PC makePC3(){
        pc = new PC();
        pc.addItem(new corei9());
        pc.addItem(new oneTB());
        pc.addItem(new dvdDrive());
        return pc;
    }

    public PC getPC(){
        return pc;
    }
}
