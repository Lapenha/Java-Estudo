package Estudo;

public record VehicleRecord(String brand, String licensePlate) {
    public String brandLowerCase(){
        return brand.toLowerCase();
    }
}
 class VehicleRecordTeste{
    public static void main(String[] args) {
        VehicleRecord vehicle = new VehicleRecord("BMW", "12345");

        System.out.println(vehicle.licensePlate() + vehicle.brand());
        System.out.println(vehicle.brandLowerCase() + vehicle.licensePlate());
    }
}
