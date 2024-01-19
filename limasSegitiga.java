class limasSegitiga extends bangunRuang{
    double a;
    double lAlas;
    double t;
    double lSisiTegak;

    @Override
    double volume(){
        double volume = 1 * lAlas * t / 3 ;
        return volume;
    }
    @Override
    double luasPermukaan(){
        double luasPermukaan = lAlas + (3 * lSisiTegak);
        return luasPermukaan;
    }
}