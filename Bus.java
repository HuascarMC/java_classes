class Bus{
 private Person[] passengers;

 public Bus(int capacity) {
  this.passengers = new Person[capacity];
 }


 public int getCapacity(){
  return this.passengers.length;
 }
}
