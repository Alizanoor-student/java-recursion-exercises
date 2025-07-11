public class WrapperExample {//defines a class named WrapperExample

    public static void main(String[] args) {//this is main method where execution begins
        //boxing (primitive to wrapper objects)
        Integer num = Integer.valueOf(10);//the Integer.valueOf(10) method explicity converts the primitive 10 into an integer object(boxing)
        Double price = 99.9;//here auto boxing occurs because java automatically converts 99.9 (primitive double) into a double object
        //Unboxing (Wrapper object to primitive)
        int value = num.intValue(); //here autoboxing occurs because java converts price(which is a double object into a double)
        double cost = price;
        //display values
        System.out.println("Integer object: " + num);
        System.out.println("Unboxed int: " + value);
        System.out.println("Double object: " + price);
        System.out.println("Unboxed double: " + cost);
    }
    //Final keyword in java with primitive  types
    /*final int bonus=7;
    bonus=2;// its giving an error because ones its defined the value cannot be changed*/
    //final keyword with objects
    //When a non primitive is final,you cannot reassign it
    //final A kunal = new A(name:"kunal khuswaya";)
    // kunal.name = "Other Name";//we can do this only
    //we cannot do this
    //kunal.name= new A(name:"other name");
}


 




