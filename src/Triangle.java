public class Triangle {
    private String type;
    private int height;

    public Triangle(final String type) {
        this.type = type;
    }


    public Triangle(final String type,int height) {

        this.type = type;
        this.height=height;
        System.out.println("Triangle consturtor called.");
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }


//    public void setType(final String type) {
//        this.type = type;
//    }

//    public void draw( ){
//        System.out.println(this.getType()+" Triangle of height "+this.getHeight()+" Drawn.. " );
//    }
}
