public class Pyramid {
    public static void main(String[] args) {
        Pyramids p1 = new Pyramids(3,  8);
        Pyramids p2 = new Pyramids(7,  16);
        Pyramids p3 = new Pyramids(10,  12);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}


class Pyramids {
    double side;
    double height;
    double volume;

    Pyramids(double sider, double hojde){
        side=sider;
        height=hojde;

    }

    double Volume(){
        volume=(side*side*height)/4;
        return volume;
    }

    @Override
    public String toString(){
        return "Pyramidens volume   "+Volume();
    }
}