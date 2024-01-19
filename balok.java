class balok extends bangunRuang{
        double panjang;
        double lebar;
        double tinggi;
    
        @Override
        double volume(){
            double volume = panjang * lebar * tinggi ;
            return volume;
        }
        @Override
        double luasPermukaan(){
            double luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi) ;
            return luasPermukaan;
        }
    }