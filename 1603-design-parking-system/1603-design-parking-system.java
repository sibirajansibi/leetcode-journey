class ParkingSystem {
      int big ;
      int med;
      int small;
    public ParkingSystem(int big, int medium, int small) {
       this.big = big;
       this.med = medium;
       this.small = small;
    }
    
    public boolean addCar(int carType) {
         if( ( carType == 1 && big == 0 ) || ( carType == 2 && med == 0 ) || ( carType == 3 && small == 0 ) ) {
            return false;
        }
        if( carType == 1){
            big--;
        }else if( carType == 2){
            med--;
        }else{
            small--;
        }
   return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */