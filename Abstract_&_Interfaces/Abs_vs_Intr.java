package Abtract_Interfces;
    interface Bicycle{
        int a = 8; // yeh hai properties jisee hum use krsktey hai
        // we can not modify the properties in interfaces as they are final
        void applyBrake(int decrement);
        void speedup(int increment);
        }
    interface HornBicycle{
        void blowHornKGF();
        void blowHornDdlj();
    }
        class AvonCycle implements Bicycle, HornBicycle{
            @Override
            public void applyBrake(int decrement) {
                System.out.println("Apply Brake");
            }

            @Override
            public void speedup(int increment) {
                System.out.println("Increase Speed");
            }

            @Override
            public void blowHornKGF() {
                System.out.println("Its KGF horn");
            }

            @Override
            public void blowHornDdlj() {
                System.out.println("Its DDLJ movie horn");
            }
        }

        public class Abs_vs_Intr {
            public static void main(String[] args) {
                AvonCycle cycleMayank = new AvonCycle();
                cycleMayank.applyBrake(1);
                cycleMayank.speedup(1);
                System.out.println(cycleMayank.a);
                cycleMayank.blowHornKGF();
                cycleMayank.blowHornDdlj();
            }
            }
