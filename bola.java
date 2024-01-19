class bola extends bangunRuang{
        double r;

        @Override
        double volume(){
            double volume = 4/3 * Math.PI * r * r * r ;
            return volume;
        }
        @Override
        double luasPermukaan(){
            double luasPermukaan = 4 * Math.PI * r * r ;
            return luasPermukaan;
        }
}