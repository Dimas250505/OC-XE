package com.mycompany.ocxee;

import com.mycompany.ocxee.DAO.DestinasiDAO;
import com.mycompany.ocxee.DAO.PenyelamDAO;
import com.mycompany.ocxee.DAO.PesanTiketDAO;
import com.mycompany.ocxee.view.Beranda;
import com.mycompany.ocxee.view.PenyelamView;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi DAO
        PenyelamDAO penyelamDAO = new PenyelamDAO();
        DestinasiDAO destinasiDAO = new DestinasiDAO();
        PesanTiketDAO pesanTiketDAO = new PesanTiketDAO();

        // Inisialisasi view
        PenyelamView penyelamView = new PenyelamView(penyelamDAO);

        // Menampilkan menu login
        penyelamView.showMenu();

        // Setelah login berhasil, tampilkan beranda
        Beranda beranda = new Beranda(pesanTiketDAO, destinasiDAO, penyelamDAO);
        beranda.showBeranda();
    }
}
