/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author WINDOWS 11
 */
class MobilBekas extends Mobil {
    private final int tahun;
    private final double harga;
    
    public MobilBekas(String merek, String model, int tahun, double harga) {
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
}

    public int getTahun() {
        return tahun;
}

    public double getHarga() {
        return harga;
}

    @Override
    public void info() {
        System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " ("+ tahun + ")");
}

    @Override
    public String getMerek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
