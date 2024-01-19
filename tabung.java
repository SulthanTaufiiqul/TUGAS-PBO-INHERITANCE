    class tabung extends bangunRuang{
        double r;
        double t;
    
        @Override
        double volume(){
            double volume = Math.PI * r * r * t ;
            return volume;
        }
        @Override
        double luasPermukaan(){
            double luasPermukaan = 2 * Math.PI * r * (r + t);
            return luasPermukaan;
        }
    }