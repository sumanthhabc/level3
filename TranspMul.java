class Bicycle {
      void dispalyFeatures() {
             System.out.println("Features: Pedals, Manual power");
      }
}

class Motorbike extends Bicycle {
      void displayFeatures() {
           super.dispalyFeatures();
           System.out.println("Added feature by Mtorbike: Engine");
     }
}

class ElectricBike extends Motorbike {
     void dispalyFeatures() {
           super.displayFeatures();
           System.out.println("New feature by Electricbike: Electric motor and battery");
     }
}

class TranspMul {
      public static void main(String args[]) {
             ElectricBike myEbike = new ElectricBike();
             myEbike.dispalyFeatures();
     }
}
