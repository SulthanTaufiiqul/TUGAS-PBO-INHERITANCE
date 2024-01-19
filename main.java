public class main {
    public static void main(String[] args) {

        //Membuat objek bangunRuang
        bangunRuang BangunRuang = new bangunRuang();

        //Membuat objek Bola dan mengisi nilai properti
        System.out.println("Menghitung Bola");
        bola Bola = new bola();
        Bola.r = 8;
        System.out.println("Hasil Volume : " + Bola.volume());
        System.out.println("Hasil Luas Permukaan : " + Bola.luasPermukaan());

        //Membuat objek Balok dan mengisi nilai properti
        System.out.println("Menghitung Balok");
        balok Balok = new balok();
        Balok.panjang = 15;
        Balok.lebar = 20;
        Balok.tinggi = 10;
        System.out.println("Hasil Volume : " + Balok.volume());
        System.out.println("Hasil Luas Permukaan : " + Balok.luasPermukaan());

        //Membuat objek Limas Segitiga dan mengisi nilai properti
        System.out.println("Menghitung Limas Segitiga");
        limasSegitiga LimasSegitiga = new limasSegitiga();
        LimasSegitiga.a = 15;
        LimasSegitiga.lAlas = 200;
        LimasSegitiga.t = 90;
        LimasSegitiga.lSisiTegak = 12;
        System.out.println("Hasil Volume : " + LimasSegitiga.volume()); 
        System.out.println("Hasil Luas Permukaan : " + LimasSegitiga.luasPermukaan());

        //Membuat objek Tabung dan mengisi nilai properti
        System.out.println("Menghitung Tabun");
        tabung Tabung = new tabung();
        Tabung.r = 10;
        Tabung.t = 15;
        System.out.println("Hasil Volume : " + Tabung.volume());
        System.out.println("Hasil Luas Permukaan : " + Tabung.luasPermukaan());
}
    }