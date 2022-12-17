public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    double matAVG,fizikAVG,kimyaAVG;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int matviva,int fizikviva,int kimyaviva) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        
        if (matviva >= 0 && matviva <= 100) {
            this.mat.viva = matviva;
        }

        if (fizikviva >= 0 && fizikviva <= 100) {
            this.fizik.viva = fizikviva;
        }

        if (kimyaviva >= 0 && kimyaviva <= 100) {
            this.kimya.viva = kimyaviva;
        }
        
        matAVG = (this.mat.note * .65) + (this.mat.viva * .35);
    	fizikAVG = (this.fizik.note * .8) + (this.fizik.viva * .2);
    	kimyaAVG = (this.kimya.note * .6) + (this.kimya.viva * .4);
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.2f ===> ",this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (matAVG + fizikAVG + kimyaAVG) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matAVG);
        System.out.println("Fizik Notu : " + this.fizikAVG);
        System.out.println("Kimya Notu : " + this.kimyaAVG);
    }

}
