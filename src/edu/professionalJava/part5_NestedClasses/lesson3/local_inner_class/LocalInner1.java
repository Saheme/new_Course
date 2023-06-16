package edu.professionalJava.part5_NestedClasses.lesson3.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    private int a  = 10;

    public void getResult() {
        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int resultatdDeleniy() {
                return delimoe / delitel;
            }

            public int ostatokOtDeleniy() {
                System.out.println(a +" - a");
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(25);
        delenie.setDelitel(7);
        System.out.println(delenie.getDelimoe() + " - делимое");
        System.out.println(delenie.getDelitel() + " - делитель");
        System.out.println(delenie.resultatdDeleniy()+ " - результат деления");
        System.out.println(delenie.ostatokOtDeleniy() + " - остаток от деления");
    }
}
