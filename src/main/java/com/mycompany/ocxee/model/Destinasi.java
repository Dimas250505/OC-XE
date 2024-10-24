package com.mycompany.ocxee.model;

public class Destinasi {
    private int id_destinasi; // Jika ini adalah tipe data int
    private String nama_destinasi;
    private String kedalaman;
    private String flora;
    private String fauna;
    private String pendamping;

    // Constructor
    public Destinasi(int id_destinasi, String nama_destinasi, String kedalaman, String flora, String fauna, String pendamping) {
        this.id_destinasi = id_destinasi;
        this.nama_destinasi = nama_destinasi;
        this.kedalaman = kedalaman;
        this.flora = flora;
        this.fauna = fauna;
        this.pendamping = pendamping;
    }

    // Getter dan Setter
    public int getIdDestinasi() { // Perbaikan penamaan
        return id_destinasi;
    }

    public void setIdDestinasi(int id_destinasi) { // Perbaikan penamaan
        this.id_destinasi = id_destinasi;
    }

    public String getNamaDestinasi() { // Perbaikan penamaan
        return nama_destinasi;
    }

    public void setNamaDestinasi(String nama_destinasi) { // Perbaikan penamaan
        this.nama_destinasi = nama_destinasi;
    }

    public String getKedalaman() {
        return kedalaman;
    }

    public void setKedalaman(String kedalaman) {
        this.kedalaman = kedalaman;
    }

    public String getFlora() {
        return flora;
    }

    public void setFlora(String flora) {
        this.flora = flora;
    }

    public String getFauna() {
        return fauna;
    }

    public void setFauna(String fauna) {
        this.fauna = fauna;
    }

    public String getPendamping() {
        return pendamping;
    }

    public void setPendamping(String pendamping) {
        this.pendamping = pendamping;
    }
}