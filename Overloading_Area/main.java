class area{
    int area(int side){

        return side*side;
    }
    int area(int length,int width) {
        return length*width;
    }
}

public class Main {
    public static void main(String[] args) {
        area multi= new area();
        System.out.println(multi.area(11));
        System.out.println(multi.area(9, 14));

    }
}
