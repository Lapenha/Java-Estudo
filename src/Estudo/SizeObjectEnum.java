package Estudo;

public enum SizeObjectEnum {
    SMALL, MEDIUM, LARGE, EXTRALARGE;
    public String getSize(){
        return switch (this) {
            case SMALL -> "Small"; //enchanced switch
            case MEDIUM -> "Medium";
            case LARGE -> "Large";
            case EXTRALARGE -> "Extralarge";
        };
    }
    public static void main(String [] args){
        //call getSize()
        //using the object SMALL
        System.out.println("The size of the pizza is " + SizeObjectEnum.EXTRALARGE.getSize());
    }
}
